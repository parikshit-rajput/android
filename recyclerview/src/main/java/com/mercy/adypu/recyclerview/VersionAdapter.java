package com.mercy.adypu.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VersionAdapter extends RecyclerView.Adapter<VersionAdapter.VersionHolder>{

    public VersionAdapter(Context context, List<AndroidVersion> list) {
        this.context = context;
        this.list = list;
    }

    private Context context;
    private List<AndroidVersion> list;

    @NonNull
    @Override
    public VersionHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.single_card,parent, false);
        return new VersionHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VersionHolder holder, int position) {
        holder.getName().setText(list.get(position).getName());
        holder.getImage().setImageResource(list.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class VersionHolder extends RecyclerView.ViewHolder{

        public VersionHolder(@NonNull View itemView){
            super(itemView);
        }

        TextView getName(){
            return itemView.findViewById(R.id.textView);
        }
        ImageView getImage(){
            return itemView.findViewById(R.id.imageView);
        }
    }
}
