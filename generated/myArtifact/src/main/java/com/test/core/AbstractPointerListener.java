package com.test.core;

import forplay.core.Pointer;

/**
 * Simple class to extend that provides no-op implementations for the {@link Listener} interface.
 */
public abstract class AbstractPointerListener implements Pointer.Listener{

    @Override
    public void onPointerStart(float x, float y) {
        
    }

    @Override
    public void onPointerEnd(float x, float y) {
        
    }

    @Override
    public void onPointerDrag(float x, float y) {
        
    }

}
