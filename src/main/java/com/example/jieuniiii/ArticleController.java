package com.example.jieuniiii;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticleController {
    @GetMapping("articles/new")
    public String article(){
        return "article/new";
    }
}
