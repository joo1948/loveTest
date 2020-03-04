package kr.hs.emirim.jooyoung1948.lovetest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClick(View view) {
        switch(view.getId()){
            case R.id.button:
                //시작 버튼 눌렀을 때 servey창으로 가기 위함
                Intent intent = new Intent(getApplicationContext(), servey.class);
                startActivity(intent);
                break;
            case R.id.finishbtn:
                //종료 버튼 눌렀을 때 앱 종료
                finish();
        }
    }
}
