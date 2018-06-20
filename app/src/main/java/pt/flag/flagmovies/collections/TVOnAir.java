package pt.flag.flagmovies.collections;

import android.content.Context;


import pt.flag.flagmovies.http.entities.TvResponse;
import pt.flag.flagmovies.http.requests.ExecuteRequestAsyncTask;

public abstract class TVOnAir extends ExecuteRequestAsyncTask<TvResponse> {
    private static final String PATH = "/tv/on_the_air";
    private static final String LANGUAGE_KEY = "language";
    private static final String LANGUAGE_VALUE = "pt";
    private static final String PAGE_KEY = "page";
    private static final String PAGE_VALUE = "2";


    public  TVOnAir(Context context) {
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

    }

    @Override
    protected Class<TvResponse> getResponseEntityClass() {
        return TvResponse.class;
    }
}
