package com.dam.controller;

import com.dam.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by woodam on 2016. 10. 23..
 */
@Controller
public class TestController {
    @Autowired
    TestService testService;

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String test(Model model){
        model.addAttribute("foo", testService.getText() );
        return "test";
    }
}
