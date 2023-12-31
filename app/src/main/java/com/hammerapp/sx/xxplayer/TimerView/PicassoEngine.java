package com.hammerapp.sx.xxplayer.TimerView;

import android.widget.ImageView;

import com.hammerapp.sx.xxplayer.R;
import com.squareup.picasso.Picasso;

public class PicassoEngine implements ImageLoadingEngine {
    @Override
    public void onLoadImage(ImageView imageView, String uri) {
        Picasso.get()
                .load(uri)
                .resize(250, 250)
                .placeholder(R.drawable.timeline_card_placeholder)
                .centerCrop()
                .into(imageView);
    }
}
