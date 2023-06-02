package com.marinato.pokedex.api

import androidx.recyclerview.widget.RecyclerView
import com.marinato.pokedex.Dominio.PokemonDominio

class PokemonApi (
    val items: List<PokemonDominio>
        ): RecyclerView.Adapter<PokemonApi.ViewHolder> {
    class ViewHolder : RecyclerView.ViewHolder {

    }
}