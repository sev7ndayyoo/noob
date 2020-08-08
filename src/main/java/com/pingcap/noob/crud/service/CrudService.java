package com.pingcap.noob.crud.service;

import com.pingcap.noob.pojo.User;

import java.util.ArrayList;

public interface CrudService {

    public void insertCrud();

    public void updateCrud();

    public void deleteCrud();

    public ArrayList<User> selectCrud();

}
