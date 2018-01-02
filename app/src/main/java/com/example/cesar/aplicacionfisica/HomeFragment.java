package com.example.cesar.aplicacionfisica;


import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Intent;
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
import android.widget.Toast;

/***********************************************************************************************/

            /******************Codigo por Cesar Coto y Jose manuel********************/

/***********************************************************************************************/

public class HomeFragment extends Fragment implements View.OnTouchListener, View.OnClickListener{

    //Se crean los objetos necesarios para que se puedan enlazar las vistas con las clases java
    ImageView imageViewConversiones,imageViewVectores,imageViewMagnitudes,imageViewPrimeraLey,
            imageViewSegundaLey,imageViewTerceraLey;
    CardView cardViewConversiones, cardViewVectores,cardViewMagnitudes,cardViewPrimeraLey,
            cardViewSegundaLey,cardViewTerceraLey;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Se infla la vista (Fragment)
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        //se enlazan los objetos con las vistas
        /**Imagenes**/
        imageViewConversiones = view.findViewById(R.id.imagenConversiones);
        imageViewVectores = view.findViewById(R.id.imagenVectores);
        imageViewMagnitudes = view.findViewById(R.id.imagenMagnitudes);
        imageViewPrimeraLey = view.findViewById(R.id.imagenPrimeraLey);
        imageViewSegundaLey = view.findViewById(R.id.imagenSegundaLey);
        imageViewTerceraLey = view.findViewById(R.id.imagenTerceraLey);
        /**CardView**/
        cardViewConversiones = view.findViewById(R.id.cardViewConversiones);
        cardViewVectores = view.findViewById(R.id.cardViewVectores);
        cardViewMagnitudes = view.findViewById(R.id.cardViewMagnitudes);
        cardViewPrimeraLey = view.findViewById(R.id.cardViewPrimeraLey);
        cardViewSegundaLey = view.findViewById(R.id.cardViewSegundaLey);
        cardViewTerceraLey = view.findViewById(R.id.cardViewTerceraLey);

        /*Se asignan las imagnes que tendra cada ImageView*/
        imageViewConversiones.setImageResource(R.drawable.conversiones_img);
        imageViewVectores.setImageResource(R.drawable.vectores_img);
        imageViewMagnitudes.setImageResource(R.drawable.magnitudes_img);
        imageViewPrimeraLey.setImageResource(R.drawable.primera_ley_new_img);
        imageViewSegundaLey.setImageResource(R.drawable.segunda_ley_new_img);
        imageViewTerceraLey.setImageResource(R.drawable.tercera_lew_new_img);

        /*Se asigna el metodo onTouch a cada cardView*/
        cardViewConversiones.setOnTouchListener(this);
        cardViewVectores.setOnTouchListener(this);
        cardViewMagnitudes.setOnTouchListener(this);
        cardViewPrimeraLey.setOnTouchListener(this);
        cardViewSegundaLey.setOnTouchListener(this);
        cardViewTerceraLey.setOnTouchListener(this);

        /*Se asigna el onClickListener a cada una de las cardView*/
        cardViewConversiones.setOnClickListener(this);
        cardViewVectores.setOnClickListener(this);
        cardViewMagnitudes.setOnClickListener(this);
        cardViewPrimeraLey.setOnClickListener(this);
        cardViewSegundaLey.setOnClickListener(this);
        cardViewTerceraLey.setOnClickListener(this);
        return view;
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        /**Se crea la animacion que hacen las cardView al ser presionadas por un tiempo prolongado**/
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

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.cardViewConversiones:
                Intent intentShowActivityConversiones = new Intent(getActivity(),ConversionesActivity.class);
                startActivity(intentShowActivityConversiones);
                break;
            case R.id.cardViewVectores:
                Intent intentShowActivityVectores = new Intent(getActivity(),VectorsActivity.class);
                startActivity(intentShowActivityVectores);
                break;
            case R.id.cardViewPrimeraLey:
                break;
            case R.id.cardViewSegundaLey:
                break;
            case R.id.cardViewTerceraLey:
                break;
        }
    }
}
