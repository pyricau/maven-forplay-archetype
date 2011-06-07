package com.test.html;

import com.google.gwt.core.client.EntryPoint;
import com.test.core.MyModuleGame;

import forplay.core.ForPlay;
import forplay.html.HtmlAssetManager;
import forplay.html.HtmlPlatform;

public class MyModuleEntryPoint implements EntryPoint {

    public void onModuleLoad() {
        HtmlPlatform platform = HtmlPlatform.register();
        HtmlAssetManager assets = platform.assetManager();
        assets.setPathPrefix("MyModule/");
        ForPlay.run(new MyModuleGame());
    }
}
