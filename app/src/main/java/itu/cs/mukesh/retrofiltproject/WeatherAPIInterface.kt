package itu.cs.mukesh.kotlinretrofitdemo

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface WeatherAPIInterface {
    @Headers("Content-Type: application/json")
    @GET("current.json")
    fun getData(@Query("q") loc: String) : Call<WeatherData>
}