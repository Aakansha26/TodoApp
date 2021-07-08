package com.example.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.DividerItemDecoration
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val todolist: ArrayList<Todo> = ArrayList();
        todolist.add(Todo("Get vegetables", "ask mom"))
        todolist.add(Todo("eat fruits", "ask mom"))

        //Initialising recycler adapter
        val recyclerAdapter = RecyclerAdapter(todolist)
        recyclerView.apply {
            adapter = recyclerAdapter
            addItemDecoration(DividerItemDecoration(this@MainActivity, DividerItemDecoration.VERTICAL))
        }

        fab_button.setOnClickListener { view ->
            val activityIntent = Intent(this, NewTodoActivity::class.java)
            startActivity(activityIntent)
        }

    }


}