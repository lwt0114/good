package com.mvc.action;


import com.mvc.bean.Student;
import com.mvc.entity.Dept;
import com.mvc.feignclient.DeptClient;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ConsumerAction {
    /* @Autowired
     private RocketMQTemplate rocketMQTemplate;*/
   /*
    @Value("${mq.order.topic}")
    private String topic;
    @Value("${mq.order.tag.cancel}")
    private  String tag;*/
   @Resource
   RestTemplate restTemplate;
    @Resource
    DeptClient deptClient;

/*    @GetMapping("/alldepts")
    public List<Dept> findAll() throws InterruptedException, RemotingException, MQClientException, MQBrokerException {
      //  Message message=new Message(topic,tag,"halloword".getBytes());
        //this.rocketMQTemplate.getProducer().send(message);
       *//* List list = restTemplate.getForObject("http://localhost:8001/alldepts", List.class);*//*
        List list = restTemplate.getForObject("http://PROVIDER/alldepts", List.class);
        return list;
    }*/



    @GetMapping("/feignalldepts")
    public List deps(){
        return deptClient.findAll();
    }


    @GetMapping("/say")
    public String say(){
        return deptClient.sayHello("hello");
    }

    @GetMapping("save")
    public String save(){
        Student student = new Student();
        student.setStuname("张三");
        student.setStuaddress("建安");
      return   deptClient.saveStudent(student);
    }
}
