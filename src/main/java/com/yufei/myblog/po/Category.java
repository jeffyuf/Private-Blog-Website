package com.yufei.myblog.po;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yufei on 10/19/19 5:56 PM
 * for project myblog
 */

@Entity
@Table(name = "t_category")
public class Category {

    @Id
    @GeneratedValue // Auto generating
    private Long id;
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Blog> blogs = new ArrayList<>();

    public Category() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
