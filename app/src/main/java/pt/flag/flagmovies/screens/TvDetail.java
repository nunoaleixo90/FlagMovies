package pt.flag.flagmovies.screens;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import pt.flag.flagmovies.R;

public class TvDetail extends Screen {

    private Intent intent;
    private TextView title;
    private TextView description;
    private ImageView poster;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tv_detail);
        findViews();
        receiveData();
    }


    private void findViews(){
        title = findViewById(R.id.tv_detail_title);
        description = findViewById(R.id.tv_detail_description);
        intent = getIntent();
        poster = findViewById(R.id.tv_detail_poster);
    }

    private void receiveData(){

        String tvtitle = intent.getExtras().getString("TvShow Title");
        String tvdescription = intent.getExtras().getString("Description");
        String tvposter = intent.getExtras().getString("TvShow Poster");
        title.setText(tvtitle);
        description.setText(tvdescription);

        Picasso.get().load(tvposter).into(poster);
    }
}
