package com.ashu.humanresource.employee.repository;

import com.ashu.humanresource.employee.entity.DesignationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by Suriyanarayanan K
 * on 08/12/20 10:30 PM.
 */
@Repository
public interface DesignationRepository extends JpaRepository<DesignationEntity, Long>, PagingAndSortingRepository<DesignationEntity, Long> {
}
