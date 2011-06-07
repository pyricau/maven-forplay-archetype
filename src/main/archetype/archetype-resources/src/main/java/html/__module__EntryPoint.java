package ${package}.html;

import com.google.gwt.core.client.EntryPoint;
import ${package}.core.${module}Game;

import forplay.core.ForPlay;
import forplay.html.HtmlAssetManager;
import forplay.html.HtmlPlatform;

public class ${module}EntryPoint implements EntryPoint {

    public void onModuleLoad() {
        HtmlPlatform platform = HtmlPlatform.register();
        HtmlAssetManager assets = platform.assetManager();
        assets.setPathPrefix("${module}/");
        ForPlay.run(new ${module}Game());
    }
}
