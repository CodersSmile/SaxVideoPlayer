package com.hammerapp.sx.xxplayer.comman;

import android.widget.RelativeLayout;

public interface OnItemClickListener {
    void OnclickItem(int pos);
    void OnNevigationMenuItem(int pos, String list, RelativeLayout relativeLayout);
}
