package com.pingcap.noob.crud.service.impl;

import com.pingcap.noob.crud.dao.CrudMapper;
import com.pingcap.noob.crud.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrudServiceImpl implements CrudService {

    @Autowired
    private CrudMapper crudMapper;

    public void insertCrud(){
        crudMapper.insertCrud();
    }

    public void updateCrud(){
        crudMapper.updateCrud();
    }

    public void deleteCrud(){
        crudMapper.deleteCrud();
    }


}
