package pt.flag.flagmovies.screens;

import android.os.Bundle;
import android.widget.TextView;

import pt.flag.flagmovies.R;

public class SearchScreenResults extends Screen {
    private HomeScreen homeScreen;

    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_screen_results);
        findViews();
    }


    public void findViews(){
        tv= findViewById(R.id.teste_query);


    }
    public void setListeners(){
        System.out.println("QUERY = " + homeScreen.getSearchQuery());
        tv.setText(homeScreen.getSearchQuery());
    }
}
