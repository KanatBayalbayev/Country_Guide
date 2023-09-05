package com.example.country_guide

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.country_guide.api.RetrofitClient
import com.example.country_guide.model.CountryObject
import com.google.gson.Gson
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class MainViewModel : ViewModel() {
    private val compositeDisposable = CompositeDisposable()
    private val _countryData = MutableLiveData<CountryObject>()
    val countryData: LiveData<CountryObject> = _countryData

    init {
        loadData()
    }


    fun loadData() {
        val disposable = RetrofitClient.apiService.getListOfCountries()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                for (country in it) {
                    _countryData.value = country
                }


            }, {
                Log.d("MainViewModel", it.message.toString())
            })
        compositeDisposable.add(disposable)
    }


    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }


}