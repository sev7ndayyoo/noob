package com.pingcap.noob.crud.service.impl;

import com.pingcap.noob.crud.dao.CrudMapper;
import com.pingcap.noob.crud.service.CrudService;
import com.pingcap.noob.pojo.t11;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CrudServiceImpl implements CrudService {
    @Autowired
    private CrudMapper crudMapper;

    public ArrayList<t11> selectT11(){
        return crudMapper.selectT11();
    }

}
