package com.example.design_rabin_gurung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText make, color, year, purchase, engine;
    private Button createCar, createDiesel;
    private TextView result;
    private int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        make = findViewById(R.id.make);
        color = findViewById(R.id.color);
        year = findViewById(R.id.year);
        purchase = findViewById(R.id.year);
        engine = findViewById(R.id.engine);

        createCar = findViewById(R.id.createcar);
        createDiesel = findViewById(R.id.creatediesel);


        result = findViewById(R.id.result);
        result.setText("");
        index = 1;

        createCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(make.getText())){
                    make.setError("Please give proper input");
                    return;
                } if(TextUtils.isEmpty(color.getText())){
                    year.setError("Please give proper input");
                    return;
                } if(TextUtils.isEmpty(year.getText())){
                    color.setError("Please give proper input");
                    return;
                } if(TextUtils.isEmpty(purchase.getText())){
                    purchase.setError("Please give proper input");
                    return;
                } if(TextUtils.isEmpty(engine.getText())){
                    engine.setError("Please give proper input");
                    return;
                }

                result.append("This is Vehicle No"+index+"\n");
                index++;

            }
        });

        createDiesel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(make.getText())){
                    make.setError("Please give proper input");
                    return;
                } if(TextUtils.isEmpty(color.getText())){
                    color.setError("Please give proper input");
                    return;
                } if(TextUtils.isEmpty(year.getText())){
                    year.setError("Please give proper input");
                    return;
                } if(TextUtils.isEmpty(purchase.getText())){
                    purchase.setError("Please give proper input");
                    return;
                } if(TextUtils.isEmpty(engine.getText())){
                    engine.setError("Please give proper input");
                    return;
                }

                result.append("Manufacture:"+make.getText().toString()+"; Current value:"+purchase.getText().toString()+"engine size:"+engine.getText().toString()+"\n");

            }
        });

    }


}
