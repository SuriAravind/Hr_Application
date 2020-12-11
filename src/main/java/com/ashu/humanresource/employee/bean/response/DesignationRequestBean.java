package com.ashu.humanresource.employee.bean.response;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;


import java.util.Set;

/**
 * Created by Suriyanarayanan K
 * on 08/12/20 10:32 PM.
 */
@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties({"hibernate_lazy_initializer", "handler"})
public class DesignationRequestBean {
    private Long id;
    private String designationName;
    private DesignationRequestBean parent;
    private Set<DesignationRequestBean> children;
}
