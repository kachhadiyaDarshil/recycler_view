package com.example.recyclerview;

public class item {
    String name;
    String email;
    int image;

    public item(String name, String email, int image) {
        this.name = name;
        this.email = email;
        this.image = image;
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

    public int getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = Integer.parseInt(image);
    }
}
