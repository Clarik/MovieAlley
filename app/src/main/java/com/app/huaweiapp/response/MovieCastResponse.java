package com.app.huaweiapp.response;

import com.app.huaweiapp.model.Cast;
import com.app.huaweiapp.model.Movie;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieCastResponse {

    @SerializedName("id")
    @Expose()
    private int movie_id;

    @SerializedName("cast")
    @Expose()
    private List<Cast> casts;

    public int getMovie_id() {
        return movie_id;
    }

    public List<Cast> getCasts() {
        return casts;
    }

    @Override
    public String toString() {
        return "MovieCastResponse{" +
                "movie_id=" + movie_id +
                ", casts=" + casts +
                '}';
    }
}
