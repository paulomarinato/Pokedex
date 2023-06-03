package com.marinato.pokedex.api.model

data class PokemonsApiResult(
    val count: String,
    val next: String?,
    val previous: String?,
    val results: List<PokemonResult>
)

data class PokemonResult(
    val name: String,
    val url: String
)