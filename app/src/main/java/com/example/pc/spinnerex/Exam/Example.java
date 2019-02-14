package com.example.pc.spinnerex.Exam;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class Example {

    @SerializedName("Data")
    @Expose
    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

}