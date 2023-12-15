package io.ecosed.common_example

import android.app.Activity
import androidx.lifecycle.Lifecycle
import io.ecosed.common.FlutterPluginProxy
import io.ecosed.common.MethodCallProxy
import io.ecosed.common.ResultProxy

class PluginExample : FlutterPluginProxy {

    override fun getActivity(activity: Activity) {
        // 获取activity
    }

    override fun getLifecycle(lifecycle: Lifecycle) {
        // 获取生命周期
    }

    override fun attach() {
        // 初始化
    }

    override fun onMethodCall(call: MethodCallProxy, result: ResultProxy) {
        when (call.method) {
            "success" -> result.success("success")
            "bundle" -> result.success(call.bundle?.getString("bundle"))
            "error" -> result.error("error", "error", "error")
            else -> result.notImplemented()
        }
    }
}