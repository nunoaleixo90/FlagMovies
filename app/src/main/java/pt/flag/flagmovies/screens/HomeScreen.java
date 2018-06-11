package pt.flag.flagmovies.screens;

import android.os.Bundle;

import pt.flag.flagmovies.R;

public class HomeScreen extends Screen {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        findViews();
        setListeners();

    }


    public void findViews(){

    }

    public void setListeners(){

    }
}
