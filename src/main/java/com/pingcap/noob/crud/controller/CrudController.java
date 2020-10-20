package com.pingcap.noob.crud.controller;

import com.pingcap.noob.crud.service.CrudService;
import com.pingcap.noob.pojo.tt1;
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
        ArrayList<tt1> tt1ArrayList = crudService.selectTt1();
        for (int i = 0; i < tt1ArrayList.size(); i++) {
            System.out.println(tt1ArrayList.get(i).getC1());
        }
    }
}
