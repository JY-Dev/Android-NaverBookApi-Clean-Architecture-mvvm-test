package com.jydev.naverbookapi.model

import com.jydev.naverbookapi.BuildConfig
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface BookService {
    @Headers(
        "X-Naver-Client-Id:${BuildConfig.NAVER_Client_Id}",
        "X-Naver-Client-Secret:${BuildConfig.NAVER_Client_Secret}"
    )
    @GET("/v1/search/book.json")
    suspend fun searchBook(
        @Query("query", encoded = true) query: String,
        @Query("display") display: Int,
        @Query("start") start : Int
    ) : BookResponse
}