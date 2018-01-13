package com.business;

import com.TestDaoInteface;
import com.dao.DaoTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by clq on 2017/9/5.
 */
@Service
public class TestDaoImpl implements TestDaoInteface{
    @Autowired
    private DaoTest daoTest;

    public Object select() {
        return daoTest.select();
    }

}
