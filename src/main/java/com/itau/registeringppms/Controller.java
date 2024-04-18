package com.itau.registeringppms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/registering/v1")
public class Controller {

    @GetMapping("/home")
    public String testing(){
        return "debug";
    }


}
