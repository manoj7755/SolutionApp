package com.example.solutionapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.solutionapp.Adapter.RecycleViewAdapter
import kotlinx.android.synthetic.main.activity_main.*
import java.util.Collections
import java.util.stream.Collectors
// it is Circle class and we can also say  main class
class Circle : AppCompatActivity() {
    var circleCount = 0   // Stores no. of circle
    var triangleCount =0  // Stores no. of triangle
    var rectangleCount =0 // Stores no. of rectangle
    var CName = "Circle"
    var Tname = "Triangle"
    var Rname = "Reactangle"
    val array = ArrayList<model>()  // it is arrayList which is use to store the area and perimeter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // calling function of Triangle class
       Triangle().apply {
           // creating object of Triangle 1 to 5
           val triangle_id_1 = Area_Perimeter(5.0,6.0)
           val triangle_id_2 = Area_Perimeter(4.0,2.0)
           val triangle_id_3 = Area_Perimeter(9.0,12.0)
           val triangle_id_4 = Area_Perimeter(12.0,14.0)
           // add area and perimeter of triangle in Arraylist
           // first defines the area and second defies the perimeter
           array.apply {
               add(model(Tname,1,triangle_id_1.first,triangle_id_2.second))
               add(model(Tname,2,triangle_id_2.first,triangle_id_2.second))
               add(model(Tname,3,triangle_id_3.first,triangle_id_3.second))
               add(model(Tname,4,triangle_id_4.first,triangle_id_4.second))
           }
           // Assigning count of triangle
           triangleCount =triangle_Count
       }
        // calling function of Circle class
        // creating object of Triangle 5 to 7
        val circle_id_5 = circle(10.0)
        val circle_id_6 = circle(6.0)
        val circle_id_7 = circle(8.0)
        array.apply {
            // add area and perimeter of triangle in Arraylist
            // first defines the area and second defies the perimeter
            add(model(CName,5,circle_id_5.first,circle_id_5.second))
            add(model(CName,6,circle_id_6.first,circle_id_6.second))
            add(model(CName,7,circle_id_7.first,circle_id_7.second))
        }

        // calling function of Rectangle class
            Rectangle().apply {
                // creating object of Triangle 8 to 10
            val retangle_id_8 = Area_Perimeter(6.0,10.0)
            val retangle_id_9 = Area_Perimeter(10.0,8.0)
            val retangle_id_10 = Area_Perimeter(12.0,8.0)
                // Assigning count of rectangle
           rectangleCount = count
                // add area and perimeter of rectangle in Arraylist
                // first defines the area and second defies the perimeter
                array.apply {
                    add(model(Rname,8,retangle_id_8.first,retangle_id_8.second))
                    add(model(Rname,9,retangle_id_9.first,retangle_id_9.second))
                    add(model(Rname,10,retangle_id_9.first,retangle_id_9.second))

                }
        }

        // set layoutManager and colling recycleViewAdapter with values
        recycleView.layoutManager = LinearLayoutManager(this)
        recycleView.adapter = RecycleViewAdapter(this,array)

//setting the values on ui
        TotalShape.text = "Number of shapes is ${(circleCount+triangleCount+rectangleCount).toString()}"
        Circle.text     = "Number of circles is ${circleCount.toString()}"
        Triangle.text   = "Number of triangles is ${triangleCount.toString()}"
        Rectangle.text  = "Number of reactangles is ${rectangleCount.toString()}"

    }

    fun circle(radius:Double):Pair<Double,Double>{
        val pi = 3.141
       circleCount++
        val perimeter = 2*(radius*pi)
        val area = pi*(radius*radius)
        return Pair(area,perimeter)
    }
// model class of Arraylist for storing values of area and perimeter
data class model(val name:String,val id:Int,val area:Double,val perimeter:Double)


}