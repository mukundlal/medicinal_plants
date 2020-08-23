package com.codermonklab.medicinalplants

import java.io.Serializable

class MedData(
    val id:String,
    val name:String,
    val sciname:String,
    val desc:String,
    val imagePath:String
) :Serializable{
}