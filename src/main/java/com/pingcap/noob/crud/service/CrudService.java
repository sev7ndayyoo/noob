package com.pingcap.noob.crud.service;

import com.pingcap.noob.pojo.t1;
import com.pingcap.noob.pojo.tt1;
import org.apache.ibatis.cursor.Cursor;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

public interface CrudService {

    public Cursor<tt1> selectTt1();

    @Transactional(propagation = Propagation.REQUIRED)
    public t1 selectT1(t1 t1o);

    @Transactional(propagation = Propagation.REQUIRED)
    public void insertT1(t1 t1o);

    public void testTransaction();

    @Transactional
    public void insertSimple();

    @Transactional
    public t1 selectSimple();


}
