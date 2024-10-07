
package com.example.yemenstoreapp;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FirebaseUtils {

    private static DatabaseReference databaseReference;

    public static DatabaseReference getDatabaseReference() {
        if (databaseReference == null) {
            databaseReference = FirebaseDatabase.getInstance().getReference();
        }
        return databaseReference;
    }

    public static void writeData(String path, Object data) {
        databaseReference.child(path).setValue(data);
    }

‎    // يمكنك إضافة المزيد من الدوال لتعزيز التفاعل مع Firebase 
}
