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

public class ConversionesActivity extends AppCompatActivity {

    /***********************************************************************************************/

                /******************Codigo por Cesar Coto y Jose manuel********************/

    /***********************************************************************************************/

    //se crean objetos para enlazarlos con las vistas
    /**estos opjetos son creamos para poder hacer funcionar la activityTab*/
    TabLayout tabLayoutContainerConversionesActivity;
    ViewPager viewPagerConversionesActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversiones);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        inViewPager();
    }
    private void inViewPager(){
        //enlazamos las clases con las vistas
        tabLayoutContainerConversionesActivity = findViewById(R.id.tabsContainerConversiones);
        viewPagerConversionesActivity = findViewById(R.id.containerTabsConversionesActivity);

        //creamos una lista de strings con los titulos de cada tab
        List<String> titlesTab = new ArrayList<>();
        titlesTab.add(getString(R.string.title_home));
        titlesTab.add(getString(R.string.examples_title));
        //agregamos las tabs a el tabLayout con ayuda de nuestra lista
        tabLayoutContainerConversionesActivity.addTab(tabLayoutContainerConversionesActivity.newTab()
                .setText(titlesTab.get(0)));

        tabLayoutContainerConversionesActivity.addTab(tabLayoutContainerConversionesActivity.newTab()
                .setText(titlesTab.get(1)));

        //creamos una lista de Fragments
        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new HomeConversionesFragment());
        fragmentList.add(new ExamplesConversionesFragment());

        viewPagerConversionesActivity.setOffscreenPageLimit(2);

        /*se llama a la clase fragmentAdaptar para poder hacer las asiganaciones de fragmens
         dependiendo la posicion*/

        FragmentAdapter fragmentAdapter = new FragmentAdapter(getSupportFragmentManager(),
                fragmentList,titlesTab);
        //asignamos el adaptador al viewPager

        viewPagerConversionesActivity.setAdapter(fragmentAdapter);

        tabLayoutContainerConversionesActivity.setupWithViewPager(viewPagerConversionesActivity);
        tabLayoutContainerConversionesActivity.setTabsFromPagerAdapter(fragmentAdapter);
    }
}
