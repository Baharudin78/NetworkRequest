package com.baharudin.networkrequest.data.remote

import com.baharudin.networkrequest.model.MovieResponse
import com.baharudin.networkrequest.util.Constans.Companion.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {
    @GET("movie/popular?api_key=$API_KEY")
    suspend fun getPopulerMovie(
        @Query("page") pageNumber : Int
    ) : MovieResponse
}