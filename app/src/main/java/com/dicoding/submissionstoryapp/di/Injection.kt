package com.dicoding.submissionstoryapp.di

import android.content.Context
import com.dicoding.submissionstoryapp.data.UserRepository
import com.dicoding.submissionstoryapp.data.pref.UserPreference
import com.dicoding.submissionstoryapp.data.pref.dataStore

object Injection {
    fun provideRepository(context: Context): UserRepository {
        val pref = UserPreference.getInstance(context.dataStore)
        return UserRepository.getInstance(pref)
    }
}