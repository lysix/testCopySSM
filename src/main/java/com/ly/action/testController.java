package com.ly.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class testController {

    @RequestMapping("/testSSM.action")
    @ResponseBody
    public String test(String name) {
        System.out.println(name);
        return name;
    }
}
