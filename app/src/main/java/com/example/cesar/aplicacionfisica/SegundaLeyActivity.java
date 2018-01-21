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

public class SegundaLeyActivity extends AppCompatActivity {

    /***********************************************************************************************/

                /******************Codigo por Cesar Coto y Jose Manuel********************/

    /***********************************************************************************************/


    //se crean objetos para enlazarlos con las vistas
    /**estos objetos son creamos para poder hacer funcionar la activityTab*/

    TabLayout tabLayoutContainerSegundaLey;
    ViewPager viewPagerContainerSegundaLey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_ley);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ActionBar actionBar  = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        inViewPager();
    }

    private void inViewPager() {
        //enlazamos las clases con las vistas
        tabLayoutContainerSegundaLey = findViewById(R.id.tabsContainerSegundaLey);
        viewPagerContainerSegundaLey = findViewById(R.id.containerTabsSegundaLey);

        //creamos una lista de strings con los titulos de cada tab
        List<String> title = new ArrayList<>();
        title.add(getString(R.string.title_home));
        title.add(getString(R.string.examples_title));

        //agregamos las tabs a el tabLayout con ayuda de nuestra lista
        tabLayoutContainerSegundaLey.addTab(tabLayoutContainerSegundaLey.newTab()
                .setText(title.get(0)));

        tabLayoutContainerSegundaLey.addTab(tabLayoutContainerSegundaLey.newTab()
                .setText(title.get(1)));

        //creamos una lista de Fragments

        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new HomeSegundaLeyFragment());
        fragmentList.add(new ExamplesSegundaLeyFragment());

        viewPagerContainerSegundaLey.setOffscreenPageLimit(2);

        /*se llama a la clase fragmentAdaptar para poder hacer las asiganaciones de fragmens
        dependiendo la posicion*/

        FragmentAdapter fragmentAdapter = new FragmentAdapter(getSupportFragmentManager(),
                fragmentList,title);

        //asignamos el adaptador al viewPager
        viewPagerContainerSegundaLey.setAdapter(fragmentAdapter);
        tabLayoutContainerSegundaLey.setupWithViewPager(viewPagerContainerSegundaLey);
        tabLayoutContainerSegundaLey.setTabsFromPagerAdapter(fragmentAdapter);

    }
}
