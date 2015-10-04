package com.example.MyAndroidApp02;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;

/**
 * Created by yusuke on 9/27/15.
 */
public class AppMain extends Activity {


    public void onClickFunc(View view) {

        Intent intent;

        switch (view.getId()) {
            case R.id.func01:
                intent = new Intent(this, AppFunc_01.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
    }
}
