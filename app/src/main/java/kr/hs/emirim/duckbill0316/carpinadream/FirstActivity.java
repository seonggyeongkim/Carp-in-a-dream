package kr.hs.emirim.duckbill0316.carpinadream;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by appcreator01 on 2016. 6. 19..
 */
public class FirstActivity extends ActionBarActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //지정 시간에 따라 화면이 넘어간다! (일정 시간 지정 가능!)
        Handler handler=new Handler();

        handler.postDelayed(new Runnable() {  //익명 객
            @Override
            public void run() { //(객체의 잠조 값 , ms단위의 시간 값)
                Intent intent=new Intent(getApplicationContext(),MainActivity.class); //액티비티 시작시 필요한 객체 (인턴트 객체)
                startActivity(intent);
                overridePendingTransition(0,R.anim.zoom_exit); //<-화면 전환
                finish(); //현재 액티비트를 닫아줌
            }
        },3000); //1초에 1000 (ms 단위)



    }

}
