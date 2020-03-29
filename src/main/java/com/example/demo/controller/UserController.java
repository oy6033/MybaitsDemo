package com.example.demo.controller;


import com.example.demo.service.CreateTableService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testBoot")
public class UserController {


    @Autowired
    private UserService userService;
    @Autowired
    private CreateTableService createTableService;

    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable String id){
        return userService.Sel(id).toString();
    }

    @RequestMapping("getCount")
    public int GetCount(){
        return userService.Count();
    }

    @RequestMapping("createTable/{tableName}")
    public int CreateTable(@PathVariable String tableName){
        return createTableService.CreateTable(tableName);
    }



}
