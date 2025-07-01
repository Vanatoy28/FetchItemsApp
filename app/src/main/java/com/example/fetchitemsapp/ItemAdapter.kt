package com.example.fetchitemsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(private val groupedData: List<Pair<Int, List<Item>>>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.itemTitle)
    }

    private val flatList: List<String> = buildDisplayList()

    private fun buildDisplayList(): List<String> {
        val result = mutableListOf<String>()
        for ((listId, items) in groupedData) {
            result.add("List ID: $listId")
            result.addAll(items.map { "- ${it.name}" })
        }
        return result
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.title.text = flatList[position]
    }

    override fun getItemCount() = flatList.size
}
