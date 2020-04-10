package com.example.demo.service;

import com.example.demo.mapper.CreateTableMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateTableService {

    @Autowired
    CreateTableMapper createTableMapper;


    public int DropTable(String tableName) {return createTableMapper.dropTable(tableName);}

    public int CreateTable(String tableName) {return createTableMapper.createNewTable(tableName);}
}
