package com.josefranco;

public class User {
    private String name;
    private String email;
    private String password;
    private String urlImageProfil;
    private String phobne;

    public User() {
    }

    public User(String name, String email, String password, String urlImageProfil, String phobne) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.urlImageProfil = urlImageProfil;
        this.phobne = phobne;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrlImageProfil() {
        return urlImageProfil;
    }

    public void setUrlImageProfil(String urlImageProfil) {
        this.urlImageProfil = urlImageProfil;
    }

    public String getPhobne() {
        return phobne;
    }

    public void setPhobne(String phobne) {
        this.phobne = phobne;
    }
}
