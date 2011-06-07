package com.test.java;

import com.test.core.MyModuleGame;

import forplay.core.ForPlay;
import forplay.java.JavaAssetManager;
import forplay.java.JavaPlatform;

public class MyModuleMain {

    public static void main(String[] args) {
        JavaPlatform platform = JavaPlatform.register();
        JavaAssetManager assets = platform.assetManager();
        assets.setPathPrefix("src/main/java/com/test/resources");
        ForPlay.run(new MyModuleGame());
    }

}
