package com.moon.si.happyvalley.controller;

import com.moon.si.happyvalley.service.HappyValleyService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by ZeYu
 * Date: 2017/2/7.
 * Time: 14:51.
 * DESC: say something
 */
@Controller
@RequestMapping("/happyValley")
public class HappyValleyController {
    private static final Log logger = LogFactory.getLog(HappyValleyController.class);

    @Resource
    private HappyValleyService service;

    @RequestMapping("/test")
    public String test(){
        service.findList();
        return "itemList";
    }

}
