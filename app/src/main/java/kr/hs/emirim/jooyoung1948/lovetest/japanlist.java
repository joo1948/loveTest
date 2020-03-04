package kr.hs.emirim.jooyoung1948.lovetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class japanlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_japanlisk);
    }

    public void japanlistonClick(View view) {
            //메인으로 버튼 눌렀을 때 MainActivity창으로 가기 위함
            Intent gotomainIntent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(gotomainIntent);

    }
}
