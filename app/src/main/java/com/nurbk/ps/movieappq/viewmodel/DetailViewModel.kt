package com.nurbk.ps.movieappq.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.nurbk.ps.movieappq.repositories.MoviesRepositories
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(val moviesRepositories: MoviesRepositories,application: Application) : AndroidViewModel(application) {
    fun getDerailsMovie() = moviesRepositories.getDetailsLiveData()
    fun getCreditsMovie() = moviesRepositories.getCreditsLiveData()
    fun getSimilarMovie() = moviesRepositories.getSimilarLiveData()
    fun getRecommendationsMovie() = moviesRepositories.getRecommendationsLiveData()
}