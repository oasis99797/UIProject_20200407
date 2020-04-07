package com.bklee.uiproject_20200407

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {
            // 로그인 버튼이 눌리면 할 일을 지정
            Log.d("로그인버튼","버튼 클릭됨")

            val inputEmail = emailEdt.text.toString()

            Toast.makeText(this, inputEmail, Toast.LENGTH_SHORT).show()

        }

        loginBtn.setOnLongClickListener {

            Log.d("로그인버튼","버튼 길게 누름")
            return@setOnLongClickListener true

            //return@함수이름 => 해당 함수의 결과로 설정 명시
            // return true: 롱클릭만 전용 처리, false:일반클릭도 같이 처리
        }
    }
}
