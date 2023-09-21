package com.kn.springbootproject.company;

public class Company {
    private String id;
    private String name;
    private Project[] projects;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Project[] getProjects() {
        return projects;
    }

    public Company(String id, String name, Project[] projects) {
        this.id = id;
        this.name = name;
        this.projects = projects;
    }
}
