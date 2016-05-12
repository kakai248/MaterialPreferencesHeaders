package com.kakai.materialpreferencesheaders;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SettingsHeader extends RelativeLayout {

    private View container;
    private ImageView icon;
    private TextView text;

    private int dividerResId = R.drawable.settings_divider;

    public SettingsHeader(Context context) {
        super(context);
        init();
    }

    public SettingsHeader(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SettingsHeader(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.settings_header, this);
        container = findViewById(R.id.mph_header_container);
        icon = (ImageView) findViewById(R.id.mph_header_icon);
        text = (TextView) findViewById(R.id.mph_header_text);
    }

    public SettingsHeader withIcon(int resId) {
        icon.setImageResource(resId);
        return this;
    }

    public SettingsHeader withIconTint(int color) {
        icon.setColorFilter(color);
        return this;
    }

    public SettingsHeader withText(CharSequence charSequence) {
        text.setText(charSequence);
        return this;
    }

    public SettingsHeader withText(int resId) {
        text.setText(resId);
        return this;
    }

    public SettingsHeader withTextColor(int color) {
        text.setTextColor(color);
        return this;
    }

    public SettingsHeader withDivider(boolean withDivider) {
        if(withDivider) {
            text.setBackgroundResource(dividerResId);
        } else {
            text.setBackgroundResource(0);
        }
        return this;
    }

    public SettingsHeader withDivider(int resId) {
        dividerResId = resId;
        text.setBackgroundResource(resId);
        return this;
    }

    public SettingsHeader withOnClickListener(OnClickListener listener) {
        container.setOnClickListener(listener);
        return this;
    }
}
