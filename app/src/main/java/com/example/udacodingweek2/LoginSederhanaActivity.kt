package com.example.udacodingweek2

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login_sederhana.*
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class LoginSederhanaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_sederhana)
        btnLogin.setOnClickListener {
            val username = findViewById<EditText>(R.id.edtUsername)
            val password = findViewById<EditText>(R.id.edtPassword)
            if ((username.text.toString() == "udacoding" && password.text.toString() == "admin")) {
                Dialog(this).apply {
                    requestWindowFeature(Window.FEATURE_NO_TITLE)
                    setCancelable(true)
                    setContentView(R.layout.activity_output_form_input)
                }.show()
            } else {
                Toast.makeText(this, "UPPPSS Username or Password Wrong !!", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}