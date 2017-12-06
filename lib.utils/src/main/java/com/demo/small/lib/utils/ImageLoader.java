package com.demo.small.lib.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by caiminming on 2017/12/6.
 */

public class ImageLoader {

    public static void loadImage(Context context, String imgUrl, ImageView img) {
        Glide.with(context).load(imgUrl).into(img);
    }
}

