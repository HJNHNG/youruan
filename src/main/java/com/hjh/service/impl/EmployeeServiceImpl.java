package com.hjh.service.impl;/*
 *
 *   @date 2020/10/28 11:07
 *
 */

import com.hjh.entity.Employee;
import com.hjh.mapper.EmployeeMapper;
import com.hjh.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public void saveEmpl(Employee employee) {
        employeeMapper.insertSelective(employee);
    }
}
