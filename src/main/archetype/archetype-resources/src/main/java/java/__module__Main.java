package ${package}.java;

import ${package}.core.${module}Game;

import forplay.core.ForPlay;
import forplay.java.JavaAssetManager;
import forplay.java.JavaPlatform;

public class ${module}Main {

    public static void main(String[] args) {
        JavaPlatform platform = JavaPlatform.register();
        JavaAssetManager assets = platform.assetManager();
        assets.setPathPrefix("src/main/java/${packageInPathFormat}/resources");
        ForPlay.run(new ${module}Game());
    }

}
