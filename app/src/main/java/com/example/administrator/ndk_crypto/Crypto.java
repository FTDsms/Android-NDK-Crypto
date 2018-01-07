package com.example.administrator.ndk_crypto;

/**
 * Created by Administrator on 2018/1/6.
 */

public class Crypto {

    static {
        System.loadLibrary("Crypto");
    }

    public native String encrypt(String prim);
    public native String decrypt(String code);
}

