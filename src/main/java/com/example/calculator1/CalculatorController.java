package com.example.calculator1;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CalculatorController {

    Calculator c = new Calculator();


    @RequestMapping("/sum")
    public int sum(@RequestParam int a, @RequestParam int b) {
        return c.sum(a, b);
    }

}

