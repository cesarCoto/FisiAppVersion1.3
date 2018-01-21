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

public class PrimeraLeyActivity extends AppCompatActivity {
    /***********************************************************************************************/

            /******************Codigo por Cesar Coto y Jose manuel********************/

    /***********************************************************************************************/

    //se crean objetos para enlazarlos con las vistas
    /**estos objetos son creamos para poder hacer funcionar la activityTab*/

    TabLayout tabLayoutContainerPrimeraLey;
    ViewPager viewPagerContainerPrimeraLey;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primera_ley);

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
        tabLayoutContainerPrimeraLey = findViewById(R.id.tabsContainerPrimeraLey);
        viewPagerContainerPrimeraLey = findViewById(R.id.containerTabsPrimeraLey);

        //creamos una lista de strings con los titulos de cada tab
        List<String> titles = new ArrayList<>();
        titles.add(getString(R.string.title_home));
        titles.add(getString(R.string.examples_title));

        //agregamos las tabs a el tabLayout con ayuda de nuestra lista
        tabLayoutContainerPrimeraLey.addTab(tabLayoutContainerPrimeraLey.newTab()
                .setText(titles.get(0)));

        tabLayoutContainerPrimeraLey.addTab(tabLayoutContainerPrimeraLey.newTab()
                .setText(titles.get(1)));

        //creamos una lista de Fragments
        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new HomePrimeraLeyFragment());
        fragmentList.add(new ExamplesPrimeraLeyFragment());

        viewPagerContainerPrimeraLey.setOffscreenPageLimit(2);

        /*se llama a la clase fragmentAdaptar para poder hacer las asiganaciones de fragmens
        dependiendo la posicion*/
        FragmentAdapter fragmentAdapter = new FragmentAdapter(getSupportFragmentManager(),
                fragmentList,titles);

        //asignamos el adaptador al viewPager
        viewPagerContainerPrimeraLey.setAdapter(fragmentAdapter);
        tabLayoutContainerPrimeraLey.setupWithViewPager(viewPagerContainerPrimeraLey);
        tabLayoutContainerPrimeraLey.setTabsFromPagerAdapter(fragmentAdapter);

    }


}
