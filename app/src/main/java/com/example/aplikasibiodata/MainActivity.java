package com.example.aplikasibiodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMap(View view){
        Intent it = new Intent(Intent.ACTION_VIEW);
        String url = "https://www.google.com/maps/place/Jl.+Sekayu+Kepatihan+No.268a,+Sekayu,+Kec.+Semarang+Tengah,+Kota+Semarang,+Jawa+Tengah+50132/@-6.9804488,110.4157622,21z/data=!4m5!3m4!1s0x2e708b52218dd601:0x74ff70d43ce879a2!8m2!3d-6.980438!4d110.4158866";
        it.setData(Uri.parse(url));
        startActivity(it);
    }

    public void cellphone(View view) {
        Uri uri = Uri.parse("tel:082325446477");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void email(View view) {
        Intent it = new Intent(Intent.ACTION_SENDTO,
                Uri.fromParts("mailto","hast4ning@gmail.com", null));
        startActivity(it);

    }
}