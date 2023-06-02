package com.marinato.pokedex.view


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.marinato.pokedex.R
import com.marinato.pokedex.domain.Pokemon

class PokemonAdapter(
    private val items: List<Pokemon>
) : RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.pokemon_item, parent, false)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]

        holder.bindView(item)

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindView(item: Pokemon){
            this.by
        }
    }
}