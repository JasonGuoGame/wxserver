package com.xin.fa.bao.server.service;

import com.xin.fa.bao.server.dao.EmployeeMapper;
import com.xin.fa.bao.server.dto.EmployeeDTO;
import com.xin.fa.bao.server.entity.Employee;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by scnyig on 2018/6/19.
 */
@Service
public class EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    public List<EmployeeDTO> getAllEmployee() {
        List<Employee> allEmployee = employeeMapper.findAllEmployee();
        List<EmployeeDTO> employeeDTOs = new ArrayList<EmployeeDTO>(allEmployee.size());
        EmployeeDTO employeeDTO;
        for (Employee employee: allEmployee) {
            employeeDTO = new EmployeeDTO();
            BeanUtils.copyProperties(employee,employeeDTO);
            employeeDTOs.add(employeeDTO);
        }

        return employeeDTOs;
    }
}
