package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

/**
 * Created by clq on 2017/8/23.
 */
@Controller
@RequestMapping("/admin/public")
public class MenuController {

    @RequestMapping("list")
    @ResponseBody
    public Object menulist() {
        return new ArrayList();
    }
}
