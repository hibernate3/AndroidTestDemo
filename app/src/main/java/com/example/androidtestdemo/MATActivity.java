package com.example.androidtestdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MATActivity extends AppCompatActivity {
    private List<ImageView> list = new ArrayList<>();

    static MemoryLeak memoryLeak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mat);

//        if (memoryLeak == null) {
//            memoryLeak = new MemoryLeak();
//        }
    }

    public void click(View view) {
        for (int i = 0; i < 10000; i++) {
            ImageView imageView = new ImageView(this);
            list.add(imageView);
        }
    }

    class MemoryLeak {
        void doSomeThing() {
            System.out.println("Wheee!!!");
        }
    }
}
