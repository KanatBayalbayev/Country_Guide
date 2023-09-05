package com.example.country_guide.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Currency(

    @SerializedName("name")
    @Expose
    val name: String? = null
)
