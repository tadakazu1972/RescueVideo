package osakacityfire.rescuevideo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {
    protected MainActivity mActivity;
    protected View mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mActivity = this;
        mView = this.getWindow().getDecorView();

        setContentView(R.layout.activity_main);

        //ボタン初期化
        initButtons();
    }

    //ボタン初期化
    private void initButtons(){
        //ビデオ１
        mView.findViewById(R.id.btnVideo1).setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(mActivity, VideoActivity.class);
                intent.putExtra("index", 1);
                startActivity(intent);
            }
        });

        //ビデオ２
        mView.findViewById(R.id.btnVideo2).setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(mActivity, VideoActivity.class);
                intent.putExtra("index", 2);
                startActivity(intent);
            }
        });

        //ビデオ３
        mView.findViewById(R.id.btnVideo3).setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(mActivity, VideoActivity.class);
                intent.putExtra("index", 3);
                startActivity(intent);
            }
        });
    }
}
