package com.darkness.sparkwomen;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;

import com.smarteist.autoimageslider.SliderViewAdapter;

public class SliderAdapter extends SliderViewAdapter<SliderAdapter.Holder> {

    int[] images;
    public  SliderAdapter(int[]images){
        this.images=images;
    }
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.image_slider,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder viewHolder, int position) {
        viewHolder.imageView.setImageResource(images[position]);

    }

    @Override
    public int getCount() {
        return images.length;
    }

    public class Holder extends  SliderViewAdapter.ViewHolder{
            ImageView imageView;
            public Holder(View itemView){
                super(itemView);
                imageView=itemView.findViewById(R.id.image_view);

            }

    }
}
