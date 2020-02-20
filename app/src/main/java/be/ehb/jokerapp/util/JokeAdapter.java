package be.ehb.jokerapp.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import be.ehb.jokerapp.R;
import be.ehb.jokerapp.model.Joke;

public class JokeAdapter extends RecyclerView.Adapter<JokeAdapter.jokeViewHolder> {



     class jokeViewHolder  extends RecyclerView.ViewHolder{

        final TextView tvSetup;
        final Button btnClou;

        public jokeViewHolder(@NonNull View itemView) {
            super(itemView);
            tvSetup = itemView.findViewById(R.id.tv_setup);
            btnClou = itemView.findViewById(R.id.btn_clou);
        }
    }
    ArrayList<Joke> items;

    public JokeAdapter() {
        items = new ArrayList<>();

    }

    @NonNull
    @Override
    public jokeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater. from(context);
        View card = layoutInflater.inflate(R.layout.joker_card, parent, false );

        return new jokeViewHolder(card);
    }

    @Override
    public void onBindViewHolder(@NonNull jokeViewHolder holder, int position) {
        Joke currentJoke = items.get(position);
        holder.tvSetup.setText(currentJoke.getSetup());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
    public void addItems(ArrayList<Joke> jokes){
        items.addAll(jokes);

    }


}
