package com.example.cesar.aplicacionfisica;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    //estado es una varible que sirve para la orientazion de nuestro layout
    private int estado = 0;
    /***********************************************************************************************/

    /******************Codigo por Cesar Coto y Jose manuel********************/

    /***********************************************************************************************/
    /**
     * Metodo del menu estilo BottomNavigation
     **/
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            /*Se crea un fragmentManager para poder hacer los cambios de pantalla segun sea necesario*/

            /**
             * FragmentManager indica el solporte para hacer cambio de pantallas
             * Fragment transaction indica el cambio de pantalla
             **/

            /*El switch funcionara como lector de eventos donde al presionsar cierto elemento
            a la pantalla indicada (Fragment) cambiara  ya que cambia el valor de estado y luego entra
            al metodo cambio que es donde hacemos los cambio de fragment*/
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    estado = 0;
                    cabio();
                    return true;
                case R.id.navigation_examen:
                    estado = 1;
                    cabio();
                    return true;

                case R.id.navigation_mas:
                    estado = 2;
                    cabio();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Se instancian las vistas con las clase java*/

        /**Se instancia el panel de navegacion**/
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        recargarPantalla(savedInstanceState);

        if (estado == 0){
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.contenido, new HomeFragment()).commit();
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("valorDeEstado",estado);
    }

    public void recargarPantalla(Bundle bundle){
        if(bundle!=null){
            estado = bundle.getInt("valorDeEstado");
        }
    }
    /*este metodo se encarga de los cambios de layout*/
    private void cabio(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        switch (estado){
            case 0:
                transaction.replace(R.id.contenido, new HomeFragment()).commit();
                break;
            case 1:
                transaction.replace(R.id.contenido, new ExamenesFragment()).commit();
                break;
            case 2:
                transaction.replace(R.id.contenido, new VideosFragment()).commit();
                break;
        }
    }
    /**
     * onCrateOptionsMenu es el metodo mediante el cual instanciamos el popup menu en la
     * Activity, aqui se selecciona el menu y se infla
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    /**
     * onOptionItemSelected es el metodo mediante el cual identificaremos que opcion de nuestro menu
     * se a seleccionada y que accion realizaremos
     **/
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //el switch obtiene el id del elemento seleccionado y lo analiza con los casos disponibles.
        switch (item.getItemId()) {

            case R.id.action_comentarios:
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
                    Toast.makeText(MainActivity.this, "Email no fount", Toast.LENGTH_SHORT).show();
                }
                break;
            /**Caso de que hay de nuevo en este caso creamos un dialogo de a lerta donde indicamos las
             * novedades de la version*/
            case R.id.action_queHayDeNuevo:
                //se crea un AletDialog y se asigna el contenido que este tendra
                new AlertDialog.Builder(this)
                        .setTitle(getString(R.string.version_app))
                        .setIcon(R.mipmap.ic_launcher)
                        .setMessage(getString(R.string.item_uno_carac) + "\n" + getString(R.string.item_dos_carac) +
                                "\n" + getString(R.string.item_tres_carac) + "\n" + getString(R.string.item_cuatro_carac) +
                                "\n" + getString(R.string.item_cinco_carac) + "\n" + getString(R.string.item_static))

                        /**Se crea un clickListener y se implementa al boton más en el dialogo para que este
                         * inicialize la Activity WebView**/
                        .setNegativeButton(getString(R.string.more_button), new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                //se crea el intent
                                Intent intentPorgramaDeActualizaciones =
                                        new Intent(MainActivity.this, WebViewActivity.class);
                                intentPorgramaDeActualizaciones.putExtra("Web",
                                        "https://sites.google.com/view/datosfisiapp/p%C3%A1gina-principal");
                                startActivity(intentPorgramaDeActualizaciones);
                            }
                        })
                        .setPositiveButton(getString(R.string.ok_button), null)
                        .show();
                break;
            /**Caso about en este caso creamos un intent para iniciar la ActivityAbout**/
            case R.id.action_about:
                Intent intentAboutActivity = new Intent(this, AboutActivity.class);
                startActivity(intentAboutActivity);
                break;
        }
        //se regresa la opcion seleccionada
        return super.onOptionsItemSelected(item);
    }
}
