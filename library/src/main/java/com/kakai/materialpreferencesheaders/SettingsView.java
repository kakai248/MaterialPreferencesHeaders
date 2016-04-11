package com.kakai.materialpreferencesheaders;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class SettingsView extends LinearLayout {

    private LinearLayout categoriesGroup;

    public SettingsView(Context context) {
        super(context);
        init();
    }

    public SettingsView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SettingsView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.settings_view, this);
        categoriesGroup = (LinearLayout) findViewById(R.id.mph_categories);
    }

    public SettingsView withCategories(SettingsCategory... categories) {
        for(SettingsCategory category : categories) {
            categoriesGroup.addView(category);
        }
        return this;
    }
}
