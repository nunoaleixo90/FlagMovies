package pt.flag.flagmovies.screens;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.EditText;

import pt.flag.flagmovies.R;
import pt.flag.flagmovies.adapter.RecycleViewAdapter;

public class HomeScreen extends Screen {

    private EditText searchBar;
    private Button searchButton;
    private RecyclerView recyclerViewInTheaters;
    private LinearLayoutManager recyclerViewInTheatersLM;
    private RecycleViewAdapter recycleViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        findViews();
        setListeners();
        recycleViewManager();

    }


    public void findViews(){
        searchBar = findViewById(R.id.home_page_edit_text);
        searchButton=findViewById(R.id.home_page_search_button);
        recyclerViewInTheaters = findViewById(R.id.recycleview_in_theaters);

    }

    public void setListeners(){

    }

    public void recycleViewManager(){
        recyclerViewInTheaters.setHasFixedSize(true);
        recyclerViewInTheatersLM = new LinearLayoutManager(this);
        recyclerViewInTheaters.setLayoutManager(recyclerViewInTheatersLM);


        
        recycleViewAdapter = new RecycleViewAdapter();
        recyclerViewInTheaters.setAdapter(recycleViewAdapter);

    }
}
