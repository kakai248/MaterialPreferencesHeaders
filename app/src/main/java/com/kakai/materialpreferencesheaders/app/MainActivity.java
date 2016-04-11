package com.kakai.materialpreferencesheaders.app;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.kakai.materialpreferencesheaders.SettingsCategory;
import com.kakai.materialpreferencesheaders.SettingsHeader;
import com.kakai.materialpreferencesheaders.SettingsView;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private SettingsView settingsView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);

        settingsView = (SettingsView) findViewById(R.id.settings);

        settingsView.withCategories(
                new SettingsCategory(this).withName("Wireless & networks").withHeaders(
                        new SettingsHeader(this).withIcon(R.drawable.ic_signal_wifi_4_bar_black_24dp).withText("Wi-Fi").withOnClickListener(onClickListener),
                        new SettingsHeader(this).withIcon(R.drawable.ic_bluetooth_black_24dp).withText("Bluetooth").withOnClickListener(onClickListener),
                        new SettingsHeader(this).withIcon(R.drawable.ic_data_usage_black_24dp).withText("Data usage").withOnClickListener(onClickListener),
                        new SettingsHeader(this).withIcon(R.drawable.ic_more_horiz_black_24dp).withText("More").withOnClickListener(onClickListener)
                ),
                new SettingsCategory(this).withName("Device").withHeaders(
                        new SettingsHeader(this).withIcon(R.drawable.ic_home_black_24dp).withText("Home").withOnClickListener(onClickListener),
                        new SettingsHeader(this).withIcon(R.drawable.ic_brightness_medium_black_24dp).withText("Display").withOnClickListener(onClickListener),
                        new SettingsHeader(this).withIcon(R.drawable.ic_notifications_black_24dp).withText("Sound & notification").withOnClickListener(onClickListener),
                        new SettingsHeader(this).withIcon(R.drawable.ic_adb_black_24dp).withText("Apps").withOnClickListener(onClickListener),
                        new SettingsHeader(this).withIcon(R.drawable.ic_storage_black_24dp).withText("Storage & USB").withOnClickListener(onClickListener),
                        new SettingsHeader(this).withIcon(R.drawable.ic_battery_80_black_24dp).withText("Battery").withOnClickListener(onClickListener),
                        new SettingsHeader(this).withIcon(R.drawable.ic_memory_black_24dp).withText("Memory").withOnClickListener(onClickListener),
                        new SettingsHeader(this).withIcon(R.drawable.ic_person_black_24dp).withText("Users").withOnClickListener(onClickListener)
                )
        );
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "click", Toast.LENGTH_SHORT).show();
        }
    };
}
