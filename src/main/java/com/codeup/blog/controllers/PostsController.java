package com.codeup.blog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostsController {

        @GetMapping("/posts")
        @ResponseBody
        public String posts() {
            return "posts index page!";
        }


    @GetMapping("/posts/{id}")
    @ResponseBody
    public String postsId(@PathVariable int id) {
        return "View an individual post " + id + ".";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String postsCreateForm() {
        return "view the form for creating a post";
}
    @PostMapping("/posts/create")
    @ResponseBody
    public String postsCreate() {
        return "create a new post";
    }

}
