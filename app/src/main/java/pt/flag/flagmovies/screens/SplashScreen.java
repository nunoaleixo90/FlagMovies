package pt.flag.flagmovies.screens;


import android.os.Bundle;
import android.widget.ImageView;

import pt.flag.flagmovies.R;

public class SplashScreen extends Screen {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        findViews();

    }


    public void findViews(){
        imageView = findViewById(R.id.splash_screen_imageview);
    }
}
