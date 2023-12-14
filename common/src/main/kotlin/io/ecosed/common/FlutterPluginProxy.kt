package io.ecosed.common

import android.app.Activity
import androidx.lifecycle.Lifecycle

interface FlutterPluginProxy {
    fun getActivity(activity: Activity)
    fun getLifecycle(lifecycle: Lifecycle)
    fun onMethodCall(call: MethodCallProxy, result: ResultProxy)
}