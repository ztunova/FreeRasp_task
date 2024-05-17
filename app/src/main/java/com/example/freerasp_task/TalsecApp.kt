package com.example.freerasp_task

import android.app.Activity
import android.app.Application
import android.widget.TextView
import com.aheaditec.talsec_security.security.api.Talsec
import com.aheaditec.talsec_security.security.api.TalsecConfig
import com.aheaditec.talsec_security.security.api.ThreatListener

class TalsecApp : Application(), ThreatListener.ThreatDetected {
    private var currentActivity: Activity? = null

    override fun onCreate() {
        super.onCreate()
        val config = TalsecConfig(
            expectedPackageName,
            expectedSigningCertificateHashBase64,
            watcherMail,
            supportedAlternativeStores,
            isProd
        )

        ThreatListener (this).registerListener(this)
        Talsec.start(this, config)
    }

    fun setCurrentActivity(activity: Activity) {
        this.currentActivity = activity
    }

    companion object {
        private const val expectedPackageName = "com.example.freerasp_task" // Don't use Context.getPackageName!
        private val expectedSigningCertificateHashBase64 = arrayOf(
            "mVr/qQLO8DKTwqlL+B1qigl9NoBnbiUs8b4c2Ewcz0k=",
            "cVr/qQLO8DKTwqlL+B1qigl9NoBnbiUs8b4c2Ewcz0m="
        ) // Replace with your release (!) signing certificate hashes
        private const val watcherMail = "zofka.tunova@gmail.com" // for Alerts and Reports
        private val supportedAlternativeStores = emptyArray<String>()
        private val isProd = true
    }

    override fun onRootDetected() {
//        TODO("Not yet implemented")
    }

    override fun onDebuggerDetected() {
//        TODO("Not yet implemented")
    }

    override fun onEmulatorDetected() {
//        TODO("Not yet implemented")
    }

    override fun onTamperDetected() {
//        TODO("Not yet implemented")
    }

    override fun onUntrustedInstallationSourceDetected() {
        if (this.currentActivity != null) {
            this.currentActivity!!.findViewById<TextView>(R.id.textView1).setText("chybicka :) cmuk")
        }
//        TODO("Not yet implemented")
    }

    override fun onHookDetected() {
//        TODO("Not yet implemented")
    }

    override fun onDeviceBindingDetected() {
//        TODO("Not yet implemented")
    }

    override fun onObfuscationIssuesDetected() {
//        TODO("Not yet implemented")
    }
}