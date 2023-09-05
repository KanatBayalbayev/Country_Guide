package com.example.country_guide.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Name(
    @SerializedName("common")
    @Expose
    val common: String? = null
)
