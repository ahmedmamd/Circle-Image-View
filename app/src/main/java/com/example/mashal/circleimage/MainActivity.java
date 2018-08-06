package com.example.mashal.circleimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    CircleImageView circleimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     circleimage=findViewById(R.id.image);
     circleimage.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

         }
     });
    }
}
