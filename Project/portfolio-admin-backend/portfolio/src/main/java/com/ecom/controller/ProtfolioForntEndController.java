package com.ecom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProtfolioForntEndController {

    @GetMapping("/admin/")
    public String greeting() {
        //model.addAttribute("name", name);
        return "index";
    }
}
