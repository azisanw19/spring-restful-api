package com.canwar.spring.restful.api.validation

import org.springframework.stereotype.Component
import jakarta.validation.ConstraintViolationException
import jakarta.validation.Validator

@Component
class ValidationUtil(val validator: Validator) {

    fun validate(any: Any) {
        val result = validator.validate(any)
        if(result.size != 0) {
            throw ConstraintViolationException(result)
        }
    }

}