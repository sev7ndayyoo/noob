package com.pingcap.noob.crud.service.impl;

import com.pingcap.noob.crud.dao.CrudMapper;
import com.pingcap.noob.crud.dao.SimpleMapper;
import com.pingcap.noob.crud.service.CrudService;
import com.pingcap.noob.crud.service.SimpleService;
import com.pingcap.noob.pojo.t1;
import com.pingcap.noob.pojo.tt1;
import org.apache.ibatis.cursor.Cursor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
//@Transactional
public class CrudServiceImpl implements CrudService {

    @Autowired
    private CrudMapper crudMapper;

    @Autowired
    private SimpleMapper simpleMapper;

    public Cursor<tt1> selectTt1() {
        return crudMapper.selectTt1();
    }

    public t1 selectT1(t1 t1o){
        return crudMapper.selectT1(t1o.getId());
    }

    public void insertT1(t1 t1o){
        crudMapper.insertT1(t1o);
    }

    public void testTransaction(){
        crudMapper.insertSimple();
        crudMapper.selectSimple();
        System.out.println("over...");
    }

    @Transactional
    public void insertSimple() {
        crudMapper.insertSimple();
    }

    @Transactional
    public t1 selectSimple(){
        return crudMapper.selectSimple();
    }

}
