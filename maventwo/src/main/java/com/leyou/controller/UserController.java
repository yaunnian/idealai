package com.leyou.controller;

import com.leyou.pojo.User;
import com.leyou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService service;
    @RequestMapping("hello")
    public @ResponseBody
    String sayHello(){
        System.out.println("wdnmd");
        return "success";
    }
 /*   @GetMapping("queryOne/{id}")
    public User queryUserById(@PathVariable("id") Long i,Model model){

           User user= service.queryUserById(i);
            model.addAttribute("user",user);
            return "update";
    }*/
    @GetMapping("del/{id}")
    public @ResponseBody String deleteById(@PathVariable("id") Long ids){
        service.deleteById(ids);
        return "redirect:user/list";
    }
    @GetMapping("list")
    public String queryAllUser(Model model){
        List<User> users = service.queryAllUser();
        model.addAttribute("users",users);
        return "user";
    }
}
