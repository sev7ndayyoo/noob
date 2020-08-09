package com.pingcap.noob.crud.controller;

import com.pingcap.noob.crud.service.CrudService;
import com.pingcap.noob.pojo.config.DataSourceConfig;
import com.pingcap.noob.utils.JdbcUtil;
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
        LOG.info("#####################################################");
        crudService.insertCrud();
        crudService.deleteCrud();
        crudService.updateCrud();
        crudService.selectCrud();
        LOG.info("#####################################################");
    }


}
