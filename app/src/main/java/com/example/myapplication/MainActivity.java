package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Khai bao doi tuong làm việc
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Xuly_Cong (View view)
    {
        //=======================
        EditText dk_soA =(EditText) findViewById (R.id.edtA);
        int soA = Integer . parseInt (dk_soA.getText().toString());
        EditText dk_soB =(EditText) findViewById (R.id.edtB);
        int soB = Integer . parseInt (dk_soB.getText().toString());
        int KetQua = soA +soB;
        TextView dk_KQ =(TextView) findViewById (R.id.tvKetQua);
        dk_KQ.setText(  String.valueOf(KetQua)  );
    }

    public void Xuly_Tru (View view)
    {
        //=======================
        EditText dk_soA =(EditText) findViewById (R.id.edtA);
        int soA = Integer . parseInt (dk_soA.getText().toString());
        EditText dk_soB =(EditText) findViewById (R.id.edtB);
        int soB = Integer . parseInt (dk_soB.getText().toString());
        int KetQua = soA - soB;
        TextView dk_KQ =(TextView) findViewById (R.id.tvKetQua);
        dk_KQ.setText(  String.valueOf(KetQua)  );
    }
    public void Xuly_Nhan (View view)
    {
        //=======================
        EditText dk_soA =(EditText) findViewById (R.id.edtA);
        int soA = Integer . parseInt (dk_soA.getText().toString());
        EditText dk_soB =(EditText) findViewById (R.id.edtB);
        int soB = Integer . parseInt (dk_soB.getText().toString());
        int KetQua = soA * soB;
        TextView dk_KQ =(TextView) findViewById (R.id.tvKetQua);
        dk_KQ.setText(  String.valueOf(KetQua)  );
    }
    public void Xuly_Chia (View view)
    {
        //=======================
        EditText dk_soA =(EditText) findViewById (R.id.edtA);
        int soA = Integer . parseInt (dk_soA.getText().toString());
        EditText dk_soB =(EditText) findViewById (R.id.edtB);
        int soB = Integer . parseInt (dk_soB.getText().toString());
        int KetQua = soA / soB;
        TextView dk_KQ =(TextView) findViewById (R.id.tvKetQua);
        dk_KQ.setText(  String.valueOf(KetQua)  );
    }
}