package com.example.country_guide.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CountryObject(

    @SerializedName("name")
    @Expose
    val name: Name,

    @SerializedName("currencies")
    @Expose
    val currencies: Currencies,

    @SerializedName("capital")
    @Expose
    val capital: String,

    @SerializedName("region")
    @Expose
    val region: String,

    @SerializedName("subregion")
    @Expose
    val subregion: String,

    @SerializedName("population")
    @Expose
    val population: Int,

    @SerializedName("flags")
    @Expose
    val flags: Flag,


)
