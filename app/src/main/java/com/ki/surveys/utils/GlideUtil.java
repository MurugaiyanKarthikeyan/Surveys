package com.ki.surveys.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.ki.surveys.R;


public class GlideUtil {

    /**
     * Load network image using image URL with Glide.
     *
     * @param context    Activity/Application context.
     * @param targetView Target ImageView into which image has to load.
     * @param url        URL for the image.
     * @param errorImage Error image resource ID.
     * @param listener   Image load listener to get callback of loading status. ( To keep the image aspect ratio)
     */
    public static void loadImage(Context context, final ImageView targetView, String url, int errorImage, final GlideImageLoadListener listener) {

        RequestOptions requestOptions = new RequestOptions();
        requestOptions.override(Target.SIZE_ORIGINAL,Target.SIZE_ORIGINAL);
        requestOptions.diskCacheStrategy(DiskCacheStrategy.DATA);
        requestOptions.dontTransform();
        requestOptions.placeholder(R.drawable.image_placeholder);
        requestOptions.fitCenter();
        requestOptions.error(errorImage);
        Glide.with(context)
                .load(url)
                .apply(requestOptions)
                .listener(new RequestListener<Drawable>() {
                    @Override
                    public boolean onLoadFailed(@Nullable GlideException e, Object o, Target<Drawable> target, boolean b) {
                        if (listener != null) {
                            listener.onFailed();
                        }
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(Drawable drawable, Object o, Target<Drawable> target, DataSource dataSource, boolean b) {
                        if (listener != null) {
                            listener.onSuccess(drawable, o.toString(), target);
                        }
                        return false;
                    }
                })
                .transition(DrawableTransitionOptions.withCrossFade())
                .into(targetView);
    }
}
