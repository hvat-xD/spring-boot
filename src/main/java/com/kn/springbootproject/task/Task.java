package com.kn.springbootproject.task;

import com.kn.springbootproject.company.User;

public class Task {
    private String id;
    private String title;
    private String description;
    private TaskType type;
    private TaskLevel level;
    private TaskStatus status;
    private Comment[] comments;
    private User[] assignedUsers;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public TaskType getType() {
        return type;
    }

    public TaskLevel getLevel() {
        return level;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public Comment[] getComments() {
        return comments;
    }

    public User[] getAssignedUsers() {
        return assignedUsers;
    }

    public Task(String id, String title, String description, TaskType type, TaskLevel level, TaskStatus status, Comment[] comments, User[] assignedUsers) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.type = type;
        this.level = level;
        this.status = status;
        this.comments = comments;
        this.assignedUsers = assignedUsers;
    }
}
