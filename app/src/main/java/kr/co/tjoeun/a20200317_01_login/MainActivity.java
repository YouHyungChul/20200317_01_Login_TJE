package kr.co.tjoeun.a20200317_01_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    멤버변수 생성해야함!!!
//    참조형 변수 Button을 만들어서 null로 세팅;
    Button loginBtn = null;
    TextView findPwTxt = null;
    TextView signUpTxt = null;
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
        signUpTxt = findViewById(R.id.signUpTxt);

//        로그인 버튼이 눌리면 => 비번 찾기 버튼을 "AAA" 로 변경
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                findPwTxt.setText("AAA");

            }
        });
//        클리은 버튼 뿐 아니라 모든 뷰가 다 눌릴 수있다. => 텍스트뷰도 클릭
        findPwTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findPwTxt.setText("비밀번호 찾기");
            }
        });

        loginBtn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                loginBtn.setText("로그인");
                return true; // 손을 땟을 때, onClick 실행을 막을건지?
            }
        });

//        회원가입을 누르면 => "회원가입 화면으로 이동합니다." 안내문구 출력
        signUpTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "회원가입 화면으로 이동합니다.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
