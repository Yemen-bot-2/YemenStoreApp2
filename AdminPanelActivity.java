
package com.example.yemenstoreapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class AdminPanelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_panel);

        Button manageProductsButton = findViewById(R.id.manageProductsButton);
        Button viewOrdersButton = findViewById(R.id.viewOrdersButton);
        Button manageUsersButton = findViewById(R.id.manageUsersButton);

        manageProductsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
‎                // منطق إدارة المنتجات
            }
        });

        viewOrdersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
‎                // منطق عرض الطلبات
            }
        });

        manageUsersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
‎                // منطق إدارة المستخدمين
            }
        });
    }
}
