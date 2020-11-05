package com.pingcap.noob.crud.service.impl;

import com.pingcap.noob.crud.dao.SimpleMapper;
import com.pingcap.noob.pojo.t1;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SimpleServiceImpl {

    private SimpleMapper simpleMapper;

    @Transactional
    public void insertSimple() {
        simpleMapper.insertSimple();
    }

    @Transactional
    public t1 selectSimple(){
        return simpleMapper.selectSimple();
    }
}
