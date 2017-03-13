package com.idtk.ikninephotoviewdemo;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.idtk.ikninephotoview.IKNinePhotoViewAdapter;
import com.idtk.ikninephotoview.IKNinePhotoViewHolder;

import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Idtk on 2017/3/9.
 * Blog : http://www.idtkm.com
 * GitHub : https://github.com/Idtk
 * 描述 :
 */

public class MyAdapter extends IKNinePhotoViewAdapter<MyAdapter.MyHolder> {

    private Context mContext;
    private int count;

    public MyAdapter(Context context) {
        super();
        mContext = context;
        count = new Random().nextInt(9);
    }

    @Override
    public MyHolder createView(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_rv_item, parent, false);
        MyHolder viewHolder = new MyHolder(view);
        return viewHolder;
    }

    @Override
    public void displayView(final MyHolder holder, final int position) {
        Glide
                .with(mContext)
                .load("http://ompb0h8qq.bkt.clouddn.com/header/header.jpg")
                .placeholder(R.mipmap.ic_launcher)
                .into(holder.mImageView);

        holder.getItemView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("click", position + "");
            }
        });
    }

    @Override
    public int getItemCount() {
        return count;
    }

    class MyHolder extends IKNinePhotoViewHolder {

        @BindView(R.id.nine_pic)
        ImageView mImageView;

        public MyHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }

}
