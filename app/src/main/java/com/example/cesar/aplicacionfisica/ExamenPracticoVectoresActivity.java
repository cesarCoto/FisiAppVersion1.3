package com.example.cesar.aplicacionfisica;

import android.app.Dialog;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ExamenPracticoVectoresActivity extends AppCompatActivity {
    @BindView(R.id.respuesta_newtons_problema_uno_vectores)
    TextInputEditText respuestaNewtonsProblemaUnoVectores;
    @BindView(R.id.respuesta_grados_problema_uno_vectores)
    TextInputEditText respuestaGradosProblemaUnoVectores;
    @BindView(R.id.respuesta_metros_problema2_uno_vectores)
    TextInputEditText respuestaMetrosProblema2UnoVectores;
    @BindView(R.id.respuesta_grados_problema2_uno_vectores)
    TextInputEditText respuestaGradosProblema2UnoVectores;
    @BindView(R.id.respuesta_centimetros_problema3_uno_vectores)
    TextInputEditText respuestaCentimetrosProblema3UnoVectores;
    @BindView(R.id.respuesta_grados_problema3_uno_vectores)
    TextInputEditText respuestaGradosProblema3UnoVectores;
    @BindView(R.id.respuesta_centimetros_problema4_uno_vectores)
    TextInputEditText respuestaCentimetrosProblema4UnoVectores;
    @BindView(R.id.respuesta_grados_problema4_uno_vectores)
    TextInputEditText respuestaGradosProblema4UnoVectores;
    @BindView(R.id.buttonCalificarExamenPracticoVectores)
    Button buttonCalificarExamenPracticoVectores;
    /***********************************************************************************************/

    /******************Codigo por Cesar Coto y Jose manuel********************/

    /***********************************************************************************************/


    View tostadaCustom;
    TextView textViewResultado;
    ImageView imageViewResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examen_practico_vectores);
        ButterKnife.bind(this);

        Toast.makeText(this, getString(R.string.instrucccion), Toast.LENGTH_LONG).show();

        LayoutInflater layoutInflater = getLayoutInflater();
        tostadaCustom = layoutInflater.inflate(R.layout.custom_toast,(ViewGroup) findViewById(R.id.cutom_toast));
         textViewResultado  = tostadaCustom.findViewById(R.id.textExamResult);
         imageViewResultado = tostadaCustom.findViewById(R.id.examResult);

    }


    /**
     * onCrateOptionsMenu es el metodo mediante el cual instanciamos el popup menu en la
     * Activity, aqui se selecciona el menu y se infla
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_vectors, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
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

    @OnClick(R.id.buttonCalificarExamenPracticoVectores)
    public void onViewClicked() {
        String respuestaUnoPreguntaUno = respuestaNewtonsProblemaUnoVectores.getText().toString();
        String respuestaDosPreguntaUno = respuestaGradosProblemaUnoVectores.getText().toString();
        if (respuestaUnoPreguntaUno.length() == 0) {
            respuestaUnoPreguntaUno = "0";
        }
        if (respuestaDosPreguntaUno.length() == 0) {
            respuestaDosPreguntaUno = "0";
        }

        String respuestaUnoPreguntaDos = respuestaMetrosProblema2UnoVectores.getText().toString();
        String respuestaDosPreguntaDos = respuestaGradosProblema2UnoVectores.getText().toString();

        if (respuestaUnoPreguntaDos.length() == 0) {
            respuestaUnoPreguntaDos = "0";
        }
        if (respuestaDosPreguntaDos.length() == 0) {
            respuestaDosPreguntaDos = "0";
        }

        String respuestaUnoPreguntaTres = respuestaCentimetrosProblema3UnoVectores.getText().toString();
        String respuestaDosPreguntaTres = respuestaGradosProblema3UnoVectores.getText().toString();

        if (respuestaUnoPreguntaTres.length()==0){
            respuestaUnoPreguntaTres = "0";
        }
        if (respuestaDosPreguntaTres.length() ==0){
            respuestaDosPreguntaTres = "0";
        }

        String respuestaUnoPreguntaCuatro = respuestaCentimetrosProblema4UnoVectores.getText().toString();
        String respuestaDosPreguntaCuatro = respuestaGradosProblema4UnoVectores.getText().toString();

        if (respuestaUnoPreguntaCuatro.length() == 0){
            respuestaUnoPreguntaCuatro = "0";
        }
        if (respuestaDosPreguntaCuatro.length() == 0){
            respuestaDosPreguntaCuatro = "0";
        }
        //se crea la variable Calificacion para guardar los aciertos del usuario
        int calificacion = 0;

        //se crea variables con la respuesta
        int resUnoRealPregUno = 100;
        int resDosRealPregUno = 110;

        int ResUnoUsuario = Integer.parseInt(respuestaUnoPreguntaUno);
        int ResDosUsuario = Integer.parseInt(respuestaDosPreguntaUno);

        //estado de la espuesta
        boolean estado1Preg1 = false;
        boolean estado2Preg1 = false;
        // se verifica la primera pregunta

        if (ResUnoUsuario == resUnoRealPregUno){
            estado1Preg1 = true;
        } else {
            respuestaNewtonsProblemaUnoVectores.setError(getString(R.string.verifica_tu_estado));
        }

        if (ResDosUsuario == resDosRealPregUno){
            estado2Preg1 = true;
        } else {
            respuestaGradosProblemaUnoVectores.setError(getString(R.string.verifica_tu_estado));
        }
        if (estado1Preg1 && estado2Preg1){
            calificacion = calificacion + 1;
        }
        /**Pregunta Dos**/
        //se crea variables con la respuesta
        int resUnoRealPregDos = 201;
        int resDosRealPregDos = 197;

        int ResUnoUsuarioDos = Integer.parseInt(respuestaUnoPreguntaDos);
        int ResDosUsuarioDos = Integer.parseInt(respuestaDosPreguntaDos);

        //estado de la espuesta
        boolean estado1Preg2 = false;
        boolean estado2Preg2 = false;
        // se verifica la primera pregunta

        if (ResUnoUsuarioDos == resUnoRealPregDos){
            estado1Preg2 = true;
        } else {
            respuestaMetrosProblema2UnoVectores.setError(getString(R.string.verifica_tu_estado));
        }

        if (ResDosUsuarioDos == resDosRealPregDos){
            estado2Preg2 = true;
        } else {
            respuestaGradosProblema2UnoVectores.setError(getString(R.string.verifica_tu_estado));
        }
        if (estado1Preg2 && estado2Preg2){
            calificacion = calificacion + 1;
        }
        /**pregunta tres**/
        //se crea variables con la respuesta
        int resUnoRealPregTres = 45;
        int resDosRealPregTres = 57;

        int ResUnoUsuarioTres = Integer.parseInt(respuestaUnoPreguntaTres);
        int ResDosUsuarioTres = Integer.parseInt(respuestaDosPreguntaTres);

        //estado de la espuesta
        boolean estado1Preg3 = false;
        boolean estado2Preg3 = false;
        // se verifica la primera pregunta

        if (ResUnoUsuarioTres == resUnoRealPregTres){
            estado1Preg3 = true;
        } else {
            respuestaCentimetrosProblema3UnoVectores.setError(getString(R.string.verifica_tu_estado));
        }

        if (ResDosUsuarioTres == resDosRealPregTres){
            estado2Preg3 = true;
        } else {
            respuestaGradosProblema3UnoVectores.setError(getString(R.string.verifica_tu_estado));
        }
        if (estado1Preg3 && estado2Preg3){
            calificacion = calificacion + 1;
        }

        /**Pregunta Cuatro**/
        //se crea variables con la respuesta
        int resUnoRealPregCuatro = 45;
        int resDosRealPregCuatro = 57;

        int ResUnoUsuarioCuatro = Integer.parseInt(respuestaUnoPreguntaCuatro);
        int ResDosUsuarioCuatro = Integer.parseInt(respuestaDosPreguntaCuatro);

        //estado de la espuesta
        boolean estado1Preg4 = false;
        boolean estado2Preg4 = false;
        // se verifica la primera pregunta

        if (ResUnoUsuarioTres == resUnoRealPregCuatro){
            estado1Preg4 = true;
        } else {
            respuestaCentimetrosProblema4UnoVectores.setError(getString(R.string.verifica_tu_estado));
        }

        if (ResDosUsuarioTres == resDosRealPregCuatro){
            estado2Preg4 = true;
        } else {
            respuestaGradosProblema4UnoVectores.setError(getString(R.string.verifica_tu_estado));
        }
        if (estado1Preg4 && estado2Preg4){
            calificacion = calificacion + 1;
        }

        //verificamos si el usuario aprobo el examen
        // se crea la tostada para mostrar
        Toast toast = Toast.makeText(ExamenPracticoVectoresActivity.this,"Toast:GRAVITY.TOP",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setView(tostadaCustom);

        if (calificacion == 4 || calificacion > 2){
            String mensage = getString(R.string.textCongratulations) +
                    " " + String.valueOf(calificacion) + getString(R.string.numero_de_4);
            textViewResultado.setText(mensage);
            imageViewResultado.setImageResource(R.drawable.success);
            toast.show();
        }
        if (calificacion == 2 || calificacion < 2){
            String mensageNegativo = getString(R.string.textTryAgain) + " " +
                    String.valueOf(calificacion)+ getString(R.string.numero_de_4);
            textViewResultado.setText(mensageNegativo);
            imageViewResultado.setImageResource(R.drawable.error);
            toast.show();
        }

    }
}
