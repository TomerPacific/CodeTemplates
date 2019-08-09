package com.tomerpacific.recyclerviewexample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyAdapter  extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private String[] mDataset;
    private LayoutInflater mInflater;


    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public MyViewHolder(View v) {
            super(v);
            textView = v.findViewById(R.id.my_text_view);
        }
    }

    public MyAdapter(Context context, String[] myDataset) {
        mDataset = myDataset;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {

        View v = mInflater.inflate(R.layout.recycler_view_row,
                parent,
                false);
        return new MyViewHolder(v);

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.textView.setText(mDataset[position]);

    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
