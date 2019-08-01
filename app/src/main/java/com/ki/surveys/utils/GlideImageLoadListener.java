package com.ki.surveys.utils;

import android.graphics.drawable.Drawable;

import com.bumptech.glide.request.target.Target;

public interface GlideImageLoadListener {
    void onSuccess(Drawable resource, String model, Target<Drawable> target);
    void onFailed();
}
