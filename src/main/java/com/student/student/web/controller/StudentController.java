package com.student.student.web.controller;

import com.student.student.bean.Person;
import com.student.student.bean.Student;
import com.student.student.util.Message;
import com.student.student.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.Date;

@RestController

@Api(description = "学生控制器")
public class StudentController {

    //新增或修改 @postmapping
    //删除或查询 @getmapping
    @PostMapping("/add")
    @ApiOperation(value = "添加学生")

    public Message add(Student student){

//        Date date = new Date();
//        Message<String> message = new Message();
//        message.setTime(date.getTime());//Long类型
//        message.setStatus(200);
//        message.setMessage("success");
//        message.setData("添加成功");

        return MessageUtil.success("添加学生成功");

    }

    @GetMapping("/delete")
    @ApiOperation(value = "删除学生")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "stuId",value = "学号",paramType = "query",dataType = "int",required = true),
            @ApiImplicitParam(name = "stuName",value = "学生姓名",paramType = "query",dataType = "int")
    })
    public Message delete(int stuId,String stuName){
//        Message<String> message = new Message<>();
//        message.setStatus(200);
//        message.setMessage("success");
//        message.setData("添加成功");
        return MessageUtil.success("删除学生成功");
    }

//    @GetMapping("/add")
//
//    public String add(Person person){
//        System.out.println(person);
//        System.out.println("添加成功");
//        return "添加成功";
//    }
//
////    @GetMapping("/suc")
////    public String add(){
////        return "添加成功";
////    }
}
