package id.voela.voelamerchant.composer.retrofit

import id.pahlevikun.rxretrofitsample.config.APIConfig
import id.pahlevikun.rxretrofitsample.retrofit.BaseApiService
import id.pahlevikun.rxretrofitsample.retrofit.RetrofitClient

/**
 * Created by farhan on 1/9/18.
 */

object UtilsApi {
    val apiService: BaseApiService
        get() = RetrofitClient.getClient(APIConfig.END_POINT).create(BaseApiService::class.java)
}
