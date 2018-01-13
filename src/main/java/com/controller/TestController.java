package com.controller;

import com.TestDaoInteface;
import com.entity.SysUser;
import com.log.annotation.LogMethod;
import com.log.config.EnableMethodLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by clq on 2017/8/23.
 */
@Controller
@RequestMapping("/admin/public")
@EnableMethodLog
public class TestController {

    @Autowired
    private TestDaoInteface testDaoInteface;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    @LogMethod
    public Object test(SysUser string){
        Object select = testDaoInteface.select();
       // throw new IllegalArgumentException("参数非法 ");
        return select;
    }

    @RequestMapping(value = "/test1", method = RequestMethod.POST)
    @ResponseBody
    public Object test2(@RequestBody SysUser string){
        Object select = testDaoInteface.select();
       // throw new IllegalArgumentException("参数非法 ");
        return select;
    }
}
