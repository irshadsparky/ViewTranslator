package com.smi.viewtanslatorproject;

import android.app.Application;

import com.smi.viewtranslator.AVTranslation;

import java.util.Locale;

/**
 * Created by Mizutori on 2017/03/20.
 */

public class Applicationclass extends Application {
    public String API_KEY = "trnsl.1.1.20190117T061432Z.7005021dbbd9ec24.96fd7aa7d7531b532cd2195e11444e820d526409";
//https://translate.yandex.com/developers/keys
    @Override
    public void onCreate() {
        super.onCreate();

        AVTranslation.setSourceLanguage("en", API_KEY);
        AVTranslation.setTargetLanguage("ja");
//        AVTranslation.setTargetLanguage(Locale.getDefault().getLanguage());
        //InAppTranslation.clearCache(this);

        //InAppTranslation.setTargetLanguage("ja");
    }


}
