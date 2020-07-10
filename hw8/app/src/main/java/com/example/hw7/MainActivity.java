package com.example.hw7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<pokemon> mypokemons = new ArrayList<>();

        pokemon p1 = new pokemon("Bulbasaur",R.drawable.bulbasaur,49,49,318);
        pokemon p2 = new pokemon("Charizard",R.drawable.charizard,84,78,534);
        pokemon p3 = new pokemon("Pikachu",R.drawable.picachu,55,40,320);
        pokemon p4 = new pokemon("Clefable",R.drawable.clefable,70,73,483);

        mypokemons.add(p1);
        mypokemons.add(p2);
        mypokemons.add(p3);
        mypokemons.add(p4);

        RecyclerView rv = findViewById(R.id.RecyclerView);

        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);

        pokemonadapter pokemonadapter = new pokemonadapter(mypokemons);
        rv.setAdapter((RecyclerView.Adapter) pokemonadapter);
    }
}





