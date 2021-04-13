package com.example.listernershirt;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AoAdapter extends RecyclerView.Adapter<AoAdapter.ThingViewHolder> {
    private Context context;
    private ArrayList<Ao> aos;

    public AoAdapter(Context context, ArrayList<Ao> aos) {
        this.context = context;
        this.aos = aos;
    }

    @NonNull
    @Override
    public AoAdapter.ThingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.layout01_item, parent, false);
        return new ThingViewHolder(view, this);
    }

    @Override
    public void onBindViewHolder(@NonNull AoAdapter.ThingViewHolder holder, int position) {
        Ao ao = aos.get(position);
        holder.tvName.setText(ao.getTvName());
        holder.tvGia.setText(ao.getTvGia());
        holder.imageButton.setImageResource(ao.getImagebutton());

        holder.imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, MainActivity2.class);
                i.putExtra("name", ao.getTvName());
                i.putExtra("gia", ao.getTvGia());
                i.putExtra("imagebutton", ao.getImagebutton());


                context.startActivities(new Intent[]{i});
            }
        });


    }

    @Override
    public int getItemCount() {
        return aos.size();
    }

    public class ThingViewHolder extends RecyclerView.ViewHolder {
        private TextView tvName;
        private  TextView tvGia;
        private ImageButton imageButton;

        AoAdapter aoAdapter;

        public ThingViewHolder(@NonNull View itemView, AoAdapter adapter) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvGia = itemView.findViewById(R.id.tvGia);
            imageButton = itemView.findViewById(R.id.imageButton);
            this.aoAdapter = adapter;



        }
    }
}
