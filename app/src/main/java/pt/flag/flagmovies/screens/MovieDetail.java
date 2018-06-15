package pt.flag.flagmovies.screens;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import pt.flag.flagmovies.R;

public class MovieDetail extends Screen {

    private Intent intent;
    private TextView title;
    private TextView description;
    private ImageView poster;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_detail);
        findViews();
        receiveData();

    }

    private void findViews(){
        title = findViewById(R.id.movie_detail_title);
        description = findViewById(R.id.movie_detail_description);
        intent = getIntent();
        poster = findViewById(R.id.movie_detail_poster);


    }

    private void receiveData(){


        String movietitle = intent.getExtras().getString("Movie Title");
        String moviedescription = intent.getExtras().getString("Description");
        String movieposter = intent.getExtras().getString("Movie Poster");
        title.setText(movietitle);
        description.setText(moviedescription);

        Picasso.get().load(movieposter).into(poster);





    }
}
