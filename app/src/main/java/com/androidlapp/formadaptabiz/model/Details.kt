package com.androidlapp.formadaptabiz.model


import com.google.gson.annotations.SerializedName

data class Details(
    @SerializedName("data")
    val `data`: ArrayList<Data>,
    @SerializedName("status")
    var status: Boolean
)