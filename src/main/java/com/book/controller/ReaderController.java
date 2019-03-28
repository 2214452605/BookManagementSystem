package com.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class ReaderController {

    @RequestMapping("/toLogin")
    public String index() {
        return "user/Login";
    }
}
