package com.zerokaraapp.sampletoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //画面が作成されたときの指示を記載
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //レイアウトからボタンの取得
        Button btGoodMorning = findViewById(R.id.btGoodMorning);
        Button btHello = findViewById(R.id.btHello);
        Button btGoodNight = findViewById(R.id.btGoodNight);

        //ボタンに設定するためのリスナのインスタンスを取得
        ToastButtonClickListener listener = new ToastButtonClickListener();

        //ボタンにリスナを設定
        btGoodMorning.setOnClickListener(listener);
        btHello.setOnClickListener(listener);
        btGoodNight.setOnClickListener(listener);

    }

    //ボタンクリックを見張るリスナクラスを定義
    private class ToastButtonClickListener implements View.OnClickListener{

        //onClickメソッドのオーバーライド。ここにボタンをされたときの動作を定義
        @Override
        public void onClick(View view){
            //ボタンのIDを取得 (ボタンはViewクラスの子クラス)
            int id = view.getId();

            //ボタンのIDで条件分岐
            switch(id){

                //おはようボタンの場合
                case R.id.btGoodMorning:
                    //トーストの命令、第2引数でトースト文を指示
                    Toast.makeText(MainActivity.this,R.string.toast_good_morning,Toast.LENGTH_LONG).show();
                    break;

                case R.id.btHello:
                    //トーストの命令、第2引数でトースト文を指示
                    Toast.makeText(MainActivity.this,R.string.toast_hello,Toast.LENGTH_LONG).show();
                    break;

                case R.id.btGoodNight:
                    //トーストの命令、第2引数でトースト文を指示
                    Toast.makeText(MainActivity.this,R.string.toast_good_night,Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }
}