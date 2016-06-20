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
    TextView mTitle;
    TextView mContent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Log.d(TAG, "결과 액티비티 시작!"); //log에 메세지 출력!

        mResult=(TextView)findViewById(R.id.result_na);
        mImageView =(ImageView)findViewById(R.id.imageView);
        mTitle=(TextView)findViewById(R.id.result_ti);
        mContent=(TextView)findViewById(R.id.result_con);

        Log.d(TAG,"텍스트뷰 연결 성공!");

        //랜덤 객체
        Random r= new Random();

        //랜덤 값 저장
        int result=r.nextInt(17); //몇 부터 몇까지 나올까??
        Log.d(TAG,"랜덤값 생성! : "+result);

        mImageView.setImageResource(R.drawable.img_01+result); //이미지의 지정된 값이 '1'씩 증가 하므로, 값 출력 가능!

        if(result==1)
        {
            mTitle.setText("붕어가 잉어로 변하는 꿈!");
            mContent.setText("가난한 사람이 성공하여 부자가 될것이며, \n 작게 시작하여 크게 성공할 것을 암시합니다 \n");
        }else if(result==2){
            mTitle.setText("연못이나 우물에 잉어를 넣는 꿈!");
            mContent.setText("하는 일이 번창하거나 관직에 오를것입니다\n");
        }else if(result==3){
            mTitle.setText("화장실 욕조 안에서 잉어가 놀고 있는 꿈!");
            mContent.setText("집안에 경사가 생기고, 재물과 돈이 들어오게 될것으로,\n 먹거리, 물품, 횡재등이 생길것입니다\n");
        }else if(result==4){
            mTitle.setText("칼로 잉어를 자르다가 살을 베는 꿈!");
            mContent.setText("사고를 당하게 될것이며, 질병으로 병원출입이 잦을것입니다\n");
        }else if(result==5){
            mTitle.setText("물 속에서 잉어를 잡으려다가 놓치고 송사리만 잡는 꿈!");
            mContent.setText("큰 것은 일고 작은 소망만 이루어질 것이며, \n 주범은 놓치고 그의하수인들만 잡을 것을 암시합니다 \n");
        }else if(result==6){
            mTitle.setText("폭포 위로 커다란 잉어가 뛰어오르는 것을 보는 꿈!");
            mContent.setText("사업가라면 사업이 크게 번성하고 일반인은 하는 일이 잘 풀려 \n 큰 빛을 보게 되어 세상을 놀라게 할 것입니다\n");
        }else if(result==7){
            mTitle.setText("도마 위에 잉어를 놓고 토막쳐 죽이는 꿈!");
            mContent.setText("임산부의 경우 낙태를 하게 될 징조며, 여러 사람에게 돈을 나누어 줄 일이 생길것입니다\n");
        }else if(result==8){
            mTitle.setText("잉어가 죽은 것을 보는 꿈!");
            mContent.setText("집안에 질병이 돌거나 임산부는 임신한 태아를 유산하게 되거나 \n 수술을 하여 출산하게 될것입니다\n");
        }else if(result==9){
            mTitle.setText("큰 잉어 세 마리 중 두 마리만 싱싱하게 살아 있는 꿈!");
            mContent.setText("쌍둥이 딸이 태어나는 태몽으로, \n 딸들이 공부도 잘하고 남편도 훌륭한 가문의 능력있는 사람을 만나게 될 것입니다 \n");
        }else if(result==10){
            mTitle.setText("잉어가 제 앞으로 오다가 사라지는 꿈!");
            mContent.setText("태아가 유산되거나 문제가 생길 것입니다 \n");
        }else if(result==11){
            mTitle.setText("폭포 위로 잉어가 뛰어오르는 꿈 !");
            mContent.setText("사업이 번창하여 사람들을 놀라게 할 것입니다\n");
        }else if(result==12){
            mTitle.setText("물이 담긴 그릇에 잉어를 집어넣는 꿈!");
            mContent.setText("창작 작품으로 많은 사람들에게 인정을 받을 것입니다\n");
        }else if(result==13){
            mTitle.setText("큰 물고기나 잉어를 잡는 꿈!");
            mContent.setText("권력와 재물을 얻게 되며, 배우자나 귀인을 만날 징조이다. \n");
        }else if(result==14){
            mTitle.setText("물 속에서 헤엄치는 큰 물고기나 잉어를 보는 꿈 !");
            mContent.setText("지위가 상승하고 사업이 번창하는 등 권리와 재물로 인한 기쁨이 따른다.\n");
        }else if(result==15){
            mTitle.setText("잉어를 잡아서 집 안에 들이는 꿈!");
            mContent.setText("하던 일이 크게 성공하여 주위 사람들이 모두 놀란다.\n");
        }else if(result==16){
            mTitle.setText("잉어를 물이 있는 그릇에 넣는 꿈!");
            mContent.setText("추진중이던 일이 잘 이루어져 이름을 떨치고 지위와 명예를 얻게 될 운이다.\n");
        }else if(result==17){
            mTitle.setText("연못에서 잉어가 뛰는 꿈 !");
            mContent.setText("새로운 작품을 발표하여 여러 사람의 좋은 평가를 받게 된다. \n");
        }


        Intent intent=getIntent();
        String name =intent.getStringExtra("name"); //name을 불러와 주세요!
        Log.d(TAG,"인텐트값 읽기 <name> : "+name);


        mResult.setText(name + "님, 안녕하세요!"+"\n"+"오늘 밤, 잉어가 들려주는 이야기 입니다."); //출력

    }
    }
