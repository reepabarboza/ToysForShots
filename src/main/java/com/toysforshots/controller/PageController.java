package com.toysforshots.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pradeep on 02-06-2016.
 */
@Controller
@RequestMapping("/post")
public class PageController {

    /*@RequestMapping("/")
    public Model helloWorld(Model model) {
        model.addAttribute("static/libs.html");
        model.addAttribute("msg", "Welcome");
        return model;
    }*/

    @RequestMapping(value ="/", method= RequestMethod.GET)
    public String post(Model model) {
        model.addAttribute("greeting", "hello");
        return "views/test/list";
    }
}
