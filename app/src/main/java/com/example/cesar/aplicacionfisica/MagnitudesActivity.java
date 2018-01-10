package com.example.cesar.aplicacionfisica;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class MagnitudesActivity extends AppCompatActivity {

    /***********************************************************************************************/

                /******************Codigo por Cesar Coto y Jose manuel********************/

    /***********************************************************************************************/

    //se crean objetos para enlazarlos con las vistas
    /**estos objetos son creamos para poder hacer funcionar la activityTab*/
    ViewPager viewPagerContainerMagnitudes;
    TabLayout tabLayoutContainerMagnitudes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magnitudes);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //se activa el boton ir atras
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        //se inician las paginas de la actividad
        inViewPager();
    }
    private void inViewPager() {
        //enlazamos las clases con las vistas
        tabLayoutContainerMagnitudes = findViewById(R.id.tabsContainerMagnitudes);
        viewPagerContainerMagnitudes = findViewById(R.id.containerTabsMagnitudes);

        //creamos una lista de strings con los titulos de cada tab
        List<String> titlesTab = new ArrayList<>();
        titlesTab.add(getString(R.string.title_home));
        titlesTab.add(getString(R.string.title_magnitudes_fundamentales));
        titlesTab.add(getString(R.string.title_magnitudes_derivadas));
        //agregamos las tabs a el tabLayout con ayuda de nuestra lista
        tabLayoutContainerMagnitudes.addTab(tabLayoutContainerMagnitudes.newTab()
                .setText(titlesTab.get(0)));

        tabLayoutContainerMagnitudes.addTab(tabLayoutContainerMagnitudes.newTab()
                .setText(titlesTab.get(1)));

        tabLayoutContainerMagnitudes.addTab(tabLayoutContainerMagnitudes.newTab()
                .setText(titlesTab.get(2)));

        //creamos una lista de Fragments
        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new HomeMagnitudesFragment());
        fragmentList.add(new MagnitudesFundamentalesFragment());
        fragmentList.add(new MagnitudesDerivadasFragment());

        viewPagerContainerMagnitudes.setOffscreenPageLimit(2);

        /*se llama a la clase fragmentAdaptar para poder hacer las asiganaciones de fragmens
         dependiendo la posicion*/
        FragmentAdapter fragmentAdapter = new FragmentAdapter(getSupportFragmentManager(),
                fragmentList,titlesTab);
        //asignamos el adaptador al viewPager
        viewPagerContainerMagnitudes.setAdapter(fragmentAdapter);
        tabLayoutContainerMagnitudes.setupWithViewPager(viewPagerContainerMagnitudes);
        tabLayoutContainerMagnitudes.setTabsFromPagerAdapter(fragmentAdapter);
    }
}

