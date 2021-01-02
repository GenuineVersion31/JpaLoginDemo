package com.leader.demo.controller;

import com.leader.demo.dao.ActivityDao;
import com.leader.demo.entity.Activity;
import com.leader.demo.entity.Detail;
import com.leader.demo.entity.User;
import com.leader.demo.entity.User1;
import com.leader.demo.service.ActivityImpl;
import com.leader.demo.service.User1ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.leader.demo.controller.UserController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class QiyeController {
    @Autowired
    User1ServiceImpl user1Service;
    @Autowired
    ActivityImpl activityService;
    public UserController userController;
    @RequestMapping("/qiye_index")
    public String qiye_index(Map<String,Object> map){
        map.put("msg", "你好！    " + userController.all.getFull_name());
        map.put("name", userController.all.getFull_name());
        map.put("school", userController.all.getSchool());
        map.put("id", userController.all.getStudent_ID());
        System.out.println(UserController.all.getFull_name());
        System.out.println(UserController.all.getStudent_ID());
        System.out.println(UserController.all.getSchool());
        return "qiye_index";
    }
    @RequestMapping("/qiye1")
    public String qiye1(Map<String,Object> map){
        map.put("msg", "你好！    " + userController.all.getFull_name());
        map.put("name", userController.all.getFull_name());
        map.put("school", userController.all.getSchool());
        map.put("id", userController.all.getStudent_ID());
        return "qiye1";
    }
    @RequestMapping("/qiye2")
    public String qiye2(Map<String,Object> map, Model model){
        map.put("msg", "你好！    " + userController.all.getFull_name());
        map.put("name", userController.all.getFull_name());
        map.put("school", userController.all.getSchool());
        map.put("id", userController.all.getStudent_ID());
        List<Map<String,Object>> resultList =new ArrayList<Map<String,Object>>();
        for(User1 user1:user1Service.findall()){
            Map<String,Object> student =new HashMap<String, Object>(){{
                put("uid",user1.getId());
                put("name",user1.getCname());
                put("phone",user1.getMobile());
                put("school",user1.getUniversity());
                put("time",user1.getCreated_date());
            }};
            resultList.add(student);
            model.addAttribute("resultList",resultList);
        }
        return "qiye2";
    }
    @RequestMapping("/qiye3")
    public String qiye3(Map<String,Object> map,Model model){
        map.put("msg", "你好！    " + userController.all.getFull_name());
        map.put("name", userController.all.getFull_name());
        map.put("school", userController.all.getSchool());
        map.put("id", userController.all.getStudent_ID());
        List<Map<String,Object>> resultList =new ArrayList<Map<String,Object>>();
        for(User1 user1:user1Service.findall()){
            Map<String,Object> student =new HashMap<String, Object>(){{
                put("uid",user1.getId());
                put("name",user1.getCname());
                put("username",user1.getUsername());
                put("pwd",user1.getPassword());

            }};
            resultList.add(student);
            model.addAttribute("resultList",resultList);
        }
        return "qiye3";
    }
    @RequestMapping("/qiye6")
    public String qiye4(Map<String,Object> map,Model model){
        map.put("msg", "你好！    " + userController.all.getFull_name());
        map.put("name", userController.all.getFull_name());
        map.put("school", userController.all.getSchool());
        map.put("id", userController.all.getStudent_ID());
        List<Map<String,Object>> resultList =new ArrayList<Map<String,Object>>();
        for(User1 user1:user1Service.findall()){
            Map<String,Object> student =new HashMap<String, Object>(){{
                put("uid",user1.getId());
                put("name",user1.getCname());
                put("username",user1.getUsername());
                put("pwd",user1.getPassword());
                put("time",user1.getCreated_date());
            }};
            resultList.add(student);
            model.addAttribute("resultList",resultList);
        }
        return "qiye6";
    }
    @RequestMapping("/qiye7")
    public String qiye7(Map<String,Object> map){
        map.put("msg", "你好！    " + userController.all.getFull_name());
        map.put("name", userController.all.getFull_name());
        map.put("school", userController.all.getSchool());
        map.put("id", userController.all.getStudent_ID());
        return "qiye7";
    }
    @RequestMapping("/qiye4")
    public String qiye6(Map<String,Object> map){
        map.put("msg", "你好！    " + userController.all.getFull_name());
        map.put("name", userController.all.getFull_name());
        map.put("school", userController.all.getSchool());
        map.put("id", userController.all.getStudent_ID());
        return "qiye4";
    }
    @RequestMapping("/qiye5")
    public String qiyeg5(Map<String,Object> map){
        map.put("msg", "你好！    " + userController.all.getFull_name());
        map.put("name", userController.all.getFull_name());
        map.put("school", userController.all.getSchool());
        map.put("id", userController.all.getStudent_ID());
        return "qiye5";
    }
//    @RequestMapping("update")
//    public String update(Map<String,Object> map, Company company){
//        System.out.println(company.getDistrict());
//        return "";
//    }
@RequestMapping("/check2")
public String check2(Map<String,Object> map,Model model,User1 user){
    map.put("msg", "你好！    " + userController.all.getFull_name());
    map.put("name", userController.all.getFull_name());
    map.put("school", userController.all.getSchool());
    map.put("id", userController.all.getStudent_ID());
    List<Map<String,Object>> resultList =new ArrayList<Map<String,Object>>();
    for(User1 user1:user1Service.finduniversity(user.getUniversity())){
        Map<String,Object> student =new HashMap<String, Object>(){{
            put("id",user1.getId());
            put("name",user1.getCname());
            put("university",user1.getUniversity());
            put("phone",user1.getMobile());
            put("email",user1.getEmail());
        }};
        resultList.add(student);
        model.addAttribute("resultList",resultList);
    }
    return "check2";
}
}
