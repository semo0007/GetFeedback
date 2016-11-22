package com.example.sebastian.gefee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Einloggen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_einloggen);

        final EditText etNutzername = (EditText) findViewById(R.id.etNutzername);
        final EditText etPasswort = (EditText) findViewById(R.id.etPasswort);
        final Button bulogin = (Button) findViewById(R.id.login_button);
        final TextView tvRegister = (TextView) findViewById(R.id.tvRegister);

        /*  Hier wird ein onClick event auf den TextView "Noch kein Mitglied?" angewendet
            Er führt den Nutzer zur Registrieren Activity
        VARIABLENNAME.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent NAME_FÜR_NEUES_INTENT = new Intent(AKTUELLE_ACTIVITY.this, ZIEL_ACTIVITY.class);
            AKTUELLE_ACTIVITY.this.startActivity(NAME_FÜR_NEUES_INTENT);
            }
        });
        */
        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(Einloggen.this, Registrieren.class);
                Einloggen.this.startActivity(registerIntent);
            }
        });

        /* Hier wird ein onClick event auf den Button "Einloggen" angewendet
        Er führt den Nutzer zur Hauptfenster Activity */
        bulogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hauptfensterIntent = new Intent(Einloggen.this, hauptfenster.class);
                Einloggen.this.startActivity(hauptfensterIntent);
            }
        });
    }
}
