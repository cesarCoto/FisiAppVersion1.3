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
import android.widget.Toast;

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
                //se crea unn intent explicito para mandar un mail a los desarrolladores.
                Intent intentSendEmail = new Intent();
                intentSendEmail.setAction(Intent.ACTION_SENDTO);
                intentSendEmail.setData(Uri.parse("mailto:devfisiapp@gmail.com"));
                intentSendEmail.putExtra(Intent.EXTRA_SUBJECT, "About:FisiAppp");
                /*en caso de no tener instalada la aplicacion de gmail nos notificara y no se podra
                hacer la funcion*/
                try {
                    startActivity(intentSendEmail);
                } catch (Exception e) {
                    Toast.makeText(AboutActivity.this, "Email no fount", Toast.LENGTH_SHORT).show();
                }
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
