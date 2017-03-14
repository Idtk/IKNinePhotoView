# IKNinePhotoView

## Introduction
&nbsp;&nbsp;&nbsp;&nbsp;IKNinePhotoView是一个开源的Android九宫格控件，可以自适应宽高主要用于满足九宫格图片展示器及选择器的需求。

## IKNinePhotoViewDemo

<img src="https://github.com/Idtk/IKNinePhotoView/blob/master/gif/IKNinePhotoView.gif" alt="IKNinePhotoView" title="IKNinePhotoView" width="300"/><br>

## Usage

### Step 1

**IKNinePhotoView**

```XML
<com.idtk.ikninephotoview.IKNinePhotoView
    android:id="@+id/nine_photo"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"/>
```

### step 2

**IKNinePhotoViewAdapter**
```Java
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
    }

}
```

### step 3

**IKNinePhotoViewHolder**
```Java
class MyHolder extends IKNinePhotoViewHolder {

	@BindView(R.id.nine_pic)
	ImageView mImageView;

	public MyHolder(View itemView) {
		super(itemView);
		ButterKnife.bind(this,itemView);
	}
}
```

### step 4

**Binding**

```Java
MyAdapter adapter = new MyAdapter(context);
        holder.mNinePhoto.setAdapter(adapter);
```


## License
```
Copyright (C) 2017 Idtk

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
******

## About Me

&nbsp;&nbsp;**博客: www.idtkm.com**<br>
&nbsp;&nbsp;**GitHub: https://github.com/Idtk**<br>
&nbsp;&nbsp;**微博: http://weibo.com/Idtk**<br>
&nbsp;&nbsp;**邮箱: IdtkMa@gmail.com**<br>
