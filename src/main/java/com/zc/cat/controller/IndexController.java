package com.zc.cat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zengc on 2017/10/22.
 */
@Controller
public class IndexController {
    @RequestMapping(value = {"/index","/*"})
    public static String toIndexPage(Model model){
        model.addAttribute("name","hello");
        return "index";
    }
}
