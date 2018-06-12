package pt.flag.flagmovies.collections;

import android.content.Context;

import pt.flag.flagmovies.http.entities.Movie;
import pt.flag.flagmovies.http.entities.MoviesResponse;
import pt.flag.flagmovies.http.requests.ExecuteRequestAsyncTask;


public abstract class MoviesInTheaters extends ExecuteRequestAsyncTask {
    private static final String PATH = "/movie/now_playing";
    private static final String LANGUAGE_KEY = "language";
    private static final String LANGUAGE_VALUE = "pt";
    private static final String PAGE_KEY = "page";
    private static final String PAGE_VALUE = "1";
    private static final String REGION_KEY = "region";
    private static final String REGION_VALUE ="PT";

    public MoviesInTheaters(Context context) {
        super(context);
    }

    @Override
    protected String getPath() {
        return PATH;
    }

    @Override
    protected void addQueryParams(StringBuilder sb) {
        addQueryParam(sb, LANGUAGE_KEY, LANGUAGE_VALUE);
        addQueryParam(sb, PAGE_KEY, PAGE_VALUE);
        addQueryParam(sb, REGION_KEY, REGION_VALUE);
    }

    @Override
    protected Class<MoviesResponse> getResponseEntityClass() {
        return MoviesResponse.class;
    }







}
