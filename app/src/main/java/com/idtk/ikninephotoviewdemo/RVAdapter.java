package com.idtk.ikninephotoviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.idtk.ikninephotoview.IKNinePhotoView;

import butterknife.BindView;

/**
 * Created by Idtk on 2017/3/9.
 * Blog : http://www.idtkm.com
 * GitHub : https://github.com/Idtk
 * 描述 :
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.RVHolder> {

    private Context context;

    public RVAdapter(Context context) {
        super();
        this.context = context;
    }

    @Override
    public RVHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv,parent,false);
        RVHolder rvHolder = new RVHolder(view);
        return rvHolder;
    }

    @Override
    public void onBindViewHolder(RVHolder holder, int position) {
        MyAdapter adapter = new MyAdapter(context);
        holder.mNinePhoto.setAdapter(adapter);

    }

    @Override
    public int getItemCount() {
        return 9;
    }

    class RVHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.nine_photo)
        IKNinePhotoView mNinePhoto;
        public RVHolder(View itemView) {
            super(itemView);
            mNinePhoto = (IKNinePhotoView) itemView.findViewById(R.id.nine_photo);
        }
    }
}
