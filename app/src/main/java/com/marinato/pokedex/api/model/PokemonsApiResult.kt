package com.marinato.pokedex.api.model

import com.marinato.pokedex.domain.PokemonType

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
data class PokemonApiResult(
    val id: Int,
    val name: String,
    val types: PokemonTypeSlot
)
data class PokemonTypeSlot {
    val slot: Int,
    val type: PokemonType
}