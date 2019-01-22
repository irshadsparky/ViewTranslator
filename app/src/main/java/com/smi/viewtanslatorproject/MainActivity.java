package com.smi.viewtanslatorproject;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.smi.viewtanslatorproject.databinding.ActivityMainBinding;
import com.smi.viewtranslator.AVTranslation;

public class MainActivity extends AppCompatActivity {
    TextView helloword;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        helloword = findViewById(R.id.helloword);
        Settext(helloword, "what is your name");
    }

    private void Settext(View v, String s) {
        AVTranslation.localizeText(helloword, "what is your name");
    }
}
