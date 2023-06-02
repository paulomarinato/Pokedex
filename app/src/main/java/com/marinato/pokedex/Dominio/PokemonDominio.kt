package com.marinato.pokedex.Dominio

data class PokemonDominio(
    val imageUrl: String,
    val number: Int,
    val nome: String,
    val tyoes: List<PokemonType>
)

