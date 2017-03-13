package com.idtk.ikninephotoview;

import android.view.ViewGroup;

import java.util.Observable;

/**
 * Created by Idtk on 2017/3/8.
 * Blog : http://www.idtkm.com
 * GitHub : https://github.com/Idtk
 * des : 九宫格Adapter
 */

public abstract class IKNinePhotoViewAdapter<T extends IKNinePhotoViewHolder> extends Observable {

    public IKNinePhotoViewAdapter() {
        super();
    }

    public int getItemCount(){
        return 0;
    }

    public abstract T createView(ViewGroup parent);

    public abstract void displayView(T holder, int position);


    public void notifyChanged(){
        setChanged();
        notifyObservers();
    }

}