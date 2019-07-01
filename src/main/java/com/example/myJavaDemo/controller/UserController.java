package com.example.myJavaDemo.controller;

import com.example.myJavaDemo.model.Post;
import com.example.myJavaDemo.model.User;
import com.example.myJavaDemo.repository.UserRepository;
import com.example.myJavaDemo.utility.JSONPlaceHolderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    JSONPlaceHolderClient jsonPlaceHolderClient;

    @GetMapping(value = "/user")
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @GetMapping(value = "/post")
    public List<Post> getAllPost() {
        return jsonPlaceHolderClient.getPosts();
    }

    @GetMapping(value = "/post/{postId}")
    public Post getPostById(@PathVariable("postId") Long postId) {
        return jsonPlaceHolderClient.getPostsById(postId);
    }

}
