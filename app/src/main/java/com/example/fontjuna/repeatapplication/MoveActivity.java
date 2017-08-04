package com.example.fontjuna.repeatapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MoveActivity extends AppCompatActivity implements View.OnClickListener {

    public static final int REQUEST_CODE_NAME = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);

        findViewById(R.id.call_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MoveActivity.this, MoveSubActivity.class);
        intent.putExtra("name", "noru");
        startActivityForResult(intent, REQUEST_CODE_NAME);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String ret;
        if (requestCode == REQUEST_CODE_NAME && resultCode == RESULT_OK && data != null) {
            ret = data.getStringExtra("ret"); //.toString()붙이니까 터지네?
            Toast.makeText(this, ret, Toast.LENGTH_SHORT).show();
        }
    }

}
