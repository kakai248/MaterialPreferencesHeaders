package com.kakai.materialpreferencesheaders;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SettingsCategory extends RelativeLayout {

    private CardView card;
    private TextView categoryName;
    private ViewGroup headersGroup;

    private boolean useDivider;
    private int dividerRes;

    public SettingsCategory(Context context) {
        super(context);
        init();
    }

    public SettingsCategory(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SettingsCategory(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.settings_category, this);
        card = (CardView) findViewById(R.id.mph_category_card);
        categoryName = (TextView) findViewById(R.id.mph_category_name);
        headersGroup = (ViewGroup) findViewById(R.id.mph_category_headers);

        useDivider = true;
        dividerRes = 0;
    }

    public SettingsCategory withName(CharSequence charSequence) {
        categoryName.setText(charSequence);
        return this;
    }

    public SettingsCategory withName(int resId) {
        categoryName.setText(resId);
        return this;
    }

    public SettingsCategory withNameColor(int color) {
        categoryName.setTextColor(color);
        return this;
    }

    public SettingsCategory withDivider(boolean withDivider) {
        useDivider = withDivider;
        return this;
    }

    public SettingsCategory withDivider(int resId) {
        dividerRes = resId;
        return this;
    }

    public SettingsCategory withBackgroundColor(int color) {
        card.setBackgroundColor(color);
        return this;
    }

    public SettingsCategory withHeaders(SettingsHeader... headers) {
        for(int i = 0; i < headers.length; i++) {
            SettingsHeader header = headers[i];

            if(useDivider) {
                if(i < headers.length - 1) {
                    header = header.withDivider(useDivider);
                }
                if(dividerRes != 0) {
                    header = header.withDivider(dividerRes);
                }
            }

            headersGroup.addView(header);
        }
        return this;
    }
}
