package id.pahlevikun.rxretrofitsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import id.voela.voelamerchant.composer.retrofit.UtilsApi
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        requestRep()
    }

    private fun requestRep() {
        val mApiService = UtilsApi.apiService
        mApiService.requestRepos()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    Toast.makeText(this, it.size.toString(), Toast.LENGTH_LONG).show()
                }
    }
}
