package com.example.cesar.aplicacionfisica;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ExamenConversionesActivity extends AppCompatActivity {


    //se crean las vistas y enlazan con ayuda de butterKnife
    @BindView(R.id.respuestaUnoPreguntaUno)
    RadioButton respuestaUnoPreguntaUno;
    @BindView(R.id.respuestaDosPreguntaUno)
    RadioButton respuestaDosPreguntaUno;
    @BindView(R.id.respuestaTresPreguntaUno)
    RadioButton respuestaTresPreguntaUno;
    @BindView(R.id.respuestaCuatroPreguntaUno)
    RadioButton respuestaCuatroPreguntaUno;
    @BindView(R.id.grupoRespuestasUno)
    RadioGroup grupoRespuestasUno;
    @BindView(R.id.respuestaUnoPreguntaDos)
    RadioButton respuestaUnoPreguntaDos;
    @BindView(R.id.respuestaDosPreguntaDos)
    RadioButton respuestaDosPreguntaDos;
    @BindView(R.id.respuestaTresPreguntaDos)
    RadioButton respuestaTresPreguntaDos;
    @BindView(R.id.respuestaCuatroPreguntaDos)
    RadioButton respuestaCuatroPreguntaDos;
    @BindView(R.id.grupoRespuestasDos)
    RadioGroup grupoRespuestasDos;
    @BindView(R.id.respuestaUnoPreguntaTres)
    RadioButton respuestaUnoPreguntaTres;
    @BindView(R.id.respuestaDosPreguntaTres)
    RadioButton respuestaDosPreguntaTres;
    @BindView(R.id.respuestaTresPreguntaTres)
    RadioButton respuestaTresPreguntaTres;
    @BindView(R.id.respuestaCuatroPreguntaTres)
    RadioButton respuestaCuatroPreguntaTres;
    @BindView(R.id.grupoRespuestasTres)
    RadioGroup grupoRespuestasTres;
    @BindView(R.id.respuestaUnoPreguntaCuatro)
    RadioButton respuestaUnoPreguntaCuatro;
    @BindView(R.id.respuestaDosPreguntaCuatro)
    RadioButton respuestaDosPreguntaCuatro;
    @BindView(R.id.respuestaTresPreguntaCuatro)
    RadioButton respuestaTresPreguntaCuatro;
    @BindView(R.id.respuestaCuatroPreguntaCuatro)
    RadioButton respuestaCuatroPreguntaCuatro;
    @BindView(R.id.grupoRespuestasCuatro)
    RadioGroup grupoRespuestasCuatro;
    @BindView(R.id.respuestaUnoPreguntaCinco)
    RadioButton respuestaUnoPreguntaCinco;
    @BindView(R.id.respuestaDosPreguntaCinco)
    RadioButton respuestaDosPreguntaCinco;
    @BindView(R.id.respuestaTresPreguntaCinco)
    RadioButton respuestaTresPreguntaCinco;
    @BindView(R.id.respuestaCuatroPreguntaCinco)
    RadioButton respuestaCuatroPreguntaCinco;
    @BindView(R.id.grupoRespuestasCinco)
    RadioGroup grupoRespuestasCinco;
    @BindView(R.id.respuestaUnoPreguntaSeis)
    RadioButton respuestaUnoPreguntaSeis;
    @BindView(R.id.respuestaDosPreguntaSeis)
    RadioButton respuestaDosPreguntaSeis;
    @BindView(R.id.respuestaTresPreguntaSeis)
    RadioButton respuestaTresPreguntaSeis;
    @BindView(R.id.respuestaCuatroPreguntaSeis)
    RadioButton respuestaCuatroPreguntaSeis;
    @BindView(R.id.grupoRespuestasSeis)
    RadioGroup grupoRespuestasSeis;
    @BindView(R.id.respuestaUnoPreguntaSiete)
    RadioButton respuestaUnoPreguntaSiete;
    @BindView(R.id.respuestaDosPreguntaSiete)
    RadioButton respuestaDosPreguntaSiete;
    @BindView(R.id.respuestaTresPreguntaSiete)
    RadioButton respuestaTresPreguntaSiete;
    @BindView(R.id.respuestaCuatroPreguntaSiete)
    RadioButton respuestaCuatroPreguntaSiete;
    @BindView(R.id.grupoRespuestasSiete)
    RadioGroup grupoRespuestasSiete;
    @BindView(R.id.respuestaUnoPreguntaOcho)
    RadioButton respuestaUnoPreguntaOcho;
    @BindView(R.id.respuestaDosPreguntaOcho)
    RadioButton respuestaDosPreguntaOcho;
    @BindView(R.id.respuestaTresPreguntaOcho)
    RadioButton respuestaTresPreguntaOcho;
    @BindView(R.id.respuestaCuatroPreguntaOcho)
    RadioButton respuestaCuatroPreguntaOcho;
    @BindView(R.id.grupoRespuestasOcho)
    RadioGroup grupoRespuestasOcho;
    @BindView(R.id.respuestaUnoPreguntaNueve)
    RadioButton respuestaUnoPreguntaNueve;
    @BindView(R.id.respuestaDosPreguntaNueve)
    RadioButton respuestaDosPreguntaNueve;
    @BindView(R.id.respuestaTresPreguntaNueve)
    RadioButton respuestaTresPreguntaNueve;
    @BindView(R.id.respuestaCuatroPreguntaNueve)
    RadioButton respuestaCuatroPreguntaNueve;
    @BindView(R.id.grupoRespuestasNueve)
    RadioGroup grupoRespuestasNueve;
    @BindView(R.id.respuestaUnoPreguntaDiez)
    RadioButton respuestaUnoPreguntaDiez;
    @BindView(R.id.respuestaDosPreguntaDiez)
    RadioButton respuestaDosPreguntaDiez;
    @BindView(R.id.respuestaTresPreguntaDiez)
    RadioButton respuestaTresPreguntaDiez;
    @BindView(R.id.respuestaCuatroPreguntaDiez)
    RadioButton respuestaCuatroPreguntaDiez;
    @BindView(R.id.grupoRespuestasDiez)
    RadioGroup grupoRespuestasDiez;
    @BindView(R.id.buttonCalificarConversiones)
    Button buttonCalificarConversiones;

    //el arreglo es creado para poder retener el estado de los checkBox cuando el usuario gira el
    // dispositivo*/
    private int[] radioChecked;

    View viewLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examen_conversiones);
        ButterKnife.bind(this);

        LayoutInflater layoutInflater = getLayoutInflater();
        viewLayout = layoutInflater.inflate(R.layout.custom_toast,(ViewGroup) findViewById(R.id.cutom_toast));
        //iniciamos el metodo verificar para saber si es que el layout se a refrescado o es su
        /*primera vez que se inicia*/
        verificarEstadoAnterior(savedInstanceState);

        /*si es la primera vez que el layout es inflado se guardara el estado de los checkbox*/
        if (savedInstanceState == null) {
            radioChecked = new int[]{
                    grupoRespuestasUno.getCheckedRadioButtonId(),
                    grupoRespuestasDos.getCheckedRadioButtonId(),
                    grupoRespuestasTres.getCheckedRadioButtonId(),
                    grupoRespuestasCuatro.getCheckedRadioButtonId(),
                    grupoRespuestasCinco.getCheckedRadioButtonId(),
                    grupoRespuestasSeis.getCheckedRadioButtonId(),
                    grupoRespuestasSiete.getCheckedRadioButtonId(),
                    grupoRespuestasOcho.getCheckedRadioButtonId(),
                    grupoRespuestasNueve.getCheckedRadioButtonId(),
                    grupoRespuestasDiez.getCheckedRadioButtonId()};
        }
        buttonCalificarConversiones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(ExamenConversionesActivity.this,"Toast:GRAVITY.TOP",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.setView(viewLayout);
                toast.show();
            }
        });
    }
    //este metodo guarda el estado de los checkbox
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putIntArray("estado", radioChecked);
    }
    //optenemos el estado anterior de la pantalla en caso de que exista uno.
    private void verificarEstadoAnterior(Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            radioChecked = savedInstanceState.getIntArray("estado");
            setCheckBoxChecked();
        }
    }
    //se asigna el estado anterior de los checkbox
    private void setCheckBoxChecked() {
        grupoRespuestasUno.check(radioChecked[0]);
        grupoRespuestasDos.check(radioChecked[1]);
        grupoRespuestasTres.check(radioChecked[2]);
        grupoRespuestasCuatro.check(radioChecked[3]);
        grupoRespuestasCinco.check(radioChecked[4]);
        grupoRespuestasSeis.check(radioChecked[5]);
        grupoRespuestasSiete.check(radioChecked[6]);
        grupoRespuestasOcho.check(radioChecked[7]);
        grupoRespuestasNueve.check(radioChecked[8]);
        grupoRespuestasDiez.check(radioChecked[9]);
    }
}
