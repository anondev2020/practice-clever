package com.anondev.practiceclever.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpServletRequest;

@Controller
public class AppErrorController implements ErrorController{

    @GetMapping("/error")
    String getErrorData (HttpServletRequest request, Model model){
        Integer errorCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        model.addAttribute("errorCode",errorCode);
        return "error";
    }
    
    @Override
    public String getErrorPath() {
        return "/error";
    }
}
