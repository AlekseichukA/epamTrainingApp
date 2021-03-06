package com.example.aaa.epamTraining;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.net.URL;

import static com.example.aaa.epamTraining.Utils.NetworkUtils.generateURL;

public class MainActivity extends AppCompatActivity {

    private EditText searchField;
    private Button button;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchField = findViewById(R.id.et_search_field);
        button = findViewById(R.id.b_searh_vk);
        result = findViewById(R.id.tv_result);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                URL generatedURL = generateURL(searchField.getText().toString());
                result.setText(generatedURL.toString());
            }
        };

        button.setOnClickListener(onClickListener);
    }
}
