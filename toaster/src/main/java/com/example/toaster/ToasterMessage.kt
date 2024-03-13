package com.example.toaster

import android.content.Context
import android.widget.Toast

open class ToasterMessage {
    companion object {
        fun showToast(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        }
    }
}