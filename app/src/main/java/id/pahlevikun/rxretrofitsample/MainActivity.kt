package id.pahlevikun.rxretrofitsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import id.voela.voelamerchant.composer.retrofit.UtilsApi
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


class MainActivity : AppCompatActivity() {

    val TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        requestRep()
    }

    private fun requestRep() {
        /*UtilsApi.apiService.requestRepos()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    Toast.makeText(this, it.size.toString(), Toast.LENGTH_LONG).show()
                    print("REPO: ${it.size}")
                }*/

        UtilsApi.apiDummy.requestMockup()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    Toast.makeText(this, it.fullName, Toast.LENGTH_LONG).show()
                    print("MOCKUP: ${it.fullName}")
                }

    }
}
