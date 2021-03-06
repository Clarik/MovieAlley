package com.teammoviealley.moviealleyapp.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MovieTrailerVideos {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("results")
    @Expose
    private List<MovieTrailer> results = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<MovieTrailer> getResults() {
        return results;
    }

    public void setResults(List<MovieTrailer> results) {
        this.results = results;
    }

}
