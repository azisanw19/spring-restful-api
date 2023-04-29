package com.canwar.spring.restful.api.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "api_keys")
data class ApiKey (

    @Id
    val id: String

)