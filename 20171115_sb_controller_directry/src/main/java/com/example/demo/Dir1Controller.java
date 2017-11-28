package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/dir1")
public class Dir1Controller {

    @RequestMapping("/")
    public String hp() {
        return "dir1/index";
    }

    @RequestMapping("/index")
    public String index() {
        return "dir1/index";
    }

    @RequestMapping("/page1")
    public String page1() {
        return "dir1/page1";
    }

}
