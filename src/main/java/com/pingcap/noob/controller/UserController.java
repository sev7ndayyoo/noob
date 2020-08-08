package com.pingcap.noob.controller;

import com.pingcap.noob.pojo.User;
import com.pingcap.noob.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/find/{id}")
    public String findPersonById(@PathVariable("id")int id) {
        User user = userService.selectUserById(id);
        return "id = " + user.getId() + " | name = " + user.getName();
    }
}
