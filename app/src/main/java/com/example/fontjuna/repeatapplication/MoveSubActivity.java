package com.example.fontjuna.repeatapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MoveSubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_sub);

        Intent intent = getIntent();
        if (intent != null) {
            String name = intent.getStringExtra("name");
            Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
        }

        findViewById(R.id.return_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("ret", "잘 받았어");
                setResult(RESULT_OK, intent);
//                Toast.makeText(MoveSubActivity.this, "돌아갑니다", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }

}
