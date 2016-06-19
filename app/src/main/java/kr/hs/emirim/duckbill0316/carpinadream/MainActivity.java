package kr.hs.emirim.duckbill0316.carpinadream;

import android.content.Intent;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mName;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mName = (EditText) findViewById(R.id.name);
        mButton=(Button) findViewById(R.id.but_start);
        mButton.setOnClickListener(this);
    }

    //화면 전환 효과 onResume()

    @Override
    public void onClick(View v) {
        String name = mName.getText().toString();

        try{
            Toast.makeText(this," '이름'과 '잠자는 시간'을 입력해주세요! ", Toast.LENGTH_LONG).show();
            Intent intent=new Intent(this,MainActivity.class);
            intent.putExtra("name",name);
            //화면 전환 효과


        }catch (NullPointerException e) { //예외 처리
            Toast.makeText(this, "이름을 입력해 주세요!", Toast.LENGTH_LONG).show();
        }catch (Exception e)
        {
            Toast.makeText(this,"뭔지 모르지만 잘 안돼요!",Toast.LENGTH_LONG).show();
        }
    }
}
