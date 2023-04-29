package com.canwar.spring.restful.api.repository

import com.canwar.spring.restful.api.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, String> {
}