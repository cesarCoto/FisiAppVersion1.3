package com.example.cesar.aplicacionfisica;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ExamenTeoricoMagnitudesActivity extends AppCompatActivity {
    //con ayuda de butterKnife referenciamos los elementos en pantalla

    @BindView(R.id.respuestaUnoPreguntaUnoMagnitudes)
    RadioButton respuestaUnoPreguntaUnoMagnitudes;
    @BindView(R.id.respuestaDosPreguntaUnoMagnitudes)
    RadioButton respuestaDosPreguntaUnoMagnitudes;
    @BindView(R.id.respuestaTresPreguntaUnoMagnitudes)
    RadioButton respuestaTresPreguntaUnoMagnitudes;
    @BindView(R.id.grupoRespuestasUnoMagnitudes)
    RadioGroup grupoRespuestasUnoMagnitudes;
    @BindView(R.id.respuestaUnoPreguntaDosMagnitudes)
    RadioButton respuestaUnoPreguntaDosMagnitudes;
    @BindView(R.id.respuestaDosPreguntaDosMagnitudes)
    RadioButton respuestaDosPreguntaDosMagnitudes;
    @BindView(R.id.grupoRespuestasDosMagnitudes)
    RadioGroup grupoRespuestasDosMagnitudes;
    @BindView(R.id.respuestaUnoPreguntaTresMagnitudes)
    RadioButton respuestaUnoPreguntaTresMagnitudes;
    @BindView(R.id.respuestaDosPreguntaTresMagnitudes)
    RadioButton respuestaDosPreguntaTresMagnitudes;
    @BindView(R.id.respuestaTresPreguntaTresMagnitudes)
    RadioButton respuestaTresPreguntaTresMagnitudes;
    @BindView(R.id.grupoRespuestasTresMagnitudes)
    RadioGroup grupoRespuestasTresMagnitudes;
    @BindView(R.id.respuestaUnoPreguntaCuatroMagnitudes)
    RadioButton respuestaUnoPreguntaCuatroMagnitudes;
    @BindView(R.id.respuestaDosPreguntaCuatroMagnitudes)
    RadioButton respuestaDosPreguntaCuatroMagnitudes;
    @BindView(R.id.grupoRespuestasCuatroMagnitudes)
    RadioGroup grupoRespuestasCuatroMagnitudes;
    @BindView(R.id.respuestaUnoPreguntaCincoMagnitudes)
    RadioButton respuestaUnoPreguntaCincoMagnitudes;
    @BindView(R.id.respuestaDosPreguntaCincoMagnitudes)
    RadioButton respuestaDosPreguntaCincoMagnitudes;
    @BindView(R.id.grupoRespuestasCincoMagnitudes)
    RadioGroup grupoRespuestasCincoMagnitudes;
    @BindView(R.id.respuestaUnoPreguntaSeisMagnitudes)
    RadioButton respuestaUnoPreguntaSeisMagnitudes;
    @BindView(R.id.respuestaDosPreguntaSeisMagnitudes)
    RadioButton respuestaDosPreguntaSeisMagnitudes;
    @BindView(R.id.respuestaTresPreguntaSeisMagnitudes)
    RadioButton respuestaTresPreguntaSeisMagnitudes;
    @BindView(R.id.respuestaCuatroPreguntaSeisMagnitudes)
    RadioButton respuestaCuatroPreguntaSeisMagnitudes;
    @BindView(R.id.grupoRespuestasSeisMagnitudes)
    RadioGroup grupoRespuestasSeisMagnitudes;
    @BindView(R.id.respuestaUnoPreguntaSieteMagnitudes)
    RadioButton respuestaUnoPreguntaSieteMagnitudes;
    @BindView(R.id.respuestaDosPreguntaSieteMagnitudes)
    RadioButton respuestaDosPreguntaSieteMagnitudes;
    @BindView(R.id.respuestaTresPreguntaSieteMagnitudes)
    RadioButton respuestaTresPreguntaSieteMagnitudes;
    @BindView(R.id.respuestaCuatroPreguntaSieteMagnitudes)
    RadioButton respuestaCuatroPreguntaSieteMagnitudes;
    @BindView(R.id.grupoRespuestasSieteMagnitudes)
    RadioGroup grupoRespuestasSieteMagnitudes;
    @BindView(R.id.respuestaUnoPreguntaOchoMagnitudes)
    RadioButton respuestaUnoPreguntaOchoMagnitudes;
    @BindView(R.id.respuestaDosPreguntaOchoMagnitudes)
    RadioButton respuestaDosPreguntaOchoMagnitudes;
    @BindView(R.id.respuestaTresPreguntaOchoMagnitudes)
    RadioButton respuestaTresPreguntaOchoMagnitudes;
    @BindView(R.id.respuestaCuatroPreguntaOchoMagnitudes)
    RadioButton respuestaCuatroPreguntaOchoMagnitudes;
    @BindView(R.id.grupoRespuestasOchoMagnitudes)
    RadioGroup grupoRespuestasOchoMagnitudes;
    @BindView(R.id.respuestaUnoPreguntaNueveMagnitudes)
    RadioButton respuestaUnoPreguntaNueveMagnitudes;
    @BindView(R.id.respuestaDosPreguntaNueveMagnitudes)
    RadioButton respuestaDosPreguntaNueveMagnitudes;
    @BindView(R.id.respuestaTresPreguntaNueveMagnitudes)
    RadioButton respuestaTresPreguntaNueveMagnitudes;
    @BindView(R.id.respuestaCuatroPreguntaNueveMagnitudes)
    RadioButton respuestaCuatroPreguntaNueveMagnitudes;
    @BindView(R.id.grupoRespuestasNueveMagnitudes)
    RadioGroup grupoRespuestasNueveMagnitudes;
    @BindView(R.id.respuestaUnoPreguntaDiezMagnitudes)
    RadioButton respuestaUnoPreguntaDiezMagnitudes;
    @BindView(R.id.respuestaDosPreguntaDiezMagnitudes)
    RadioButton respuestaDosPreguntaDiezMagnitudes;
    @BindView(R.id.respuestaTresPreguntaDiezMagnitudes)
    RadioButton respuestaTresPreguntaDiezMagnitudes;
    @BindView(R.id.respuestaCuatroPreguntaDiezMagnitudes)
    RadioButton respuestaCuatroPreguntaDiezMagnitudes;
    @BindView(R.id.grupoRespuestasDiezMagnitudes)
    RadioGroup grupoRespuestasDiezMagnitudes;
    @BindView(R.id.buttonCalificarMagnitudes)
    Button buttonCalificarMagnitudes;


    //creamos una varible que guardara el estado de la pantalla para cuando giremos el dispositivo
    // esta recupera su estado*/
    private int[] radioChecked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examen_magnitudes);
        ButterKnife.bind(this);

        verfiricarEstadoAnterior(savedInstanceState);

        /*si es la primera vez que el layout es inflado se guardara el estado de los checkbox*/
        if (savedInstanceState == null){
            radioChecked = new int[]{
                    grupoRespuestasUnoMagnitudes.getCheckedRadioButtonId(),
                    grupoRespuestasDosMagnitudes.getCheckedRadioButtonId(),
                    grupoRespuestasTresMagnitudes.getCheckedRadioButtonId(),
                    grupoRespuestasCuatroMagnitudes.getCheckedRadioButtonId(),
                    grupoRespuestasCincoMagnitudes.getCheckedRadioButtonId(),
                    grupoRespuestasSeisMagnitudes.getCheckedRadioButtonId(),
                    grupoRespuestasSieteMagnitudes.getCheckedRadioButtonId(),
                    grupoRespuestasOchoMagnitudes.getCheckedRadioButtonId(),
                    grupoRespuestasNueveMagnitudes.getCheckedRadioButtonId(),
                    grupoRespuestasDiezMagnitudes.getCheckedRadioButtonId()
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
    //se asigna el estado anterior de los checkbox
    private void setCheckBoxChecked() {
        grupoRespuestasUnoMagnitudes.check(radioChecked[0]);
        grupoRespuestasDosMagnitudes.check(radioChecked[1]);
        grupoRespuestasTresMagnitudes.check(radioChecked[2]);
        grupoRespuestasCuatroMagnitudes.check(radioChecked[3]);
        grupoRespuestasCincoMagnitudes.check(radioChecked[4]);
        grupoRespuestasSeisMagnitudes.check(radioChecked[5]);
        grupoRespuestasSieteMagnitudes.check(radioChecked[6]);
        grupoRespuestasOchoMagnitudes.check(radioChecked[7]);
        grupoRespuestasNueveMagnitudes.check(radioChecked[8]);
        grupoRespuestasDiezMagnitudes.check(radioChecked[9]);
    }
}
