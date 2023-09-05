package com.example.country_guide.api

import com.example.country_guide.model.CountryObject
import io.reactivex.Single
import retrofit2.http.GET

interface ApiService {

    @GET("all")
    fun getListOfCountries(): Single<List<CountryObject>>


}