package com.example.bts_todo_list_kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class MyCustomArrayAdapter(context: Context, list: List<ListItem>) : ArrayAdapter<ListItem?>(context, 0, list) {
    private val mContext: Context = context
    private var items: List<ListItem> = list

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val listItem: View = convertView ?: LayoutInflater.from(mContext)
            .inflate(R.layout.custom_list_item_layout, parent, false)

        val title = listItem.findViewById<TextView>(R.id.title)
        val description = listItem.findViewById<TextView>(R.id.description)
        val priority = listItem.findViewById<TextView>(R.id.priority)

        title.text = items[position].title
        description.text = items[position].description
        priority.text = items[position].priority.toString()

        return listItem
    }
}