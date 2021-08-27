package com.mvc.action;

import com.mvc.bean.Student;
import com.mvc.entity.Dept;

import com.mvc.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class DeptAction {
    @Autowired
    DeptMapper deptMapper;

    @GetMapping("/alldepts")
    public List<Dept> findAll() {
        System.out.println("8001===");
        return deptMapper.findAll();
    }

@PostMapping("/sayhello")
public String sayHello(@RequestBody String name){
        return "hello"+name;
    }

    @PostMapping("savestudent")
    public String saveStident(@RequestBody Student student){
        System.out.println(student.getStuname());
        System.out.println(student.getStuaddress());
    return "succes";
    }
        }
