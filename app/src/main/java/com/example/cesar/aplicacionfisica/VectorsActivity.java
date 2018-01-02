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

public class VectorsActivity extends AppCompatActivity {

    //se crean objetos para enlazarlos con las vistas
    /**estos opjetos son creamos para poder hacer funcionar la activityTab*/
    TabLayout tabLayoutContainerVectorsActivity;
    ViewPager viewPagerVectorsActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vectors);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //boton ir atras
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        /**Iniciamos el metodo con el cual podremos hacer los cambios de un fragment a otros*/
        inViewPager();
    }
    private void inViewPager(){
        //enlazamos las clases con las vistas
        tabLayoutContainerVectorsActivity = findViewById(R.id.tabsContainesVectors);
        viewPagerVectorsActivity = findViewById(R.id.containerTabsVectoresActivity);

        //creamos una lista de strings con los titulos de cada tab
        List<String> titlesTab = new ArrayList<>();
        titlesTab.add(getString(R.string.title_home));
        titlesTab.add(getString(R.string.vectors_suma_title));
        titlesTab.add(getString(R.string.examples_title));
        //agregamos las tabs a el tabLayout con ayuda de nuestra lista
        tabLayoutContainerVectorsActivity.addTab(tabLayoutContainerVectorsActivity.newTab()
                .setText(titlesTab.get(0)));

        tabLayoutContainerVectorsActivity.addTab(tabLayoutContainerVectorsActivity.newTab()
                .setText(titlesTab.get(1)));

        tabLayoutContainerVectorsActivity.addTab(tabLayoutContainerVectorsActivity.newTab()
                .setText(titlesTab.get(2)));

        //creamos una lista de Fragments
        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new HomeVectoresFragment());
        fragmentList.add(new SumaVectoresFragment());
        fragmentList.add(new ExamplesVectoresFragment());

        viewPagerVectorsActivity.setOffscreenPageLimit(2);

        /*se llama a la clase fragmentAdaptar para poder hacer las asiganaciones de fragmens
         dependiendo la posicion*/

        FragmentAdapter fragmentAdapter = new FragmentAdapter(getSupportFragmentManager(),
                fragmentList,titlesTab);
        //asignamos el adaptador al viewPager

        viewPagerVectorsActivity.setAdapter(fragmentAdapter);
        tabLayoutContainerVectorsActivity.setupWithViewPager(viewPagerVectorsActivity);
        tabLayoutContainerVectorsActivity.setTabsFromPagerAdapter(fragmentAdapter);

    }
}
