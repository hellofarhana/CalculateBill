package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AboutActivity extends AppCompatActivity {

    ImageView git;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        git=findViewById(R.id.github);

        git.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("");
            }

            });
        }

    private void gotoUrl(String s) {
    }


}
