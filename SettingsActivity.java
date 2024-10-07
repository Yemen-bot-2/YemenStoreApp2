
package com.example.yemenstoreapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Button changeLanguageButton = findViewById(R.id.changeLanguageButton);
        Button helpButton = findViewById(R.id.helpButton);
        Button logoutButton = findViewById(R.id.logoutButton);

        changeLanguageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
‎                // منطق تغيير اللغة
            }
        });

        helpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
‎                // افتح قسم المساعدة أو الدعم
            }
        });

        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
‎                // تنفيذ تسجيل الخروج
            }
        });
    }
}
