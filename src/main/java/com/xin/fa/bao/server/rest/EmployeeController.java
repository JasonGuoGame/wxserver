package com.xin.fa.bao.server.rest;

import com.xin.fa.bao.server.dto.EmployeeDTO;
import com.xin.fa.bao.server.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by scnyig on 2018/6/20.
 */
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public ResponseEntity<List> getAllEmployees() {
        List<EmployeeDTO> allEmployee = employeeService.getAllEmployee();
        return ResponseEntity.ok(allEmployee);
    }
}
