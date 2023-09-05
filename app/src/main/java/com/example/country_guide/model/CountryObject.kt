package com.example.country_guide.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CountryObject(

    @SerializedName("name")
    @Expose
    val name: Name? = null,

    @SerializedName("currencies")
    @Expose
    val currencies: Currencies? = null,

    @SerializedName("capital")
    @Expose
    val capital: String? = null,

    @SerializedName("region")
    @Expose
    val region: String? = null,

    @SerializedName("subregion")
    @Expose
    val subregion: String? = null,

    @SerializedName("population")
    @Expose
    val population: Int? = null,

    @SerializedName("flags")
    @Expose
    val flags: Flag? = null,


)
