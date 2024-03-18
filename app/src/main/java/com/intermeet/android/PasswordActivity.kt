package com.intermeet.android

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.intermeet.android.helperFunc.getUserDataRepository

class PasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password)

        ButtonFunc()
    }

    private
    fun ButtonFunc() {


        val nextButton: Button = findViewById(R.id.next_button)
        nextButton.setOnClickListener {
            val passwordEdit: EditText = findViewById(R.id.password)
            val password = passwordEdit.text.toString()

            // Retrieve userDataRepository
            val userDataRepository = getUserDataRepository()
            val userData = userDataRepository.userData ?: UserDataModel()
            userData.password = password

            val intent = Intent(this, BirthdayActivity::class.java)
            startActivity(intent)
        }
    }
}
