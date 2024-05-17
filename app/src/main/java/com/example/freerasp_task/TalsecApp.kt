package com.example.freerasp_task

import android.app.Application
import com.aheaditec.talsec_security.security.api.ThreatListener

class TalsecApp : Application(), ThreatListener.ThreatDetected {

    override fun onCreate() {
        super.onCreate()
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