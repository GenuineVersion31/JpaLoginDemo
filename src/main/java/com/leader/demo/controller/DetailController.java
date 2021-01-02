package com.leader.demo.controller;

import com.leader.demo.entity.Detail;
import com.leader.demo.entity.User;
import com.leader.demo.service.DetailServiceImpl;
import com.leader.demo.service.UserServiceImpl;
import org.omg.Dynamic.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;
@Controller
public class DetailController {
    @RequestMapping("/Sign_up")
    public String Sign_up(){return "Sign_up";}
    @Autowired
    DetailServiceImpl detailService;
    @Autowired
    UserServiceImpl userService;
    public String school;
    public Detail detail;
    public static String usn="";
    public static String pwd="";
    public String email="";
    public String full_name="";
    public String category="";
    public String student_ID="";
    public User user;
    @RequestMapping("doFirst")
    public String doTest(User user1,Detail detail1){
        userService.insertUser(user1);
        email=detail1.getEmail();
        System.out.println(email);
        return "redirect:http://localhost:8080/login";
    }
    @RequestMapping("doNext")
    public String doNext(Detail detail1){
        System.out.println(detail1.getFull_name()+detail1.getStudent_ID()+detail1.getCategory()+detail1.getSchool());
        userService.insertUser(user);
        detailService.insert(detail1);
        return "redirect:http://localhost:8080/login";
    }
    @RequestMapping("/Sign_up_2")
    public String Sign_up_2(){return "Sign_up_2";}
    @RequestMapping("/List")
    public List<Detail> list(){
        List<Detail> detailListetail = detailService.FindAll();
        return detailListetail;
    }
}
