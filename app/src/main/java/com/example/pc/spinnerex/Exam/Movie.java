package com.example.pc.spinnerex.Exam;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class Movie {
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("image")
    @Expose
    private String image;

    public Movie(String name, String image) {
        this.name = name;
        this.image = image;
    }
    public Movie() {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
