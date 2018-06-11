package pt.flag.flagmovies.http.requests;

import android.content.Context;

import pt.flag.flagmovies.http.entities.MoviesResponse;

/**
 * Example for getting now playing movies
 */
public abstract class GetNowPlayingMoviesAsyncTask extends ExecuteRequestAsyncTask<MoviesResponse> {

    private static final String PATH = "/movie/now_playing";
    private static final String LANGUAGE_KEY = "language";
    private static final String LANGUAGE_VALUE = "pt";

    public GetNowPlayingMoviesAsyncTask(Context context) {
        super(context);
    }

    @Override
    protected String getPath() {
        return PATH;
    }

    @Override
    protected void addQueryParams(StringBuilder sb) {
        addQueryParam(sb, LANGUAGE_KEY, LANGUAGE_VALUE);
    }

    @Override
    protected Class<MoviesResponse> getResponseEntityClass() {
        return MoviesResponse.class;
    }
}
