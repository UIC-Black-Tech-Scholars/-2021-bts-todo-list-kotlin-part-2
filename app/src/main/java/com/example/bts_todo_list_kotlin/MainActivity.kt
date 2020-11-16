package com.example.bts_todo_list_kotlin

import android.os.Bundle
import android.util.Log
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


class MainActivity : AppCompatActivity() {
    private var TAG = "MainActivity"
    private lateinit var listView: ListView
    private lateinit var dataList: ArrayList<ListItem>
    private lateinit var floatingActionButton: FloatingActionButton
//    private lateinit var customArrayAdapter:CustomListItemAdapter
    private var gson = Gson()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resources.openRawResource(R.raw.test).bufferedReader().use {
            val stype = object : TypeToken<ArrayList<ListItem>>() {}.type
            dataList = gson.fromJson(it.readText(), stype)
        }
        //create list data
        dataList.forEach { item ->
            Log.d(TAG, item.toString())
        }
        //find view objects
        listView = findViewById(R.id.list_view)
        //hook list data up to our list using array adapter
    }


}