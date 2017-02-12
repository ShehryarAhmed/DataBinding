package com.example.mt_2016.newagain;

import android.databinding.DataBindingUtil;
import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mt_2016.newagain.databinding.BindingClass;

public class MainActivity extends AppCompatActivity {

    BindingClass binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

    }
}
