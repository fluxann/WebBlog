package com.ua.forum.blog.controllers;

import com.ua.forum.blog.models.Article;
import com.ua.forum.blog.models.Comment;
import com.ua.forum.blog.repo.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CommentController {

    @Autowired
    private CommentRepository commentRepository;

    @GetMapping("/discussion/ui")
    public String addComent(Model model){
        return "discussion1";
    }

    @PostMapping("/discussion/ui")
    public String addComentsTitle(String title, Model model){
        Comment comment = new Comment();
       // List<Article> byTitle = commentRepository.findByTitleContaining(title);
       // model.addAttribute("foundArticle", byTitle);
        return "discussion1";
    }
}
