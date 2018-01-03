package com.example.cesar.aplicacionfisica;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class ExamenPracticoVectoresActivity extends AppCompatActivity {
    /***********************************************************************************************/

                /******************Codigo por Cesar Coto y Jose manuel********************/

    /***********************************************************************************************/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examen_practico_vectores);
    }
    /**onCrateOptionsMenu es el metodo mediante el cual instanciamos el popup menu en la
     * Activity, aqui se selecciona el menu y se infla*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_vectors,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_helpVectors:
                /**se crea un dialogo que contenga el formulario**/
                final Dialog fullScreenDialogFormulario =
                        new Dialog(ExamenPracticoVectoresActivity.this,
                        R.style.DialogFullscreen);
                fullScreenDialogFormulario.setContentView(R.layout.formulario_vectores);
                ImageView imageViewCloseDialog =
                        fullScreenDialogFormulario.findViewById(R.id.close_formulario_vectores);
                /*se asigna un onclickListener al imageView para que al hacer click sonbre este se
                 * cierre el dialogo */
                imageViewCloseDialog.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        fullScreenDialogFormulario.dismiss();
                    }
                });
                fullScreenDialogFormulario.show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
