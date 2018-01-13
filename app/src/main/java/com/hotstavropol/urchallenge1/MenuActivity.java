package com.hotstavropol.urchallenge1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by maximgran on 13.01.2018.
 */

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
/*        ImageButton SettingsButton = (ImageButton)findViewById(R.id.SettingButton);

        SettingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, Settings.class);
                startActivity(intent);
            }
        });*/
    }
}
