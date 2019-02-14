package com.example.pc.spinnerex.Exam;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Movie_ {
    @SerializedName("image")
    @Expose
    public String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
