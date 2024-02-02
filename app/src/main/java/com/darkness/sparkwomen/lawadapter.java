package com.darkness.sparkwomen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;


public class lawadapter extends ArrayAdapter <person>{
    private Context mContext;
    private int mResource;


    public lawadapter(@NonNull Context context, int resource, @NonNull ArrayList<person> objects) {
        super(context, resource, objects);
        this.mContext=context;
        this.mResource=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(mContext);

        convertView=layoutInflater.inflate(mResource,parent,false);

        ImageView imageView=convertView.findViewById(R.id.img);

        TextView txtNo =convertView.findViewById(R.id.txtimg);

        TextView txtsub =convertView.findViewById(R.id.txtsub);

        imageView.setImageResource(getItem(position).getImg());

        txtNo.setText(getItem(position).getNo());
        txtsub.setText(getItem(position).getDes());
        


        return convertView;
    }
}
