package com.example.country_guide.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Currencies(
    @SerializedName("currency")
    @Expose
    val currency: Currency? = null,
)
