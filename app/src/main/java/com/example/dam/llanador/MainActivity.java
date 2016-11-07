package com.example.dam.llanador;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText = (EditText) findViewById(R.id.search);
        ImageButton imageButton = (ImageButton) findViewById(R.id.searchButton);
        imageButton.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View view){
                String buscar = editText.getText().toString();
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, buscar);
                startActivity(intent);
            }
        });
        final EditText phoneText = (EditText) findViewById(R.id.phone);
        ImageButton imageButton1 = (ImageButton) findViewById(R.id.phoneButton);
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = phoneText.getText().toString();
                Uri uri = Uri.parse("tel:"+phone);
                Intent intent2 = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent2);
            }
        });
        final EditText emailText = (EditText) findViewById(R.id.email);
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.emailButton);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emailText.getText().toString();
                Uri uri1 = Uri.parse("mailto:"+email);
                Intent intent3 = new Intent(Intent.ACTION_SENDTO, uri1);
                startActivity(intent3);
            }
        });

    }
}
