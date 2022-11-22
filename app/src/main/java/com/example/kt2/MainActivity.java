

package com.example.kt2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvca = findViewById(R.id.lvca);

        ArrayList<ca> caArrayList = new ArrayList<>();
        caArrayList.add(new ca("cá rô phi","cá rô phi","dưới nước","màu đen" ));
        caArrayList.add(new ca("cá trê","cá trê","dưới nước","màu xám" ));
        caArrayList.add(new ca("cá bống","cá bống","dưới nước","màu vàng" ));
        caArrayList.add(new ca("cá chép","cá chép","dưới nước","màu đỏ" ));

        caAdapter adapter = new caAdapter(this,R.layout.custom_listvew_item,caArrayList);
        lvca.setAdapter(adapter);

    }


}
























