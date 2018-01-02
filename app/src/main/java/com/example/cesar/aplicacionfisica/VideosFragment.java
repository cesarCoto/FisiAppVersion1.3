package com.example.cesar.aplicacionfisica;


import android.animation.ObjectAnimator;
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
import android.widget.ImageButton;
import android.widget.ImageView;

/***********************************************************************************************/

            /******************Codigo por Cesar Coto y Jose manuel********************/

/***********************************************************************************************/

public class VideosFragment extends Fragment implements View.OnClickListener, View.OnTouchListener{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //se infla el layout
        View view = inflater.inflate(R.layout.fragment_videos, container, false);
        //se obtiene las vistas y se enlazan con sus clases java
        CardView cardViewConversionesVideo = view.findViewById(R.id.cardVideoConversiones);
        CardView cardViewVectoresVideo = view.findViewById(R.id.cardVideoVectores);
        CardView cardViewMagnitudesVideo = view.findViewById(R.id.cardVideoMagnitudes);
        CardView cardViewPrimeraLeyVideo = view.findViewById(R.id.cardVideoPrimeraLey);
        CardView cardViewSegundaLeyVideo = view.findViewById(R.id.cardVideoSegundaLey);
        CardView cardViewTerceraLeyVideo = view.findViewById(R.id.cardVideoTerceraLey);

        ImageView imageViewConversiones = view.findViewById(R.id.imageShareConversionesVideo);
        ImageView imageViewVectores = view.findViewById(R.id.imageShareVectoresVideo);
        ImageView imageViewMagnitudes = view.findViewById(R.id.imageShareMagnitudesVideo);
        ImageView imageViewPrimeraLey = view.findViewById(R.id.imageSharePrimeraleyVideo);
        ImageView imageViewSegundaLey = view.findViewById(R.id.imageShareSegundaleyVideo);
        ImageView imageViewTerceraLey = view.findViewById(R.id.imageShareTerceraleyVideo);

        /**Asignamos el metodo onTouch a cada CardView**/
        cardViewConversionesVideo.setOnTouchListener(this);
        cardViewVectoresVideo.setOnTouchListener(this);
        cardViewMagnitudesVideo.setOnTouchListener(this);
        cardViewPrimeraLeyVideo.setOnTouchListener(this);
        cardViewSegundaLeyVideo.setOnTouchListener(this);
        cardViewTerceraLeyVideo.setOnTouchListener(this);
        /**Asginamos el meotodo onClick a cada elemento**/
        //cardView
        cardViewConversionesVideo.setOnClickListener(this);
        cardViewVectoresVideo.setOnClickListener(this);
        cardViewMagnitudesVideo.setOnClickListener(this);
        cardViewPrimeraLeyVideo.setOnClickListener(this);
        cardViewSegundaLeyVideo.setOnClickListener(this);
        cardViewTerceraLeyVideo.setOnClickListener(this);
        //imageView
        imageViewConversiones.setOnClickListener(this);
        imageViewVectores.setOnClickListener(this);
        imageViewMagnitudes.setOnClickListener(this);
        imageViewPrimeraLey.setOnClickListener(this);
        imageViewSegundaLey.setOnClickListener(this);
        imageViewTerceraLey.setOnClickListener(this);

        return view;
    }
    /**el metodo onClick tiene un switch donde en cada caso haremos una accion distita**/
    @Override
    public void onClick(View view) {
        //se crea un array con el link de las paginas.
        String [] paginas = {
                "https://androidprototipo.blogspot.mx/2017/11/converciones.html",
                "https://androidprototipo.blogspot.mx/2017/11/vectores.html",
                "https://androidprototipo.blogspot.mx/2017/11/magnirudes.html",
                "https://androidprototipo.blogspot.mx/2017/11/primera-ley-de-newton.html",
                "https://androidprototipo.blogspot.mx/2017/11/segunda-ley-de-newton.html",
                "https://androidprototipo.blogspot.mx/2017/11/tercera-ley-de-newton.html"};

        switch (view.getId()){
            /**En el caso de hacer click sobre un CardView se mandara el String que contiene
             * la pagina web sera mandado al metodo loadVideo**/
            case R.id.cardVideoConversiones:
                loadVideo(paginas[0]);
                break;
            case R.id.cardVideoVectores:
                loadVideo(paginas[1]);
                break;
            case R.id.cardVideoMagnitudes:
                loadVideo(paginas[2]);
                break;
            case R.id.cardVideoPrimeraLey:
                loadVideo(paginas[3]);
                break;
            case R.id.cardVideoSegundaLey:
                loadVideo(paginas[4]);
                break;
            case R.id.cardVideoTerceraLey:
                loadVideo(paginas[5]);
                break;
            /**En el caso de hacer click en los botones Share sera mandado al meotodo
             * shareVideo el String con el enlaze que decemos compartir**/
            case R.id.imageShareConversionesVideo:
                shareVideo(paginas[0]);
                break;
            case R.id.imageShareVectoresVideo:
                shareVideo(paginas[1]);
                break;
            case R.id.imageShareMagnitudesVideo:
                shareVideo(paginas[2]);
                break;
            case R.id.imageSharePrimeraleyVideo:
                shareVideo(paginas[3]);
                break;
            case R.id.imageShareSegundaleyVideo:
                shareVideo(paginas[4]);
                break;
            case R.id.imageShareTerceraleyVideo:
                shareVideo(paginas[5]);
                break;
        }
    }
    private void shareVideo(String enlaze){
        //se crea un intent para mandar el link
        Intent intentShareVideo = new Intent();
        intentShareVideo.setAction(Intent.ACTION_SEND);
        intentShareVideo.putExtra(Intent.EXTRA_TEXT, enlaze);
        intentShareVideo.setType("text/plain");
        startActivity(Intent.createChooser(intentShareVideo, getString(R.string.share_title)));
    }
    private void loadVideo(String page){
        //se crea un intent con un putExtra para poder cargar la pagina en la activdad WebView
        Intent intentLoadVideo = new Intent(getActivity(),WebViewActivity.class);
        intentLoadVideo.putExtra("Web",page);
        startActivity(intentLoadVideo);
    }
    /**Se crea un metodo onTouch para las animaciones al mantener precinado el cardView**/
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
