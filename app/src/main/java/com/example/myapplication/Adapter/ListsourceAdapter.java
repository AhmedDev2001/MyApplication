package com.example.myapplication.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myapplication.Interface.ItemClickListener;
import com.example.myapplication.R;
import com.example.myapplication.model.Wibesite;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

class ListsourceViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    ItemClickListener itemClickListener;
    TextView title;
    CircleImageView circleImageView;
    public ListsourceViewHolder(@NonNull View itemView) {
        super(itemView);
        title=itemView.findViewById(R.id.title);
        circleImageView=itemView.findViewById(R.id.source_image);
    }
    public void setItemClickListener(ItemClickListener itemClickListener){
        this.itemClickListener=itemClickListener;
    }


    @Override
    public void onClick(View v) {
      itemClickListener.onClick(v,getAdapterPosition(),false);
    }
}
class ListSourceAdapter extends RecyclerView.Adapter<ListsourceViewHolder>{
    private Context context;
    private Wibesite wibesite;

    public ListSourceAdapter(Context context, Wibesite wibesite) {
        this.context = context;
        this.wibesite = wibesite;
    }

    @NonNull
    @Override
    public ListsourceViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater=LayoutInflater.from(viewGroup.getContext());
        View view=layoutInflater.inflate(R.layout.source_list,viewGroup,false);
        return new ListsourceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListsourceViewHolder listsourceViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
