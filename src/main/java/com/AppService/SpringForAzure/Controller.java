package com.AppService.SpringForAzure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class Controller {

    @GetMapping(path = "/getresponse")
    public String getResponse(){
        return "Hello, this the first spring application";
    }

}
