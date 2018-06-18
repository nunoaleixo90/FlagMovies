package pt.flag.flagmovies.http.requests;

import android.content.Context;

import pt.flag.flagmovies.http.entities.SearchResponse;


public abstract class SearchMovies extends ExecuteRequestAsyncTask<SearchResponse> {

    private static final String PATH = "/search/movie";
    private static final String LANGUAGE_KEY = "language";
    private static final String LANGUAGE_VALUE = "pt";
    private static final String PAGE_KEY = "page";
    private static final String PAGE_VALUE = "1";
    private static final String QUERY_KEY = "query" ;
    private static String QUERY_VALUE;


    public SearchMovies(Context context) {
        super(context);



    }

    public static void setQUERY(String QUERY) {
        SearchMovies.QUERY_VALUE = QUERY;
    }

    public static String getPATH() {
        return PATH;
    }

    @Override
    protected void addQueryParams(StringBuilder sb) {
        addQueryParam(sb, LANGUAGE_KEY, LANGUAGE_VALUE);
        addQueryParam(sb, PAGE_KEY, PAGE_VALUE);
        addQueryParam(sb, QUERY_KEY, QUERY_VALUE);
    }

    @Override
    protected Class<SearchResponse> getResponseEntityClass() {
        return SearchResponse.class;
    }
}
