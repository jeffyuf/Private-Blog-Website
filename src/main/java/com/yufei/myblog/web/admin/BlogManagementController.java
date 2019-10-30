package com.yufei.myblog.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Yufei on 10/30/19 8:39 AM
 * for project myblog
 */
@Controller
@RequestMapping("/admin")
public class BlogManagementController {

    @GetMapping("/blogs")
    public String blogs() {
        return "admin/blogs-management";
    }
}
