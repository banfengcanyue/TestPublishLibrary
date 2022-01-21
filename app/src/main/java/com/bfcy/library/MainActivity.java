package com.bfcy.library;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bfcy.base.utils.TimeUtil;
import com.bfcy.common.utils.BaseUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BaseUtils.INSTANCE.getAppName(this);
        TimeUtil.logTimeZone();
    }
}