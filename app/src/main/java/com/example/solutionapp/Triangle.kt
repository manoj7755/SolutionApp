package com.example.solutionapp

import kotlin.math.pow

class Triangle() {
var triangle_Count = 0
    fun Area_Perimeter(base:Double,height:Double):Pair<Double,Double>{
        triangle_Count++
        val area = (base*height)/2

        val p = (height*height)-(base*base)
        val rootP = p.pow(1/3)
        val perimeter = base+height+rootP
        return Pair(area,perimeter)
    }

}