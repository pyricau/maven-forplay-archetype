package com.test.core;

import static forplay.core.ForPlay.*;

import forplay.core.GroupLayer;
import forplay.core.Image;
import forplay.core.ImageLayer;
import forplay.core.ResourceCallback;

/**
 * Based on the forplay-cute example (Copyright 2011 The ForPlay Authors), which
 * is licensed under the Apache License, Version 2.0.
 */
public class Pea {

    public static final String IMAGE = "images/pea.png";

    private ImageLayer layer;

    private float angle;

    public Pea(final GroupLayer peaLayer, final float x, final float y) {
        Image image = assetManager().getImage(IMAGE);
        layer = graphics().createImageLayer(image);

        /*
         * Add a callback for when the image loads. This is necessary because we
         * can't use the width/height (to center the image) until after the
         * image has been loaded
         */
        image.addCallback(new ResourceCallback<Image>() {
            @Override
            public void done(Image image) {
                layer.setOrigin(image.width() / 2f, image.height() / 2f);
                layer.setTranslation(x, y);
                peaLayer.add(layer);
            }

            @Override
            public void error(Throwable err) {
                log().error("Error loading image!", err);
            }
        });
    }

    public void update(float delta) {
        angle += delta;
        layer.setRotation(angle);
    }
}
