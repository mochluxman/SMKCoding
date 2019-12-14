package com.larapin.btmnavtab.Auth

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.larapin.btmnavtab.R
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        textView.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
