package com.example.cesar.aplicacionfisica;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ExamenTeoricoNewtonActivity extends AppCompatActivity {

    //con ayuda de butterKnife referenciamos los elementos en pantalla
    @BindView(R.id.respuestaUnoPreguntaUnoNewton)
    RadioButton respuestaUnoPreguntaUnoNewton;
    @BindView(R.id.respuestaDosPreguntaUnoNewton)
    RadioButton respuestaDosPreguntaUnoNewton;
    @BindView(R.id.respuestaTresPreguntaUnoNewton)
    RadioButton respuestaTresPreguntaUnoNewton;
    @BindView(R.id.respuestaCuatroPreguntaUnoNewton)
    RadioButton respuestaCuatroPreguntaUnoNewton;
    @BindView(R.id.grupoRespuestasUnoNewton)
    RadioGroup grupoRespuestasUnoNewton;
    @BindView(R.id.respuestaUnoPreguntaDosNewton)
    RadioButton respuestaUnoPreguntaDosNewton;
    @BindView(R.id.respuestaDosPreguntaDosNewton)
    RadioButton respuestaDosPreguntaDosNewton;
    @BindView(R.id.grupoRespuestasDosNewton)
    RadioGroup grupoRespuestasDosNewton;
    @BindView(R.id.respuestaUnoPreguntaTresNewton)
    RadioButton respuestaUnoPreguntaTresNewton;
    @BindView(R.id.respuestaDosPreguntaTresNewton)
    RadioButton respuestaDosPreguntaTresNewton;
    @BindView(R.id.grupoRespuestasTresNewton)
    RadioGroup grupoRespuestasTresNewton;
    @BindView(R.id.respuestaUnoPreguntaCuatroNewton)
    RadioButton respuestaUnoPreguntaCuatroNewton;
    @BindView(R.id.respuestaDosPreguntaCuatroNewton)
    RadioButton respuestaDosPreguntaCuatroNewton;
    @BindView(R.id.respuestaTresPreguntaCuatroNewton)
    RadioButton respuestaTresPreguntaCuatroNewton;
    @BindView(R.id.respuestaCuatroPreguntaCuatroNewton)
    RadioButton respuestaCuatroPreguntaCuatroNewton;
    @BindView(R.id.grupoRespuestasCuatroNewton)
    RadioGroup grupoRespuestasCuatroNewton;
    @BindView(R.id.respuestaUnoPreguntaCincoNewton)
    RadioButton respuestaUnoPreguntaCincoNewton;
    @BindView(R.id.respuestaDosPreguntaCincoNewton)
    RadioButton respuestaDosPreguntaCincoNewton;
    @BindView(R.id.respuestaTresPreguntaCincoNewton)
    RadioButton respuestaTresPreguntaCincoNewton;
    @BindView(R.id.respuestaCuatroPreguntaCincoNewton)
    RadioButton respuestaCuatroPreguntaCincoNewton;
    @BindView(R.id.grupoRespuestasCincoNewton)
    RadioGroup grupoRespuestasCincoNewton;
    @BindView(R.id.respuestaUnoPreguntaSeisNewton)
    RadioButton respuestaUnoPreguntaSeisNewton;
    @BindView(R.id.respuestaDosPreguntaSeisNewton)
    RadioButton respuestaDosPreguntaSeisNewton;
    @BindView(R.id.respuestaTresPreguntaSeisNewton)
    RadioButton respuestaTresPreguntaSeisNewton;
    @BindView(R.id.respuestaCuatroPreguntaSeisNewton)
    RadioButton respuestaCuatroPreguntaSeisNewton;
    @BindView(R.id.grupoRespuestasSeisNewton)
    RadioGroup grupoRespuestasSeisNewton;
    @BindView(R.id.respuestaUnoPreguntaSieteNewton)
    RadioButton respuestaUnoPreguntaSieteNewton;
    @BindView(R.id.respuestaDosPreguntaSieteNewton)
    RadioButton respuestaDosPreguntaSieteNewton;
    @BindView(R.id.respuestaTresPreguntaSieteNewton)
    RadioButton respuestaTresPreguntaSieteNewton;
    @BindView(R.id.respuestaCuatroPreguntaSieteNewton)
    RadioButton respuestaCuatroPreguntaSieteNewton;
    @BindView(R.id.grupoRespuestasSieteNewton)
    RadioGroup grupoRespuestasSieteNewton;
    @BindView(R.id.respuestaUnoPreguntaOchoNewton)
    RadioButton respuestaUnoPreguntaOchoNewton;
    @BindView(R.id.respuestaDosPreguntaOchoNewton)
    RadioButton respuestaDosPreguntaOchoNewton;
    @BindView(R.id.respuestaTresPreguntaOchoNewton)
    RadioButton respuestaTresPreguntaOchoNewton;
    @BindView(R.id.respuestaCuatroPreguntaOchoNewton)
    RadioButton respuestaCuatroPreguntaOchoNewton;
    @BindView(R.id.grupoRespuestasOchoNewton)
    RadioGroup grupoRespuestasOchoNewton;
    @BindView(R.id.respuestaUnoPreguntaNueveNewton)
    RadioButton respuestaUnoPreguntaNueveNewton;
    @BindView(R.id.respuestaDosPreguntaNueveNewton)
    RadioButton respuestaDosPreguntaNueveNewton;
    @BindView(R.id.respuestaTresPreguntaNueveNewton)
    RadioButton respuestaTresPreguntaNueveNewton;
    @BindView(R.id.respuestaCuatroPreguntaNueveNewton)
    RadioButton respuestaCuatroPreguntaNueveNewton;
    @BindView(R.id.grupoRespuestasNueveNewton)
    RadioGroup grupoRespuestasNueveNewton;
    @BindView(R.id.respuestaUnoPreguntaDiezNewton)
    RadioButton respuestaUnoPreguntaDiezNewton;
    @BindView(R.id.respuestaDosPreguntaDiezNewton)
    RadioButton respuestaDosPreguntaDiezNewton;
    @BindView(R.id.respuestaTresPreguntaDiezNewton)
    RadioButton respuestaTresPreguntaDiezNewton;
    @BindView(R.id.respuestaCuatroPreguntaDiezNewton)
    RadioButton respuestaCuatroPreguntaDiezNewton;
    @BindView(R.id.grupoRespuestasDiezNewton)
    RadioGroup grupoRespuestasDiezNewton;
    @BindView(R.id.buttonCalificarNewton)
    Button buttonCalificarNewton;

    //creamos una varible que guardara el estado de la pantalla para cuando giremos el dispositivo
    // esta recupera su estado*/
    private int[] radioChecked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examen_teorico_newton);
        ButterKnife.bind(this);

        verfiricarEstadoAnterior(savedInstanceState);
        /*si es la primera vez que el layout es inflado se guardara el estado de los checkbox*/
        if (savedInstanceState == null){
            radioChecked = new int[]{
                    grupoRespuestasUnoNewton.getCheckedRadioButtonId(),
                    grupoRespuestasDosNewton.getCheckedRadioButtonId(),
                    grupoRespuestasTresNewton.getCheckedRadioButtonId(),
                    grupoRespuestasCuatroNewton.getCheckedRadioButtonId(),
                    grupoRespuestasCincoNewton.getCheckedRadioButtonId(),
                    grupoRespuestasSeisNewton.getCheckedRadioButtonId(),
                    grupoRespuestasSieteNewton.getCheckedRadioButtonId(),
                    grupoRespuestasOchoNewton.getCheckedRadioButtonId(),
                    grupoRespuestasNueveNewton.getCheckedRadioButtonId(),
                    grupoRespuestasDiezNewton.getCheckedRadioButtonId()
            };
        }
    }
    //optenemos el estado anterior de la pantalla en caso de que exista uno.
    private void verfiricarEstadoAnterior(Bundle savedInstanceState) {
        if(savedInstanceState !=null){
            radioChecked = savedInstanceState.getIntArray("estadoDeLaPatalla");
            setCheckBoxChecked();
        }
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //guardamos el valor de estado
        outState.putIntArray("estadoDeLaPatalla",radioChecked);

    }
    private void setCheckBoxChecked() {
        grupoRespuestasUnoNewton.check(radioChecked[0]);
        grupoRespuestasDosNewton.check(radioChecked[1]);
        grupoRespuestasTresNewton.check(radioChecked[2]);
        grupoRespuestasCuatroNewton.check(radioChecked[3]);
        grupoRespuestasCincoNewton.check(radioChecked[4]);
        grupoRespuestasSeisNewton.check(radioChecked[5]);
        grupoRespuestasSieteNewton.check(radioChecked[6]);
        grupoRespuestasOchoNewton.check(radioChecked[7]);
        grupoRespuestasNueveNewton.check(radioChecked[8]);
        grupoRespuestasDiezNewton.check(radioChecked[9]);
    }
}
