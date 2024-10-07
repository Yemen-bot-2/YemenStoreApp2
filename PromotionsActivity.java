
package com.example.yemenstoreapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class PromotionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promotions);

        TextView promotionsText = findViewById(R.id.promotionsText);
        promotionsText.setText("العروض الحالية: خصومات تصل إلى 50%!");
‎        // يمكنك إضافة مزيد من التفاصيل حول العروض هنا
    }
}
