package com.canwar.spring.restful.api.service

import com.canwar.spring.restful.api.model.CreateProductRequest
import com.canwar.spring.restful.api.model.ListProductRequest
import com.canwar.spring.restful.api.model.ProductResponse
import com.canwar.spring.restful.api.model.UpdateProductRequest

interface ProductService {

    fun create(createProductRequest: CreateProductRequest): ProductResponse

    fun get(id: String): ProductResponse

    fun update(id: String, updateProductRequest: UpdateProductRequest): ProductResponse

    fun delete(id: String)

    fun list(listProductRequest: ListProductRequest): List<ProductResponse>

}