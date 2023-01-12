package com.example.joelvalera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class JoelValera extends AppCompatActivity {
    String nom, cognoms;
    TextView text, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joel_valera);
        text = (TextView) findViewById(R.id.nom);
        text2 = (TextView) findViewById(R.id.cognom);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
                     nom = extras.getString("nom");
                    cognoms = extras.getString("cognoms");
               }
            text.setText(extras.getString("nom"));
            text2.setText(extras.getString("cognoms"));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.arrow_left:
                Intent intent = new Intent(JoelValera.this, Perfil.class);
                startActivity(intent);
                return true;
            case R.id.arrow_right:
                Intent intent2 = new Intent(JoelValera.this, JoelValera.class);
                startActivity(intent2);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

}