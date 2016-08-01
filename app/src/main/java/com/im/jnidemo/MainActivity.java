package com.im.jnidemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView mTextView = (TextView)findViewById(R.id.tv_text);
        NdkJniUtils jni = new NdkJniUtils();
        mTextView.setText(jni.getCLanguageString());
    }
}
