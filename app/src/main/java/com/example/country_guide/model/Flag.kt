package com.example.country_guide.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Flag(

    @SerializedName("png")
    @Expose
    val png: String? = null,
)
