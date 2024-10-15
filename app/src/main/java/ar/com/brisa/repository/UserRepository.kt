package ar.com.brisa.repository

import ar.com.brisa.model.User

interface UserRepository {
    suspend fun getAll(): List<User>?
}