package com.pingcap.noob.crud.dao;

import com.pingcap.noob.pojo.t1;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Mapper
@Repository
public interface SimpleMapper {

    @Insert("insert into t1 values(9,8,7)")
    public void insertSimple();

    @Select("select * from t1 where id = 9")
    public t1 selectSimple();

}
