package com.hjh.controller;/*
 *
 *   @date 2020/10/28 11:06
 *
 */

import com.hjh.entity.Employee;
import com.hjh.service.EmployeeService;
import com.hjh.util.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/hello.html")
    public String hello(){
        return "hello";
    }


    @PostMapping("/save.html")
    @ResponseBody
    public ResultEntity<String> saveEmpl(@Validated Employee employee ,BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            String message = null;
            for (FieldError fieldError : bindingResult.getFieldErrors()) {
                message = fieldError.getField();
            }
            return ResultEntity.failed(message);
        }
        employeeService.saveEmpl(employee);
        return ResultEntity.successWithoutData();
    }

}
