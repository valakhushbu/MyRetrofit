package com.example.pc.spinnerex.Exam;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data{

   /* @SerializedName("Movies")
    @Expose
    private List<Movie> movies = null;

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }*/
   @SerializedName("Movie")
   @Expose
   public Movie_ movie;
    @SerializedName("Movies")
    @Expose
    private List<Movie> movies = null;

    public Movie_ getMovie() {
        return movie;
    }

    public void setMovie(Movie_ movie) {
        this.movie = movie;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}