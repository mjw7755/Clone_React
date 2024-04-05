package org.com.clone_react.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class MainController {

    @GetMapping("/mainPage")
    public String mainPage() {
        System.out.print("asdasd");
        return "test";
    }
}
