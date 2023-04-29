package com.canwar.spring.restful.api.repository

import com.canwar.spring.restful.api.entity.ApiKey
import org.springframework.data.jpa.repository.JpaRepository

interface ApiKeyRepository : JpaRepository<ApiKey, String> {
}