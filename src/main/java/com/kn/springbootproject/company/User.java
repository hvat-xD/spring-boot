package com.kn.springbootproject.company;

public class User {
    private String id;
    private String nickname;
    private String password;
    private Company company;
    private Role role;

    public String getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public Company getCompany() {
        return company;
    }

    public Role getRole() {
        return role;
    }

    public User(String id, String nickname, String password, Company company, Role role) {
        this.id = id;
        this.nickname = nickname;
        this.password = password;
        this.company = company;
        this.role = role;
    }
}
