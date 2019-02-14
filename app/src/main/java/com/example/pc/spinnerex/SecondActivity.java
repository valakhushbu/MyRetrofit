package com.example.pc.spinnerex;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        imageView = findViewById(R.id.imageGet);
        textView = findViewById(R.id.txtGet);

        Bitmap bitmap = (Bitmap) this.getIntent().getParcelableExtra("Bitmap");
        imageView.setImageBitmap(bitmap);
    }
}
