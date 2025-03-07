package com.example.news_app.data.remote

import com.example.news_app.data.remote.api.ApiInterface
import com.example.news_app.domain.model.NewsModel
import com.example.news_app.util.Resource
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(private val apiInterface: ApiInterface): RemoteDataSourceInterface{
    override suspend fun getNews(category: String): Resource<NewsModel> {
        try {
            val response = apiInterface.getNews(category)
            if (response.isSuccessful){
                if (response.body() != null){
                    return Resource.Success(response.body()!!)
                }
                else{
                    return Resource.Error("Response body is null")
                }
            }else{
                return Resource.Error(response.message())
            }
        }catch (e: HttpException){
            return Resource.Error("Could not load")
        }
        catch (e: IOException){
            return Resource.Error("No internet connection established")
        }
    }
}