package com.api.remembermenotebooks.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/v1/notebooks")
public class NotebooksController {

    @GetMapping()
    public String hello(){
        return "Hello from notebooks";
    }
}
