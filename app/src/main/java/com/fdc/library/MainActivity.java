package com.fdc.library;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.fdc.mylibrary.CClass;
import com.google.android.material.snackbar.Snackbar;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    public String m_strFirstMsg = "This is the First Method";
    public String m_strSecondMsg = "This is the Second Method";
    public String m_strThirdMsg = "This is the Third Method";
    public String m_strFourthMsg = "This is the Fourth Method";

    public Map<String, Integer> mapOne, mapTwo;

    public String strKeyOne = "One";
    public String strKeyTwo = "Two";

    public int nComputeResult = 0;

    EditText editTextFirst, editTextSecond;

    Button btnCompute;

    TextView txtViewResult;

    public String RESULT_TAG = "Result: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();

        if(actionBar != null) {
            actionBar.hide();
        }

        editTextFirst = findViewById(R.id.idEditTxtOne);
        editTextSecond = findViewById(R.id.idEditTxtTwo);

        btnCompute = findViewById(R.id.idBtnCompute);

        txtViewResult = findViewById(R.id.idTxtVwResult);

        mapOne = new HashMap<>();
        mapTwo = new HashMap<>();

        btnCompute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btnCompute.setBackgroundColor(Color.GREEN);

                if(editTextFirst.getText().toString() == null || editTextFirst.getText().toString().isEmpty()) {
                    Snackbar.make(findViewById(R.id.idContainerView), "Please Enter Value", Snackbar.LENGTH_LONG).show();
                    return;
                }

                if(editTextSecond.getText().toString() == null || editTextSecond.getText().toString().isEmpty()) {
                    Snackbar.make(findViewById(R.id.idContainerView), "Please Enter Value", Snackbar.LENGTH_LONG).show();
                    return;
                }

                nComputeResult = CClass.computeWithRespectToMapObjects(
                        mapOne,
                        strKeyOne,
                        mapTwo,
                        strKeyTwo,
                        Integer.parseInt(editTextFirst.getText().toString()),
                        Integer.parseInt(editTextSecond.getText().toString())
                );

                txtViewResult.setTextColor(Color.BLACK);
                txtViewResult.setText(RESULT_TAG + String.valueOf(nComputeResult));

            }
        });
    }
}