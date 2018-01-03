package com.example.cesar.aplicacionfisica;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import java.util.zip.Inflater;

public class ExamenPracticoNewtonActivity extends AppCompatActivity {
    /***********************************************************************************************/

              /******************Codigo por Cesar Coto y Jose manuel********************/

    /***********************************************************************************************/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examen_practico_newton);
    }
    /**onCrateOptionsMenu es el metodo mediante el cual instanciamos el popup menu en la
     * Activity, aqui se selecciona el menu y se infla*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_leyes_newton, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_helpNewton:
                final Dialog fullScreenDialogHelpNewton =
                        new Dialog(ExamenPracticoNewtonActivity.this,
                                R.style.DialogFullscreen);
                fullScreenDialogHelpNewton.setContentView(R.layout.formulario_newton);
                ImageView imageViewCloseDialog =
                        fullScreenDialogHelpNewton.findViewById(R.id.close_formulario_newton);
                imageViewCloseDialog.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        fullScreenDialogHelpNewton.dismiss();
                    }
                });
                fullScreenDialogHelpNewton.show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
