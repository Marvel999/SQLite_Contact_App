package com.example.util;

import android.content.Context;

import com.example.videotutorial1.R;
import com.nostra13.universalimageloader.cache.memory.impl.WeakMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;

public class ImageLoader {

    private static final int defaultImage = R.drawable.ic_android_black_24dp;

    private Context mContext;

    public ImageLoader(Context context) {
        mContext = context;
    }

    public ImageLoaderConfiguration getConfig(){
        //Universal Image Loader Setup
        DisplayImageOptions defaultOptions = new DisplayImageOptions.Builder()
                .showImageOnLoading(defaultImage)
                .showImageForEmptyUri(defaultImage)
                .showImageOnFail(defaultImage)
                .cacheOnDisk(true).cacheInMemory(true)
                .cacheOnDisk(true).resetViewBeforeLoading(true)
                .imageScaleType(ImageScaleType.EXACTLY)
                .displayer(new FadeInBitmapDisplayer(300)).build();

//        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(mContext)
//                .defaultDisplayImageOptions(defaultOptions)
//                .memoryCache(new WeakMemoryCache())
//                .diskCacheSize(100 * 1024 * 1024)
//                .build();

        return new ImageLoaderConfiguration.Builder(mContext)
                .defaultDisplayImageOptions(defaultOptions)
                .memoryCache(new WeakMemoryCache())
                .diskCacheSize(100 * 1024 * 1024)
                .build();
    }
}
