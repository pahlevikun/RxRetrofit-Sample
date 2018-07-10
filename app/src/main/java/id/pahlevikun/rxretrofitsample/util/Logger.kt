package id.pahlevikun.rxretrofitsample.util

import android.util.Log

class Logger {
    companion object {
        var enabled = false
        private val TAG = "RxRetrofitSample"

        fun d(tag: String, var1: String) {
            if (enabled) {
                Log.d("" + tag, "" + var1)
            }

        }

        fun d(var0: String) {
            if (enabled) {
                Log.d(TAG, "" + var0)
            }

        }

        fun i(tag: String, var1: String) {
            if (enabled) {
                Log.i("" + tag, "" + var1)
            }

        }

        fun i(var0: String) {
            if (enabled) {
                Log.i(TAG, "" + var0)
            }

        }

        fun e(tag: String, var1: String) {
            if ("development".equals("development", ignoreCase = true)) {
                Log.e("" + tag, "" + var1)
            }

        }

        fun e(tag: String, var1: Throwable) {
            if ("development".equals("development", ignoreCase = true)) {
                Log.e("" + tag, "exeption:", var1)
            }

        }

        fun e(var0: String) {
            if (enabled) {
                Log.e(TAG, "" + var0)
            }

        }
    }
}