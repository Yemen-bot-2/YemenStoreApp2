
package com.example.yemenstoreapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class UserProfileActivity extends AppCompatActivity {

    private TextView userNameTextView;
    private TextView userEmailTextView;
    private Button editProfileButton;
    private Button logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        // ربط العناصر من ملف XML
        userNameTextView = findViewById(R.id.userNameTextView);
        userEmailTextView = findViewById(R.id.userEmailTextView);
        editProfileButton = findViewById(R.id.editProfileButton);
        logoutButton = findViewById(R.id.logoutButton);

        // إعداد بعض البيانات الوهمية (يمكنك استبدالها بالبيانات الحقيقية)
        userNameTextView.setText("اسم المستخدم: أحمد");
        userEmailTextView.setText("البريد الإلكتروني: ahmed@example.com");

        // إعداد زر تعديل الملف الشخصي
        editProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // فتح صفحة تعديل الملف الشخصي
                Intent intent = new Intent(UserProfileActivity.this, EditProfileActivity.class);
                startActivity(intent);
            }
        });

        // إعداد زر تسجيل الخروج
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // تنفيذ تسجيل الخروج
                performLogout();
            }
        });
    }

    private void performLogout() {
        // هنا يمكنك إضافة منطق تسجيل الخروج، مثل حذف جلسة المستخدم
        // إعادة توجيه المستخدم إلى صفحة تسجيل الدخول
        Intent intent = new Intent(UserProfileActivity.this, LoginActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish(); // إنهاء النشاط الحالي
    }
}