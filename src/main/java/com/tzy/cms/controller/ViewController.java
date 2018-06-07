package com.tzy.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lipu@csii.com.cn
 */
@Controller
public class ViewController {
    @RequestMapping
    public String hello(){
        return "hello";
    }
}
