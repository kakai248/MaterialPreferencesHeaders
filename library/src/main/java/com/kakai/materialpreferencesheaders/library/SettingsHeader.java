package com.kakai.materialpreferencesheaders.library;

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
        container = findViewById(R.id.container);
        icon = (ImageView) findViewById(R.id.icon);
        text = (TextView) findViewById(R.id.text);
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
            text.setBackgroundResource(R.drawable.settings_divider);
        } else {
            text.setBackgroundResource(0);
        }
        return this;
    }

    public SettingsHeader withDivider(int resId) {
        text.setBackgroundResource(resId);
        return this;
    }

    public SettingsHeader withOnClickListener(OnClickListener listener) {
        container.setOnClickListener(listener);
        return this;
    }
}
