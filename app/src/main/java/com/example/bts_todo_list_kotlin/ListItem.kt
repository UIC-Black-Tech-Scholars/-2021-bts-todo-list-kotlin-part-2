package com.example.bts_todo_list_kotlin

class ListItem(t:String?, d:String?, p:Int?) {
    var title:String?=null
    var description:String?=null
    var priority:Int?=null

    init {
        title = t
        description = d
        priority = p
    }

    override fun toString(): String = title + ":" + description + ":"+ priority.toString()
}