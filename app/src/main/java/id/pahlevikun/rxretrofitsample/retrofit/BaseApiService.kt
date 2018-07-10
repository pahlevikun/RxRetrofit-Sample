package id.pahlevikun.rxretrofitsample.retrofit

import id.pahlevikun.rxretrofitsample.model.ResponseRepos
import io.reactivex.Observable
import retrofit2.http.GET

/**
 * Created by farhan on 1/9/18.
 */

interface BaseApiService {
    @GET("users/pahlevikun/repos")
    fun requestRepos(): Observable<List<ResponseRepos>>
}
