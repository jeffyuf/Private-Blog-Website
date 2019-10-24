package com.yufei.myblog.web;

import com.yufei.myblog.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by Yufei on 10/8/19 12:35 AM
 * for project myblog
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        //int i = 9/0;
        //String blog = null;
        //if (blog == null) {
        //    throw new NotFoundException("Blog does not exist.");
        //}
        // System.out.println("----------index----------");
        return "index";
    }

    @GetMapping("/blog")
    public String blog() {
        return "blog";
    }
}
