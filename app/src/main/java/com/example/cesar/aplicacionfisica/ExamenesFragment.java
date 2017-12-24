package com.example.cesar.aplicacionfisica;


import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;

public class ExamenesFragment extends Fragment implements View.OnTouchListener{

    //Se crean los objetos necesarios para que se puedan enlazar las vistas con las clases java
    ImageView imageViewExamConversiones,imageViewExamVectores,imageViewExamMagnitudes,
            imageViewExamNeton;

    CardView cardViewExamConversiones,cardViewExamVectores,cardViewExamMagnitudes,
            cardViewExamNewton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_examenes, container, false);

        //se enlazan los objetos con las vistas
        /**CardViews**/
        cardViewExamConversiones = view.findViewById(R.id.cardViewExamenConversiones);
        cardViewExamVectores = view.findViewById(R.id.cardViewExamenVectores);
        cardViewExamMagnitudes = view.findViewById(R.id.cardViewExamenMangnitudes);
        cardViewExamNewton = view.findViewById(R.id.cardViewExamenLeyesDeNewton);

        /**ImageViews*/
        imageViewExamConversiones = view.findViewById(R.id.imagenExamenConversiones);
        imageViewExamVectores = view.findViewById(R.id.imagenExamenVectores);
        imageViewExamMagnitudes = view.findViewById(R.id.imagenExamenMagnitudes);
        imageViewExamNeton = view.findViewById(R.id.imagenExamenNewton);

        /*Se asignan las imagnes que tendra cada ImageView*/
        imageViewExamConversiones.setImageResource(R.drawable.conversiones_img);
        imageViewExamVectores.setImageResource(R.drawable.vectores_img);
        imageViewExamMagnitudes.setImageResource(R.drawable.magnitudes_img);
        imageViewExamNeton.setImageResource(R.drawable.primera_ley_new_img);

        /*Se asigna el metodo onTouch a cada cardView*/
        cardViewExamConversiones.setOnTouchListener(this);
        cardViewExamVectores.setOnTouchListener(this);
        cardViewExamMagnitudes.setOnTouchListener(this);
        cardViewExamNewton.setOnTouchListener(this);
        return view;
    }
    /**Se crea la animacion que hacen las cardView al ser presionadas por un tiempo prolongado**/
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            //en este primer caso es cuando el elemento esta siendo presionado y la animacion se comienza
            case MotionEvent.ACTION_DOWN:
                ObjectAnimator upAnim = ObjectAnimator.ofFloat(view, "translationZ", 10);
                upAnim.setDuration(150);
                upAnim.setInterpolator(new DecelerateInterpolator());
                upAnim.start();
                break;
            // en estos dos ultimos casos es cuando el elemento a dejado de ser presionado y la animazion se termina.
            case MotionEvent.ACTION_UP:
            case MotionEvent.ACTION_CANCEL:
                ObjectAnimator downAnim = ObjectAnimator.ofFloat(view, "translationZ", 0);
                downAnim.setDuration(150);
                downAnim.setInterpolator(new AccelerateInterpolator());
                downAnim.start();
                break;
        }
        return false;
    }
}
