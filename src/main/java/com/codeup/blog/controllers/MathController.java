package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
    @ResponseBody
    @GetMapping("/add/{number1}/and/{number2}")
    public Integer add(@PathVariable Integer number1, @PathVariable Integer number2){
        return number1 + number2;
    }

//    /subtract/3/from/10
    @ResponseBody
    @GetMapping("/subtract/{number1}/from/{number2}")
    public Integer subtract(@PathVariable Integer number1, @PathVariable Integer number2){
        return number2 - number1;
    }
//    /multiply/4/and/5

    @ResponseBody
    @GetMapping("/multiply/{number1}/and/{number2}")
    public Integer multiply(@PathVariable Integer number1, @PathVariable Integer number2){
        return number1 * number2;
    }

//    /divide/6/by/3
    @ResponseBody
    @GetMapping("/divide/{number1}/by/{number2}")
    public Integer divide(@PathVariable Integer number1, @PathVariable Integer number2){
        return number1 / number2;
    }





}
