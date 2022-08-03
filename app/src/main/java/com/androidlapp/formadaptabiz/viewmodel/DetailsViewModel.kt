package com.androidlapp.formadaptabiz.viewmodel

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.androidlapp.formadaptabiz.api.RestClient
import com.androidlapp.formadaptabiz.model.Data
import com.androidlapp.formadaptabiz.model.Details
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DetailsViewModel :ViewModel() {

    val savedData = MutableLiveData<ArrayList<Data>>()

        fun fetchAllData(){
            RestClient.getApiInterface().fetchAllData()
                .enqueue(object : Callback<Details>{
                    override fun onResponse(call: Call<Details>, response: Response<Details>) {

                        if (response.body()!=null){
                            savedData.postValue(response.body()!!.data)
                            Log.d("anup", response.body()!!.data.toString())
                        }
                    }

                    override fun onFailure(call: Call<Details>, t: Throwable) {

                    }

                })
        }
}