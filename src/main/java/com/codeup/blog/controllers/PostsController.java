
package com.codeup.blog.controllers;

import com.codeup.blog.models.Post;
import com.codeup.blog.models.User;
import com.codeup.blog.repositories.PostRepository;
import com.codeup.blog.repositories.UsersRepository;
import com.codeup.blog.services.PostSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PostsController {
    private final PostSvc service;
    private final UsersRepository usersDao;
//    private final PostRepository postDao;



    // Constructor injection
    @Autowired
    public PostsController(PostSvc service, UsersRepository usersDao) {
        this.service = service;
        this.usersDao = usersDao;
    }

    @GetMapping("/posts")
    public String showAll(Model vModel) {
//        List<Post> = service.findAll();
        vModel.addAttribute("posts", service.findAll());
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String showPost(@PathVariable int id, Model vModel){
        vModel.addAttribute("post", service.findById(id));
        return "posts/show";
    }

    @GetMapping("/posts/create")
    public String showCreateForm(Model vModel){
        vModel.addAttribute("post", new Post());
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String createPost(@ModelAttribute Post post){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        post.setUser(user);
        service.savePosts(post);
        return "redirect:/posts";
    }

    @GetMapping("/posts/{id}/edit")
    public String showEditForm(Model vModel, @PathVariable long id){
//        vModel.addAttribute("post", service.findById(id));
////        service.savePosts(existingPost);
//        return "posts/edit";
        Post existingPost = service.findById(id);
        vModel.addAttribute("post", existingPost);
        return "posts/edit";

    }

    @PostMapping("/posts/{id}/edit")
    public String updatePost(@PathVariable long id, @ModelAttribute Post post) {
//        Post existingPost = service.findById(id);
//        existingPost.setTitle(existingPost.getTitle());
//        existingPost.setBody(existingPost.getBody());
//        service.savePosts(post);
//        return "redirect:/posts/" + post.getId();
        post.setId(id);
        service.savePosts(post);
        return "redirect:/posts/" + post.getId();
    }

    @PostMapping("/posts/{id}/delete")
    public String removeFromExistence(@PathVariable long id) {
        service.delete(id);
        return "redirect:/posts";
    }



}
