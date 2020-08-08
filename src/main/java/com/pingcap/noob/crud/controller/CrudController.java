package com.pingcap.noob.crud.controller;

import com.pingcap.noob.crud.service.CrudService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class CrudController {

    @Autowired
    private CrudService crudService;

    private static final Logger LOG = LoggerFactory.getLogger(CrudController.class);

    @RequestMapping(value = "/crud")
    public void startCrudTest() {
        LOG.info("crud operation start");
        LOG.info("insert into test.user(name,age,sex) values('tidb', 5, 1)");
        crudService.insertCrud();
        LOG.info("update test.user set name = 'pingcap' where id = 1");
        crudService.updateCrud();
        LOG.info("delete from test.user where id = 5");
        crudService.deleteCrud();
        LOG.info("crud operation finish");
    }


}
