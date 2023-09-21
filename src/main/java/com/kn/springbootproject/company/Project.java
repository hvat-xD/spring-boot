package com.kn.springbootproject.company;

import com.kn.springbootproject.task.Task;

public class Project {
    private String id;
    private String name;
    private Task[] tasks;
    private User[] users;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Task[] getTasks() {
        return tasks;
    }

    public User[] getUsers() {
        return users;
    }

    public Project(String id, String name, Task[] tasks, User[] users) {
        this.id = id;
        this.name = name;
        this.tasks = tasks;
        this.users = users;
    }
}
