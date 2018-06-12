package pt.flag.flagmovies.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import pt.flag.flagmovies.R;
import pt.flag.flagmovies.http.entities.Movie;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {

    private List<Movie> movieList;


    public RecycleViewAdapter(List<Movie> movieList) {
        this.movieList = movieList;
    }

    @NonNull
    @Override
    public RecycleViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_view_item_movies_in_theater, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewAdapter.ViewHolder holder, int position) {
        Movie filme = movieList.get(position);

        holder.viewNome.setText(filme.getOriginalTitle());
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }


    protected class ViewHolder extends RecyclerView.ViewHolder{
        private TextView viewNome;

        public ViewHolder(final View itemView){
            super(itemView);
            viewNome =itemView.findViewById(R.id.title_movie_in_theater);



        }

    }
}
