package com.example.pc.spinnerex;

public class Model {

    String Image,movien_name;

    public Model(String image, String movien_name) {
        Image = image;
        this.movien_name = movien_name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getMovien_name() {
        return movien_name;
    }

    public void setMovien_name(String movien_name) {
        this.movien_name = movien_name;
    }
}
