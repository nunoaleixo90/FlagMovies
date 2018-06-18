package pt.flag.flagmovies.http.entities;


import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class SearchResponse {

    @SerializedName("page")
    private Integer page;

    @SerializedName("results")
    private List<Movie> moviesResults = new ArrayList<>();

    @SerializedName("total_pages")
    private Integer totalPages;

    public Integer getPage() {
        return page;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public List<Movie> getMoviesResults() {
        return moviesResults;
    }

}
