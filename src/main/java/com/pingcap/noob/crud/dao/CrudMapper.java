package com.pingcap.noob.crud.dao;

import com.pingcap.noob.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Mapper
@Repository
public interface CrudMapper {

    @Update("truncate table ${tableName}")
    public void TruncateTable(String tableName);

    @Insert("insert into test.user(name,age,sex) values('tidb', 5, 1)")
    public void insertCrud();

    @Delete("delete from test.user where id = 5")
    public void deleteCrud();

    @Update("update test.user set name = 'pingcap' where name = 'jim'")
    public void updateCrud();

    @Select("select id,name,age,sex from user")
    public ArrayList<User> selectCrud();

}
