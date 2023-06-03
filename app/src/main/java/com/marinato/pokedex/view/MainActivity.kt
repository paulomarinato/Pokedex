package com.marinato.pokedex.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.marinato.pokedex.R
import com.marinato.pokedex.domain.Pokemon
import com.marinato.pokedex.domain.PokemonType

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.rvPokemons)

        val Charmander = Pokemon(
            "http://assets.pokemon.com/assets/cms2/img/pokedex/detail/oo4.png",
            4,
            "Charmander",
            listOf(
                PokemonType("Fire")
            )
        )
        val pokemons = listOf(Charmander, Charmander, Charmander, Charmander, Charmander)

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = PokemonAdapter(pokemons)
    }
}
