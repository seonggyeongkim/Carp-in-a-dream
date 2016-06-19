package kr.hs.emirim.duckbill0316.carpinadream;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by appcreator01 on 2016. 6. 19..
 */
public class ThirdActivity extends ActionBarActivity{

    static String TAG=":꿈속 잉어 : SecondActivity"; //밑의 log의 데이터 값에 출력

    TextView mResult;
    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Log.d(TAG, "결과 액티비티 시작!"); //log에 메세지 출력!

        mResult=(TextView)findViewById(R.id.result_na);
        mImageView =(ImageView)findViewById(R.id.imageView);
        Log.d(TAG,"텍스트뷰 연결 성공!");

        //랜덤 객체
        Random r= new Random();

        //랜덤 값 저장
        int result=r.nextInt(17);
        Log.d(TAG,"랜덤값 생성! : "+result);

        mImageView.setImageResource(R.drawable.img_01+result); //이미지의 지정된 값이 '1'씩 증가 하므로, 값 출력 가능!


        Intent intent=getIntent();
        String name =intent.getStringExtra("name"); //name을 불러와 주세요!
        Log.d(TAG,"인텐트값 읽기 <name> : "+name);


        mResult.setText(name + "님, 안녕하세요!"+"\n"+"오늘 밤, 잉어가 들려주는 이야기 입니다."); //출력

    }
    }
