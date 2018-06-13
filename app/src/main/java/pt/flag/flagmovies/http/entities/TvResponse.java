package pt.flag.flagmovies.http.entities;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class TvResponse {



    @SerializedName("page")
    private Integer page;

    @SerializedName("results")
    private List<TvShow> tvShows = new ArrayList<>();

    @SerializedName("total_pages")
    private Integer totalPages;

    public Integer getPage() {
        return page;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public List<TvShow> getTvshows() {
        return tvShows;
    }
}
