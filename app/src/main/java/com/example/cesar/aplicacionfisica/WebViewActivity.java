package com.example.cesar.aplicacionfisica;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.Toast;

/***********************************************************************************************/

            /******************Codigo por Cesar Coto y Jose manuel********************/

/***********************************************************************************************/

public class WebViewActivity extends AppCompatActivity {

    //se crean los objetos para enlazarlos con las vistas
    ImageView imageViewNoInternet;
    WebView webViewPag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        //Se oculta el ActionBar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
         /*Se instancian las vistas con las clase java*/
        imageViewNoInternet = findViewById(R.id.imageViewNoInternet);
        webViewPag = findViewById(R.id.webView);
        //se crea un nuevo cliente para el WebView
        webViewPag.setWebViewClient(new WebViewClient());
        //se activa JavaScrip en el webView
        WebSettings webSettings = webViewPag.getSettings();
        webSettings.setJavaScriptEnabled(true);

        /**Se optiene el datos mandado por la actividad que inicio esta actividad*/
        //bundle es el encargado de los datos que son transmitidos de actividad a actividad
        Bundle extras = getIntent().getExtras();
        //se crea un string que tomara el valor que es obtenido en bundle
        String data = extras.getString("Web");

        /**Se obtiene el estado de la red**/
        //obtiene el servisio de internet
        ConnectivityManager connectivityManager = (ConnectivityManager)
                this.getSystemService(Context.CONNECTIVITY_SERVICE);
        //obtiene el estado
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);

        if(networkInfo.isConnected()){
            /**Si estamos conectados entonces el webView cargara la pagina mandada desde la
             * anterior actividad**/
            //se hace invisible el ImageView
            imageViewNoInternet.setVisibility(View.GONE);
            //se hace visible el webView
            webViewPag.setVisibility(View.VISIBLE);
            webViewPag.loadUrl(data);
        }else{
            Toast.makeText(this, "No tienes conexion a internet en este momento",
                    Toast.LENGTH_SHORT).show();
        }

    }
}
