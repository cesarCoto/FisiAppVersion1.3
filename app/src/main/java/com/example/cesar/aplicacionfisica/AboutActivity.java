package com.example.cesar.aplicacionfisica;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /**Boton ir atras*/
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**Se crea un intent especial para mandar un mail.**/
                //se crea
                Intent intentMensaje = new Intent(Intent.ACTION_SEND);
                //se especifican sus datos
                intentMensaje.setData(Uri.parse("email"));
                String [] correo = {"developfisiapp@gmail.com"};
                intentMensaje.putExtra(Intent.EXTRA_EMAIL,correo);
                intentMensaje.putExtra(Intent.EXTRA_SUBJECT,getString(R.string.app_name));
                intentMensaje.putExtra(Intent.EXTRA_TEXT,getString(R.string.email_title));
                intentMensaje.setType("menssage/rfc822");

                /*se crea un intent selector el cual ejecutara una barra en la parte inferior para
                * que el usuario escoja su aplicacion preferida para mandar un mail*/
                Intent chooser = Intent.createChooser(intentMensaje,getString(R.string.mandar_un_email));
                startActivity(chooser);
            }
        });
    }

}
