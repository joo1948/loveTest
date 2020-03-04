package kr.hs.emirim.jooyoung1948.lovetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class servey extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servey);
    }

    public void serveyonClick(View view) {
        switch(view.getId()){
            case R.id.japan:
                //일본이란 버튼을 눌렀을 시
                //시작 버튼 눌렀을 때 servey창으로 가기 위함
                Intent japanIntent = new Intent(getApplicationContext(), japanlist.class);
                startActivity(japanIntent);
                break;
            case R.id.swiss:
                //스위스란 버튼을 눌렀을 시
                //시작 버튼 눌렀을 때 servey창으로 가기 위함
                Intent swissIntent = new Intent(getApplicationContext(), swisslist.class);
                startActivity(swissIntent);
                break;
            case R.id.india:
                //인도라는 버튼을 눌렀을 시
                //시작 버튼 눌렀을 때 servey창으로 가기 위함
                Intent indiaIntent = new Intent(getApplicationContext(), indialist.class);
                startActivity(indiaIntent);
                break;
            case R.id.france:
                //프랑스라는 버튼을 눌렀을 시
                //시작 버튼 눌렀을 때 servey창으로 가기 위함
                Intent franceIntent = new Intent(getApplicationContext(), francelist.class);
                startActivity(franceIntent);
                break;
        }
    }
}
