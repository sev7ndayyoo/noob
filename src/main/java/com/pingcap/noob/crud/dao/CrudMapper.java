package com.pingcap.noob.crud.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CrudMapper {

    @Update("truncate table ${tableName}")
    public void TruncateTable(String tableName);

    @Insert("insert into test.user(name,age,sex) values('tidb', 5, 1)")
    public void insertCrud();

    @Update("update test.user set name = 'pingcap' where name = 'jim'")
    public void updateCrud();

    @Delete("delete from test.user where id = 5")
    public void deleteCrud();

}
