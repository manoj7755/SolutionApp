package com.example.solutionapp

import kotlin.properties.Delegates

class Rectangle {

    var count =0
    fun Area_Perimeter(length:Double,width:Double):Pair<Double,Double>{
        count++
        val area = length*width
        val perimeter = 2*(length+width)
        return Pair(area,perimeter)
    }

}