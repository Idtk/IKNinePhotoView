package com.idtk.ikninephotoview;

import android.view.View;

/**
 * Created by Idtk on 2017/3/8.
 * Blog : http://www.idtkm.com
 * GitHub : https://github.com/Idtk
 * des : 九宫格ViewHolder
 */

public abstract class IKNinePhotoViewHolder {
    private boolean flag = false;
    private View itemView;

    public IKNinePhotoViewHolder(View itemView) {
        if (itemView == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.itemView = itemView;
    }

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public View getItemView() {
        return itemView;
    }

    public void setItemView(View itemView) {
        this.itemView = itemView;
    }
}
