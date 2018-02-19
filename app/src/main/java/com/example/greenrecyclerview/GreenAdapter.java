package com.example.greenrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Sidra on 2/2/2018.
 */

class GreenAdapter extends RecyclerView.Adapter<GreenAdapter.NumberViewHolder>  {
    private static final String TAG = GreenAdapter.class.getSimpleName();


    private int mNumberItems;


    public GreenAdapter(int numberOfItems) {
        mNumberItems=numberOfItems;

    }

    @Override
    public NumberViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        int layoutforListItem=R.layout.number_list_item;
        LayoutInflater inflater=LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately=false;
        View view=inflater.inflate(layoutforListItem,parent,shouldAttachToParentImmediately);
        NumberViewHolder viewHolder=new NumberViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(NumberViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class NumberViewHolder extends RecyclerView.ViewHolder{
        TextView listitemNumberView;

        public NumberViewHolder(View itemView) {
            super(itemView);
            listitemNumberView=(TextView)itemView.findViewById(R.id.tv_item_number);

        }
    }
}
