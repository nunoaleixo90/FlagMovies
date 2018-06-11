package pt.flag.flagmovies.screens;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import pt.flag.flagmovies.R;

public class HomeScreen extends Screen {

    private EditText searchBar;
    private Button searchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        findViews();
        setListeners();

    }


    public void findViews(){
        searchBar = findViewById(R.id.home_page_edit_text);
        searchButton=findViewById(R.id.home_page_search_button);
    }

    public void setListeners(){

    }
}
