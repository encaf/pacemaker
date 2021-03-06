package com.encaf.pacemaker.views;

import android.content.Context;
import android.util.AttributeSet;

import com.encaf.pacemaker.R;

public class TimeView extends HolderView {

    public TimeView(Context context) {
        super(context);
    }

    public TimeView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TimeView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void showCaption(int position) {
        switch (position) {
            case 0:
                this.captionTextView.setText(R.string.time_caption_0);
                break;
            case 1:
                this.captionTextView.setText(R.string.time_caption_1);
                break;
            case 2:
                this.captionTextView.setText(R.string.time_caption_2);
                break;
        }
    }
}
