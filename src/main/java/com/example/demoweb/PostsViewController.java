package com.example.demoweb;

import com.example.demoweb.models.Post;
import com.example.demoweb.service.LikesService;
import com.example.demoweb.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PostsViewController {

    @Autowired
    private PostService postService;
    @Autowired
    private LikesService likesService;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String list(Model model) {
        Iterable<Post> posts = postService.listAllPosts();
        model.addAttribute("appName", "Мое супер приложение");
        model.addAttribute("posts", posts);
        return "list";
    }

//    @ResponseBody
//    @RequestMapping(path = "/post/{id}", method = RequestMethod.GET)
//    public String single(@PathVariable("id") Long id) {
//        return "Здесь будет страница поста №" + id;
//    }


}
