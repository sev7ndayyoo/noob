package com.pingcap.noob.crud.controller;

import com.pingcap.noob.crud.service.CrudService;
import com.pingcap.noob.pojo.t1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Iterator;

@Controller
@ResponseBody
@EnableTransactionManagement
public class CrudController {

    @Autowired
    private CrudService crudService;

    @RequestMapping(value = "/crud")
    public void crud() {
//        for (int i = 1; i <= 1; i++) {
//            t1 t1o = new t1();
//            t1o.setId(i);
//            t1o.setC1(1);
//            t1o.setC2(2);
//            insertAndSelect(t1o);
//        }
        crudService.testTransaction();
    }

    public void insertAndSelect(t1 t1o) {
        crudService.insertT1(t1o);
        crudService.selectT1(t1o);
    }
}
