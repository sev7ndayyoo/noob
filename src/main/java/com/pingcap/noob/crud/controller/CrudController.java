package com.pingcap.noob.crud.controller;

import com.pingcap.noob.crud.service.CrudService;
import com.pingcap.noob.pojo.t11;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
@ResponseBody
public class CrudController {
    @Autowired
    private CrudService crudService;

    @RequestMapping(value = "/crud")
    public void crud() {
        ArrayList<t11> t11ArrayList = crudService.selectT11();
        for (int i = 0; i < t11ArrayList.size(); i++) {
            System.out.println(t11ArrayList.get(i).getC1());
        }
    }
}
