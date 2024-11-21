package com.floristeria.version_1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/")
public class Index {
    
    public String Home() {
        return "index"; 
    }
}
    

