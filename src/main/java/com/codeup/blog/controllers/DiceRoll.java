package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DiceRoll {
    private int random(int min, int max){
        return(int) Math.floor(Math.random() * (max - min + 1) + min);
    }

    @GetMapping("/roll-dice")
    public String home (){
        return "diceRoll";
    }
    @GetMapping("/roll-dice/{guess}")
    public String roll (@PathVariable int guess, Model model){
        int roll = random(1,6);

        model.addAttribute("roll", roll);
        model.addAttribute("guess", guess);
        model.addAttribute("correctGuess", roll == guess);
        return "diceRoll";
    }

//    @GetMapping("/roll-dice/n")
//    public String numberGuessed (){
//        return "This is a test";
//    }


}
