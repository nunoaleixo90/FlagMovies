package pt.flag.flagmovies.screens;

import android.os.Bundle;

import pt.flag.flagmovies.http.entities.MoviesResponse;
import pt.flag.flagmovies.http.requests.GetNowPlayingMoviesAsyncTask;
import pt.flag.flagmovies.utils.DLog;

public class ExampleScreen extends Screen {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        executeRequestExample();
    }

    private void executeRequestExample() {
        // Example to request get now playing movies
        new GetNowPlayingMoviesAsyncTask(this) {

            @Override
            protected void onResponseSuccess(MoviesResponse moviesResponse) {
                DLog.d(tag, "onResponseSuccess " + moviesResponse);
                // Here i can create the adapter :)
            }

            @Override
            protected void onNetworkError() {
                DLog.d(tag, "onNetworkError ");
                // Here i now that some error occur when processing the request,
                // possible my internet connection if turned off
            }
        }.execute();
    }
}
