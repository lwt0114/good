package com.mvc.action;

import com.mvc.bean.Student;
import com.mvc.entity.Dept;
import com.mvc.mapper.DeptMapper;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;

@RestController
public class DeptAction {
    @Resource
    DeptMapper deptMapper;

    @HystrixCommand(fallbackMethod = "fallback")
    @GetMapping("/alldepts")
    public List findAll() {
        String str =null;
        int i=str.length();
        System.out.println("8001===");
        return deptMapper.findAll();
    }
    public List fallback(){
        ArrayList list = new ArrayList<>();
       list.add("小伙子，这不是你能解决的bug");
        return list;
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
