package com.yufei.myblog.po;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Yufei on 10/19/19 5:03 PM
 * for project myblog
 */
@Entity
@Table(name = "t_blog")
public class Blog {

    @Id
    @GeneratedValue // Auto generating
    private Long id;
    private String title;
    private String content;
    private String firstPicture;
    private String mark;
    private Integer views;
    private boolean appreciationEnabled;
    private boolean copyrightEnabled;
    private boolean commentEnabled;
    private boolean publishEnabled;
    private boolean recommendEnabled;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;

    @ManyToOne
    private Category category;

    @ManyToMany(cascade = {CascadeType.PERSIST})
    private List<Tag> tags = new ArrayList<>();

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "blog")
    private List<Comment> comments = new ArrayList<>();

    public Blog() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFirstPicture() {
        return firstPicture;
    }

    public void setFirstPicture(String firstPicture) {
        this.firstPicture = firstPicture;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public boolean isAppreciationEnabled() {
        return appreciationEnabled;
    }

    public void setAppreciationEnabled(boolean appreciationEnabled) {
        this.appreciationEnabled = appreciationEnabled;
    }

    public boolean isCopyrightEnabled() {
        return copyrightEnabled;
    }

    public void setCopyrightEnabled(boolean copyrightEnabled) {
        this.copyrightEnabled = copyrightEnabled;
    }

    public boolean isCommentEnabled() {
        return commentEnabled;
    }

    public void setCommentEnabled(boolean commentEnabled) {
        this.commentEnabled = commentEnabled;
    }

    public boolean isPublishEnabled() {
        return publishEnabled;
    }

    public void setPublishEnabled(boolean publishEnabled) {
        this.publishEnabled = publishEnabled;
    }

    public boolean isRecommendEnabled() {
        return recommendEnabled;
    }

    public void setRecommendEnabled(boolean recommendEnabled) {
        this.recommendEnabled = recommendEnabled;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", firstPicture='" + firstPicture + '\'' +
                ", mark='" + mark + '\'' +
                ", views=" + views +
                ", appreciationEnabled=" + appreciationEnabled +
                ", copyrightEnabled=" + copyrightEnabled +
                ", commentEnabled=" + commentEnabled +
                ", publishEnabled=" + publishEnabled +
                ", recommendEnabled=" + recommendEnabled +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
