package com.zc.cat.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 打印程序信息接口
 * Created by zengc on 2017/10/21.
 */
@RestController
public class AppInfoController {
    @RequestMapping(value = "/info")
    public Object showAPPInfo(){
        Map<String,Object> infoMap=new HashMap<>();
        infoMap.put("currentVersion","1.0");
        return infoMap;
    }
}
