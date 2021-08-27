package com.mvc.action;

import com.mvc.entity.Dept;
import com.mvc.mapper.DeptMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DeptAction {
    @Resource
    DeptMapper deptMapper;

    @GetMapping("/alldepts")
    public List<Dept> findAll()
    {
        System.out.println("8001===");
        return deptMapper.findAll();
    }
}
