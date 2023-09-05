package com.example.country_guide.api

import androidx.lifecycle.LiveData
import com.example.country_guide.model.CountriesList
import io.reactivex.Single
import retrofit2.http.GET

interface ApiService {

    @GET("all")
    fun getListOfCountries(): Single<CountriesList>
}