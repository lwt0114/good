package com.mvc.feignclient;

import com.mvc.bean.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient("PROVIDER")
public interface DeptClient {
    @GetMapping("/alldepts")
    public List findAll();

    @PostMapping("sayhello")
    public String sayHello( String name);

    @PostMapping("savestudent")
    public String saveStudent(Student student);
}
