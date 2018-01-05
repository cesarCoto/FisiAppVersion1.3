package com.example.cesar.aplicacionfisica;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ExamenTeoricoVectoresActivity extends AppCompatActivity {

    //se crean las vistas y enlazan con ayuda de butterKnife
    @BindView(R.id.respuestaUnoPreguntaUnoVectores)
    RadioButton respuestaUnoPreguntaUnoVectores;
    @BindView(R.id.respuestaDosPreguntaUnoVectores)
    RadioButton respuestaDosPreguntaUnoVectores;
    @BindView(R.id.respuestaTresPreguntaUnoVectores)
    RadioButton respuestaTresPreguntaUnoVectores;
    @BindView(R.id.grupoRespuestasUnoVectores)
    RadioGroup grupoRespuestasUnoVectores;
    @BindView(R.id.respuestaUnoPreguntaDos)
    RadioButton respuestaUnoPreguntaDos;
    @BindView(R.id.respuestaDosPreguntaDosVectores)
    RadioButton respuestaDosPreguntaDosVectores;
    @BindView(R.id.respuestaTresPreguntaDosVectores)
    RadioButton respuestaTresPreguntaDosVectores;
    @BindView(R.id.grupoRespuestasDosVectores)
    RadioGroup grupoRespuestasDosVectores;
    @BindView(R.id.respuestaUnoPreguntaTresVectores)
    RadioButton respuestaUnoPreguntaTresVectores;
    @BindView(R.id.respuestaDosPreguntaTresVectores)
    RadioButton respuestaDosPreguntaTresVectores;
    @BindView(R.id.respuestaTresPreguntaTresVectores)
    RadioButton respuestaTresPreguntaTresVectores;
    @BindView(R.id.grupoRespuestasTresVectores)
    RadioGroup grupoRespuestasTresVectores;
    @BindView(R.id.respuestaUnoPreguntaCuatroVectores)
    RadioButton respuestaUnoPreguntaCuatroVectores;
    @BindView(R.id.respuestaDosPreguntaCuatroVectores)
    RadioButton respuestaDosPreguntaCuatroVectores;
    @BindView(R.id.respuestaTresPreguntaCuatroVectores)
    RadioButton respuestaTresPreguntaCuatroVectores;
    @BindView(R.id.grupoRespuestasCuatroVectores)
    RadioGroup grupoRespuestasCuatroVectores;
    @BindView(R.id.respuestaUnoPreguntaCincoVectores)
    RadioButton respuestaUnoPreguntaCincoVectores;
    @BindView(R.id.respuestaDosPreguntaCincoVectores)
    RadioButton respuestaDosPreguntaCincoVectores;
    @BindView(R.id.respuestaTresPreguntaCincoVectores)
    RadioButton respuestaTresPreguntaCincoVectores;
    @BindView(R.id.grupoRespuestasCincoVectores)
    RadioGroup grupoRespuestasCincoVectores;
    @BindView(R.id.respuestaUnoPreguntaSeisVectores)
    RadioButton respuestaUnoPreguntaSeisVectores;
    @BindView(R.id.respuestaDosPreguntaSeisVectores)
    RadioButton respuestaDosPreguntaSeisVectores;
    @BindView(R.id.respuestaTresPreguntaSeisVectores)
    RadioButton respuestaTresPreguntaSeisVectores;
    @BindView(R.id.respuestaCuatroPreguntaSeisVectores)
    RadioButton respuestaCuatroPreguntaSeisVectores;
    @BindView(R.id.grupoRespuestasSeisVectores)
    RadioGroup grupoRespuestasSeisVectores;
    @BindView(R.id.respuestaUnoPreguntaSieteVectores)
    RadioButton respuestaUnoPreguntaSieteVectores;
    @BindView(R.id.respuestaDosPreguntaSieteVectores)
    RadioButton respuestaDosPreguntaSieteVectores;
    @BindView(R.id.respuestaTresPreguntaSieteVectores)
    RadioButton respuestaTresPreguntaSieteVectores;
    @BindView(R.id.respuestaCuatroPreguntaSieteVectores)
    RadioButton respuestaCuatroPreguntaSieteVectores;
    @BindView(R.id.grupoRespuestasSieteVectores)
    RadioGroup grupoRespuestasSieteVectores;
    @BindView(R.id.respuestaUnoPreguntaOchoVectores)
    RadioButton respuestaUnoPreguntaOchoVectores;
    @BindView(R.id.respuestaDosPreguntaOchoVectores)
    RadioButton respuestaDosPreguntaOchoVectores;
    @BindView(R.id.respuestaTresPreguntaOchoVectores)
    RadioButton respuestaTresPreguntaOchoVectores;
    @BindView(R.id.respuestaCuatroPreguntaOchoVectores)
    RadioButton respuestaCuatroPreguntaOchoVectores;
    @BindView(R.id.grupoRespuestasOchoVectores)
    RadioGroup grupoRespuestasOchoVectores;
    @BindView(R.id.respuestaUnoPreguntaNueveVectores)
    RadioButton respuestaUnoPreguntaNueveVectores;
    @BindView(R.id.respuestaDosPreguntaNueveVectores)
    RadioButton respuestaDosPreguntaNueveVectores;
    @BindView(R.id.respuestaTresPreguntaNueveVectores)
    RadioButton respuestaTresPreguntaNueveVectores;
    @BindView(R.id.respuestaCuatroPreguntaNueveVectores)
    RadioButton respuestaCuatroPreguntaNueveVectores;
    @BindView(R.id.grupoRespuestasNueveVectores)
    RadioGroup grupoRespuestasNueveVectores;
    @BindView(R.id.respuestaUnoPreguntaDiezVectores)
    RadioButton respuestaUnoPreguntaDiezVectores;
    @BindView(R.id.respuestaDosPreguntaDiezVectores)
    RadioButton respuestaDosPreguntaDiezVectores;
    @BindView(R.id.respuestaTresPreguntaDiezVectores)
    RadioButton respuestaTresPreguntaDiezVectores;
    @BindView(R.id.respuestaCuatroPreguntaDiezVectores)
    RadioButton respuestaCuatroPreguntaDiezVectores;
    @BindView(R.id.grupoRespuestasDiezVectores)
    RadioGroup grupoRespuestasDiezVectores;
    @BindView(R.id.buttonCalificarVectores)
    Button buttonCalificarVectores;

    //el arreglo es creado para poder retener el estado de los checkBox cuando el usuario gira el
    // dispositivo*/
    private int[] radioChecked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examen_teorico_vectores);
        ButterKnife.bind(this);
        //iniciamos el metodo verificar para saber si es que el layout se a refrescado o es su
        /*primera vez que se inicia*/
        verificarEstadoAnterior(savedInstanceState);
        /*si es la primera vez que el layout es inflado se guardara el estado de los checkbox*/
        if(savedInstanceState==null){
            radioChecked = new int[]{
                    grupoRespuestasUnoVectores.getCheckedRadioButtonId(),
                    grupoRespuestasDosVectores.getCheckedRadioButtonId(),
                    grupoRespuestasTresVectores.getCheckedRadioButtonId(),
                    grupoRespuestasCuatroVectores.getCheckedRadioButtonId(),
                    grupoRespuestasCincoVectores.getCheckedRadioButtonId(),
                    grupoRespuestasSeisVectores.getCheckedRadioButtonId(),
                    grupoRespuestasSieteVectores.getCheckedRadioButtonId(),
                    grupoRespuestasOchoVectores.getCheckedRadioButtonId(),
                    grupoRespuestasNueveVectores.getCheckedRadioButtonId(),
                    grupoRespuestasDiezVectores.getCheckedRadioButtonId()};
        }

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putIntArray("estadoAnterior",radioChecked);
    }
    //optenemos el estado anterior de la pantalla en caso de que exista uno.
    private void verificarEstadoAnterior(Bundle savedInstanceState) {
        if (savedInstanceState!=null){
            radioChecked = savedInstanceState.getIntArray("estadoAnterior");
            setCheckBoxChecked();
        }
    }
    //se asigna el estado anterior de los checkbox
    private void setCheckBoxChecked() {
        grupoRespuestasUnoVectores.check(radioChecked[0]);
        grupoRespuestasDosVectores.check(radioChecked[1]);
        grupoRespuestasTresVectores.check(radioChecked[2]);
        grupoRespuestasCuatroVectores.check(radioChecked[3]);
        grupoRespuestasCincoVectores.check(radioChecked[4]);
        grupoRespuestasSeisVectores.check(radioChecked[5]);
        grupoRespuestasSieteVectores.check(radioChecked[6]);
        grupoRespuestasOchoVectores.check(radioChecked[7]);
        grupoRespuestasNueveVectores.check(radioChecked[8]);
        grupoRespuestasDiezVectores.check(radioChecked[9]);
    }

}
