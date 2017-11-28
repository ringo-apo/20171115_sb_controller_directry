package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/dir2")
public class Dir2Controller {

    @RequestMapping("/")
    public String hp() {
        return "dir2/index";
    }

    @RequestMapping("/index")
    public String index() {
        return "dir2/index";
    }

    @RequestMapping("/page1")
    public String page1() {
        return "dir2/page1";
    }

}
