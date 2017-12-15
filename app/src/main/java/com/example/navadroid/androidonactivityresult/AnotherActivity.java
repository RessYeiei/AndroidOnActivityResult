package com.example.navadroid.androidonactivityresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class AnotherActivity extends AppCompatActivity {
    private String val1;
    private TextView data_main;

    private static final int RESULT_OK = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        data_main = (TextView)findViewById(R.id.data_from_main);
        val1 = getIntent().getStringExtra("Value1");
        data_main.setText(val1);

        Log.d("data -------",val1);

    }

    @Override
    public void finish() {
        Intent intent = new Intent();

        if (((RadioButton) findViewById(R.id.rb_apple)).isChecked()) {
            intent.putExtra("returnKey1", "This is an apple.");
        }
        if (((RadioButton) findViewById(R.id.rb_pen)).isChecked()) {
            intent.putExtra("returnKey2", "This is a pen.");
        }
        setResult(RESULT_OK, intent); //
        super.finish();
    }


}
