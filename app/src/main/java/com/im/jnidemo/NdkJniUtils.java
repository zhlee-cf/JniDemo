package com.im.jnidemo;

public class NdkJniUtils {
    public native String getCLanguageString();

    static {
        System.loadLibrary("hello");   //defaultConfig.ndk.moduleName
    }
}

