package com.pingcap.noob.crud.dao;

import com.pingcap.noob.pojo.t11;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Mapper
@Repository
public interface CrudMapper {

    @Select("select * from t11")
    public ArrayList<t11> selectT11();

}
