package com.xin.fa.bao.server.dao;

import com.xin.fa.bao.server.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by scnyig on 2018/6/19.
 */
@Mapper
public interface EmployeeMapper {
    Employee findEmployeeById(Long id);

    List<Employee> findAllEmployee();

    void insertEmployee(Employee consumer);

    void updateEmployee(Employee consumer);
}
