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
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

/***********************************************************************************************/

            /******************Codigo por Cesar Coto y Jose manuel********************/

/***********************************************************************************************/

public class AboutActivity extends AppCompatActivity implements OnClickListener{
    String[]paginas = {"https://androidprototipo.blogspot.mx"};

    LinearLayout linearLayoutItemOurBlogg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /**Boton ir atras*/
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        //Item nuestro Blogg
        linearLayoutItemOurBlogg = findViewById(R.id.linearLayoutBlog);

        linearLayoutItemOurBlogg.setOnClickListener(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new OnClickListener() {
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

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.linearLayoutBlog:
                Intent intentLoadOurBlogg = new Intent(this,WebViewActivity.class);
                intentLoadOurBlogg.putExtra("Web",paginas[0]);
                startActivity(intentLoadOurBlogg);
                break;
        }
    }
}
