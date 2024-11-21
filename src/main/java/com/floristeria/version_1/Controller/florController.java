package com.floristeria.version_1.Controller;

import java.util.List;
import com.floristeria.version_1.model.Flores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.floristeria.version_1.service.FlorService;

@Controller
@RequestMapping("/flor")
public class florController {
    
    @Autowired
    private FlorService florService;
    @GetMapping("/listar")
    public String listarTodo(Model model) {
        model.addAttribute("flores", florService.listarTodo());
        return "details";
    }
}
