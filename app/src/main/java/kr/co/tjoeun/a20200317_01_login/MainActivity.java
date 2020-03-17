package kr.co.tjoeun.a20200317_01_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    멤버변수 생성해야함!!!
//    참조형 변수 Button을 만들어서 null로 세팅;
    Button loginBtn = null;
    TextView findPwTxt = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = findViewById(R.id.loginBtn);

//                로그인 버튼의 글자를 회원가입으로 바꾸자
        loginBtn.setText("회원가입");
//        비밀번호 찾기 텍스트뷰를 => JAVA에서 "비번 찾기" 로 변경
//        findPwTxt 로 id를 부여하자.
        findPwTxt = findViewById(R.id.findPwTxt);
        findPwTxt.setText("비번 찾기");
    }
}
