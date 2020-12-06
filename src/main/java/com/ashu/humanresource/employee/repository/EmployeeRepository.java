package com.ashu.humanresource.employee.repository;

import com.ashu.humanresource.employee.models.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Suriyanarayanan K
 * on 06/12/20 8:09 PM.
 */
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, String>, PagingAndSortingRepository<EmployeeEntity, String> {

}
