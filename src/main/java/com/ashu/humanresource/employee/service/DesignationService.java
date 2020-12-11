package com.ashu.humanresource.employee.service;

import com.ashu.humanresource.employee.bean.response.DesignationRequestBean;
import com.ashu.humanresource.employee.entity.DesignationEntity;
import com.ashu.humanresource.employee.repository.DesignationRepository;
import com.ashu.humanresource.mapper_utils.MapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Suriyanarayanan K
 * on 08/12/20 10:30 PM.
 */
@Service
public class DesignationService {
    @Autowired
    private DesignationRepository designationRepository;
    @Autowired
    private MapperUtils mapperUtils;

    public void saveDesignationEntity(DesignationRequestBean designationRequestBean) {

        DesignationEntity designationEntity = new DesignationEntity();
        designationEntity.setDesignationName(designationRequestBean.getDesignationName());
        if(designationRequestBean.getParent()!=null){
            DesignationRequestBean parent=designationRequestBean.getParent();
            DesignationEntity parentDestinationEntity=new DesignationEntity();
            parentDestinationEntity.setId(parent.getId());
            parentDestinationEntity.setDesignationName(parent.getDesignationName());
            designationEntity.setParent(parentDestinationEntity);
        }
        designationRepository.save(designationEntity);
    }

    public DesignationRequestBean getAllDetails(Long id) {
        Optional<DesignationEntity> designationEntity=designationRepository.findById(id);
        if(!designationEntity.isPresent()){
            return DesignationRequestBean.builder().build();
        }else{
            return mapperUtils.map(designationEntity.get(),DesignationRequestBean.class);
        }
    }

    private Function<DesignationEntity, Set<DesignationRequestBean>> findSiblings=person -> person.getParent().getChildren().stream().map(child -> mapperUtils.map(child,DesignationRequestBean.class)).collect(Collectors.toSet());

    public ResponseEntity<Set<DesignationRequestBean>> getAllSiblings(Long id) {


        return designationRepository.findById(id).map(findSiblings).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

}
