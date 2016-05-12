package com.kakai.materialpreferencesheaders;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class SettingsView extends LinearLayout {

    private LinearLayout categoriesGroup;

    private SettingsCategory[] settingsCategories;

    private int categoryNameColor = 0;
    private int headerIconTint = 0;
    private int headerTextColor = 0;
    private int categoryBackgroundColor = 0;
    private int headerDivider = 0;

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

    public SettingsView withCategoryNameColor(int color) {
        categoryNameColor = color;
        return this;
    }

    public SettingsView withCategoryBackgroundColor(int color) {
        categoryBackgroundColor = color;
        return this;
    }

    public SettingsView withHeaderIconTint(int color) {
        headerIconTint = color;
        return this;
    }

    public SettingsView withHeaderTextColor(int color) {
        headerTextColor = color;
        return this;
    }

    public SettingsView withHeaderDivider(int resId) {
        headerDivider = resId;
        return this;
    }

    public SettingsView withCategories(SettingsCategory... categories) {
        settingsCategories = categories;
        return this;
    }

    public SettingsView build() {

        for(SettingsCategory category : settingsCategories) {

            if(categoryNameColor != 0) {
                category = category.withNameColor(categoryNameColor);
            }

            if(categoryBackgroundColor != 0) {
                category = category.withBackgroundColor(categoryBackgroundColor);
            }

            if(headerIconTint != 0) {
                category = category.withHeaderIconTint(headerIconTint);
            }

            if(headerTextColor != 0) {
                category = category.withHeaderTextColor(headerTextColor);
            }

            if(headerDivider != 0) {
                category = category.withDivider(headerDivider);
            }

            categoriesGroup.addView(category.build());
        }

        return this;
    }
}
