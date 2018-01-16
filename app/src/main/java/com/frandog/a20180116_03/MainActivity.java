package com.frandog.a20180116_03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

//    流程:
//    登入firebase > 開新專案 > 點擊上方tool/firebase
//    > 點Cloud Messaging > Connect your app to firebase
//    > add FCM to your app > 到firebase網點右上的"轉到控制台"
//    > 網站上點擊專案 > 點左方grow/notification > 即可傳送推播(此教學只能在firebase網頁上推，要由server自己推的話一定要寫server)
//    >當傳失敗時，注意手機模擬器的時區與時間對不對

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
