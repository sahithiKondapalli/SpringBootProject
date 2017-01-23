package com.javarticle.spring.rest;

import java.util.Collection;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTControllerExample {
    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public Employee getEmployeeNames(@RequestParam(value="data",defaultValue="01")  String userId) {
    	System.out.println("userId"+userId);
        return EmployeeSource.getEmployee(userId);
    }
    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public int getEmployeeCount() {
    	
        return EmployeeSource.getEmployeeCount();
    }

}
