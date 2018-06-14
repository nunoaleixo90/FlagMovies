package pt.flag.flagmovies.adapter;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import pt.flag.flagmovies.R;
import pt.flag.flagmovies.http.entities.Movie;
import pt.flag.flagmovies.http.entities.TvShow;

public class RecycleViewAdapterTvOnAir extends RecyclerView.Adapter<RecycleViewAdapterTvOnAir.ViewHolder> {

    private List<TvShow> tvshowList;


    public RecycleViewAdapterTvOnAir(List<TvShow> tvshowList) {
        this.tvshowList = tvshowList;
    }


    @Override
    public RecycleViewAdapterTvOnAir.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tv_on_air, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecycleViewAdapterTvOnAir.ViewHolder holder, int position) {
        TvShow tvshow = tvshowList.get(position);

        holder.title_tv_on_air.setText(tvshow.getOriginalTitle());

        try
        {
            if(!tvshow.getPosterURL().equals("null")) {
                Picasso.get().load(tvshow.getPosterURL()).into(holder.poster_tv_on_air);
            }
            else if(tvshow.getPosterURL().equals("null")){
                Bitmap bitmap = BitmapFactory.decodeFile("mipmap-hdpi/app_icon.png");
                holder.poster_tv_on_air.setImageBitmap(bitmap);
            }
        }catch (Exception e){
            System.out.println("ERROOOOOOO");
        }




    }



    @Override
    public int getItemCount() {
        return tvshowList.size();
    }


    protected class ViewHolder extends RecyclerView.ViewHolder{
        private TextView title_tv_on_air;
        private ImageView poster_tv_on_air;


        public ViewHolder(final View itemView){
            super(itemView);
            title_tv_on_air =(TextView) itemView.findViewById(R.id.title_tv_on_air);
            poster_tv_on_air = (ImageView) itemView.findViewById(R.id.poster_tv_on_air);




        }

    }
}
