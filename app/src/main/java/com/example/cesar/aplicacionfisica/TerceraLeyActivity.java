package com.example.cesar.aplicacionfisica;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.widget.TableLayout;

import java.util.ArrayList;
import java.util.List;

public class TerceraLeyActivity extends AppCompatActivity {

    /***********************************************************************************************/

    /******************Codigo por Cesar Coto y Jose Manuel********************/

    /***********************************************************************************************/


    //se crean objetos para enlazarlos con las vistas
    /**estos objetos son creamos para poder hacer funcionar la activityTab*/

    TabLayout tabLayoutContainerTerceraLey;
    ViewPager viewPagerContainerTerceraLey;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera_ley);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        inViewPager();

    }

    private void inViewPager() {
        //enlazamos las clases con las vistas
        tabLayoutContainerTerceraLey = findViewById(R.id.tabsContainerTerceraLey);
        viewPagerContainerTerceraLey = findViewById(R.id.containerTabsTerceraLey);

        //creamos una lista de strings con los titulos de cada tab
        List <String> titles = new ArrayList<>();
        titles.add(getString(R.string.title_home));
        titles.add(getString(R.string.examples_title));

        //agregamos las tabs a el tabLayout con ayuda de nuestra lista
        tabLayoutContainerTerceraLey.addTab(tabLayoutContainerTerceraLey.newTab()
                .setText(titles.get(0)));

        tabLayoutContainerTerceraLey.addTab(tabLayoutContainerTerceraLey.newTab()
                .setText(titles.get(1)));

        //creamos una lista de Fragments
        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new HomeTerceraLeyFragment());
        fragmentList.add(new ExamplesTerceraLeyFragment());

        viewPagerContainerTerceraLey.setOffscreenPageLimit(2);

        /*se llama a la clase fragmentAdaptar para poder hacer las asiganaciones de fragmens
        dependiendo la posicion*/
        FragmentAdapter fragmentAdapter = new FragmentAdapter(getSupportFragmentManager(),
                fragmentList,titles);

        //asignamos el adaptador al viewPager
        viewPagerContainerTerceraLey.setAdapter(fragmentAdapter);
        tabLayoutContainerTerceraLey.setupWithViewPager(viewPagerContainerTerceraLey);
        tabLayoutContainerTerceraLey.setTabsFromPagerAdapter(fragmentAdapter);
    }
}
