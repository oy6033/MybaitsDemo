package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface CreateTableMapper {

    int createNewTable(@Param("tableName")String tableName);

    int dropTable(@Param("tableName")String tableName);

}
