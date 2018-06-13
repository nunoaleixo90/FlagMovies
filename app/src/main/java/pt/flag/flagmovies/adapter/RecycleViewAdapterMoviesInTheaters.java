package pt.flag.flagmovies.adapter;




import android.support.v7.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

import pt.flag.flagmovies.R;
import pt.flag.flagmovies.http.entities.Movie;

public class RecycleViewAdapterMoviesInTheaters extends RecyclerView.Adapter<RecycleViewAdapterMoviesInTheaters.ViewHolder> {

    private List<Movie> movieList;


    public RecycleViewAdapterMoviesInTheaters(List<Movie> movieList) {
        this.movieList = movieList;
    }


    @Override
    public RecycleViewAdapterMoviesInTheaters.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie_in_theater, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Movie filme = movieList.get(position);

        holder.in_theater_title.setText(filme.getTitle());




    }



    @Override
    public int getItemCount() {
        return movieList.size();
    }


    protected class ViewHolder extends RecyclerView.ViewHolder{
        private TextView in_theater_title;
        private ImageView in_theater_poster;


        public ViewHolder(final View itemView){
            super(itemView);
            in_theater_title =(TextView) itemView.findViewById(R.id.title_movie_in_theater);
            in_theater_poster = (ImageView) itemView.findViewById(R.id.poster_movie_in_theater);




        }

    }
}
