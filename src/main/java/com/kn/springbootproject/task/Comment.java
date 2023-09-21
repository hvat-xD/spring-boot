package com.kn.springbootproject.task;

import com.kn.springbootproject.company.User;

public class Comment {
    private String id;
    private User author;
    private String content;

    public String getId() {
        return id;
    }

    public User getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public Comment(String id, User author, String content) {
        this.id = id;
        this.author = author;
        this.content = content;
    }
}
