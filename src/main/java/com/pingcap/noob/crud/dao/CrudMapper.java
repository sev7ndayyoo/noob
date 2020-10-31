package com.pingcap.noob.crud.dao;

import com.pingcap.noob.pojo.tt1;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Mapper
@Repository
public interface CrudMapper {

    @Select("select * from tt1")
//    @Options(fetchSize = Integer.MIN_VALUE)
    public ArrayList<tt1> selectTt1();

}
