package com.example.androidtestdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.textView)
    TextView textView;
    @Bind(R.id.editText)
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        gotoMATTest();
    }

    public void sayHello(View v) {
        textView.setText("Hello, " + editText.getText().toString() + "!");
    }

    public void gotoMATTest() {
        startActivity(new Intent(MainActivity.this, MATActivity.class));
    }
}
