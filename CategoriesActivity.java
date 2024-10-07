








‎
package com.example.yemenstoreapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class CategoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        Button electronicsButton = findViewById(R.id.electronicsButton);
        Button clothingButton = findViewById(R.id.clothingButton);
        Button homeGoodsButton = findViewById(R.id.homeGoodsButton);

        electronicsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
‎                // فتح المنتجات الإلكترونية
                Intent intent = new Intent(CategoriesActivity.this, ProductListActivity.class);
                intent.putExtra("category", "electronics");
                startActivity(intent);
            }
        });

        clothingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
‎                // فتح منتجات الملابس
                Intent intent = new Intent(CategoriesActivity.this, ProductListActivity.class);
                intent.putExtra("category", "clothing");
                startActivity(intent);
            }
        });
        
        homeGoodsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
‎                // فتح منتجات الأدوات المنزلية
                Intent intent = new Intent(CategoriesActivity.this, ProductListActivity.class);
                intent.putExtra("category", "homeGoods");
                startActivity(intent);
            }
        });
    }
}
