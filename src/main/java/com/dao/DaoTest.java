package com.dao;

import com.entity.SysUser;
import org.nutz.dao.Dao;
import org.nutz.dao.impl.NutDao;
import org.nutz.dao.util.Daos;
import org.nutz.ioc.loader.annotation.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.activation.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/**
 * Created by clq on 2017/8/31.
 */
@Repository
public class DaoTest {
    @Autowired
    private Dao dao;


    public SysUser select() {
        return dao.fetch(SysUser.class);
    }
}
