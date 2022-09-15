package com.example.signup

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.*
//import android.support.v4.app.AppCompatActivity
import java.security.AccessControlContext

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        var listView = findViewById<ListView>(R.id.listview)

        var customAdapter = CustomAdapter(this)
        listView.adapter=customAdapter

        val intentBicep = Intent(this,BicepsFull::class.java);
       val intentabs = Intent(this,absfull::class.java);
        val intentlegs = Intent(this,legsFull::class.java);
        val intentdiet = Intent(this,dietfull::class.java);
        listView.setOnItemClickListener{adapterView,view,position,l->

            if (position==0)
                 startActivity(intentBicep);
            else if (position==1)
                startActivity(intentabs)
            else if(position==2)
                startActivity(intentlegs)
            else if(position==3)
                startActivity(intentdiet)
        }

    }
}

class CustomAdapter(private val context: Activity) :BaseAdapter() {
    var names = arrayOf("Biceps","Abs","Legs","DIET")
    var desc = arrayOf("Big biceps","6 pack abs","Iron Legs","Healthy Diet ")
    var image = intArrayOf(R.drawable.bicephome,R.drawable.abshome,R.drawable.legshome,R.drawable.dietfull)
    override fun getCount(): Int {
        return image.size
    }
    override fun getItem(position: Int): Any {
        return image[position]
    }
    override fun getItemId(position: Int): Long {
        return image[position].toLong()
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var inflater = context.layoutInflater
        var view1 = inflater.inflate(R.layout.rowdata,null)

        var fnTitle = view1.findViewById<TextView>(R.id.title)
        var fdesc =  view1.findViewById<TextView>(R.id.description)
       var fimage = view1.findViewById<ImageView>(R.id.icon)

        fnTitle.setText(names[position])
        fdesc.setText(desc[position])
        fimage.setImageResource(image[position])
        return view1
    }

}

//creating model class

