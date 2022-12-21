package com.example.unite4_karavedonguyapilari;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText number;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        number=findViewById(R.id.editTextNumber);
    }
    public void kontrolEt(View view){
        int sayi = Integer.parseInt(number.getText().toString());
        if(sayi>100){
            Toast.makeText(this, "100’den Büyük Not Olamaz", Toast.LENGTH_SHORT).show();
        }
    }

}
