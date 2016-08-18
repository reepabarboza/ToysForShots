package com.toysforshots.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pradeep on 06-06-2016.
 */
@RestController
@RequestMapping("/posts")
public class PostController {

    @RequestMapping(value ="/", method= RequestMethod.GET)
    public String post(Model model) {
        model.addAttribute("greeting", "hello");
        return "views/list";
    }
}
