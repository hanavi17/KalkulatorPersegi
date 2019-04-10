package com.example.ldankpersegi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnOK;
    private EditText editLuas, editKeliing, editSisi;
    private TextView txtLuas, txtKeliling, txtSisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
        initEvent();
    }

    private void initUI() {
        txtSisi = (TextView)findViewById(R.id.txtSisi);
        txtLuas = (TextView)findViewById(R.id.txtLuas);
        txtKeliling = (TextView)findViewById(R.id.txtKeliling);
        editSisi = (EditText)findViewById(R.id.editSisi);
        editLuas = (EditText)findViewById(R.id.editLuas);
        editKeliing = (EditText)findViewById(R.id.editKeliling);
        btnOK = (Button)findViewById(R.id.btnOk);
    }
    private void initEvent(){
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuas();
                hitungKeliling();
            }
        });
    }

    private void hitungLuas() {
        int sisi = Integer.parseInt(editSisi.getText().toString());
        int luas = sisi*sisi;
        editLuas.setText(luas+"");
    }
    private void hitungKeliling() {
        int sisi = Integer.parseInt(editSisi.getText().toString());
        int keliling = 4*sisi;
        editKeliing.setText(keliling+"");
    }
}
