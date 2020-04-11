package com.example.demo.controller;


import com.example.demo.service.CreateTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/create")
public class CreateTableController {

    @Autowired
    private CreateTableService createTableService;
    @RequestMapping("createtable/{tableName}")
    public int CreateTable(@PathVariable String tableName){
        return createTableService.CreateTable(tableName);
    }
    @RequestMapping("droptable/{tableName}")
    public int DropTable(@PathVariable String tableName){
        return createTableService.DropTable(tableName);
    }

}
