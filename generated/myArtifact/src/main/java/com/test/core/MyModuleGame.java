package com.test.core;

import static forplay.core.ForPlay.*;

import java.util.ArrayList;
import java.util.List;

import forplay.core.Game;
import forplay.core.GroupLayer;
import forplay.core.Image;
import forplay.core.ImageLayer;
import forplay.core.ResourceCallback;

/**
 * Based on the forplay-cute example (Copyright 2011 The ForPlay Authors), which
 * is licensed under the Apache License, Version 2.0.
 */
public class MyModuleGame implements Game {

    private GroupLayer peaLayer;
    private final List<Pea> peas = new ArrayList<Pea>(0);

    @Override
    public void init() {
        // create and add background image layer
        Image backgroundImage = assetManager().getImage("images/background.png");

        backgroundImage.addCallback(new ResourceCallback<Image>() {
            @Override
            public void done(Image image) {
                graphics().setSize(image.width(), image.height());
            }

            @Override
            public void error(Throwable err) {
                log().error("Error loading image!", err);
            }
        });

        ImageLayer backgroundLayer = graphics().createImageLayer(backgroundImage);
        graphics().rootLayer().add(backgroundLayer);

        // create a group layer to hold the peas
        peaLayer = graphics().createGroupLayer();
        graphics().rootLayer().add(peaLayer);

        // preload the pea image into the asset manager cache
        assetManager().getImage(Pea.IMAGE);

        // add a listener for pointer (mouse, touch) input
        pointer().setListener(new AbstractPointerListener() {
            @Override
            public void onPointerEnd(float x, float y) {
                Pea pea = new Pea(peaLayer, x, y);
                peas.add(pea);
            }
        });
    }

    @Override
    public void paint(float alpha) {
        /*
         * Layers automatically paint themselves (and their children). The
         * rootlayer will paint itself, the background, and the pea group layer
         * automatically so no need to do anything here!
         */
    }

    @Override
    public void update(float delta) {
        for (Pea pea : peas) {
            pea.update(delta);
        }
    }

    @Override
    public int updateRate() {
        return 25;
    }
}
