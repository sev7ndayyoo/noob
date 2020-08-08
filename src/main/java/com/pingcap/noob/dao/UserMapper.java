package com.pingcap.noob.dao;

import com.pingcap.noob.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    @Select("select id,name,age from user where id = #{id}")
    public User selectUserById(int id);
}
