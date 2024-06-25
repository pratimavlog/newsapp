package com.example.thenoteapp.api

import retrofit2.http.Query
import com.example.thenoteapp.NewsResponse
import com.example.thenoteapp.util.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET

interface NewsApi {

    @GET("/v2/top-headlines")
    suspend fun getHeadlines(
        @Query("country")
        countryCode: String="us",
        @Query("page")
        pagenumber: Int=1,
        @Query("apikey")
        apiKey:String=API_KEY

        ):Response<NewsResponse>

    @GET("/v2/everything")
    suspend fun searchforNews(
        @Query("q")
        searchQuery:String,

        @Query("page")
        pagenumber: Int=1,
        @Query("apikey")
        apiKey:String=API_KEY


        ):Response<NewsResponse>
}