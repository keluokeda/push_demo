package com.ke.demo.push

import android.util.Log
import com.alipay.pushsdk.content.MPPushMsgServiceAdapter

class MyPushMsgService : MPPushMsgServiceAdapter() {


    override fun onTokenReceive(token: String) {
        Log.d("MyPushMsgService", "onTokenReceive $token")
    }
}