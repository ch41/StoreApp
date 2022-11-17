package com.example.product.api

import retrofit2.http.GET

interface ProductService {
    @GET("/v3/654bd15e-b121-49ba-a588-960956b15175")
    fun getProducts() : Products
}