package com.twiscode.myapplicationpayload

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login_btn.setOnClickListener {
            login(email_et.text.toString(), password_et.text.toString())
        }
    }

    private fun login(email: String, password: String) {
        if (!ValidationLogin.validationEmail(email)) {
            Toast.makeText(this, "Your email not valid", Toast.LENGTH_SHORT).show()
            return
        }

        if (!ValidationLogin.validationPassword(password)) {
            Toast.makeText(this, "Your password need to have Lowercase, Uppercase, number and Special character", Toast.LENGTH_SHORT).show()
            return
        }

        Toast.makeText(this, "Success validation email: $email & password: $password", Toast.LENGTH_SHORT).show()
    }
}
