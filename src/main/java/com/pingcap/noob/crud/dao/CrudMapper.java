package com.pingcap.noob.crud.dao;

import com.pingcap.noob.pojo.t1;
import com.pingcap.noob.pojo.tt1;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.cursor.Cursor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Mapper
@Repository
public interface CrudMapper {

    @Select("select * from tt1")
    public Cursor<tt1> selectTt1();

    @Select("select * from t1 where id = #{id}")
    public t1 selectT1(int id);

    @Insert("insert into t1 values(#{id},#{c1},#{c2})")
    public void insertT1(t1 t1o);

}
