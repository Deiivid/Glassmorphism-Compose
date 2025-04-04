package com.composeglassmorphism.modifier.utils

import android.graphics.Bitmap

/**
 * Utility object to apply native blur effects on Bitmaps using JNI.
 * This class loads the native C++ library `GlassMorphism` and exposes the
 * native function `nativeBlurBitmap`.
 */
object GlassMorphismUtils {

    // Loads the native C++ library at runtime. This should match the name of your .so file.
    init {
        System.loadLibrary("GlassMorphism")
    }

    /**
     * Applies a blur effect to the provided [bitmap] using a native (C++) implementation.
     * This method modifies the original bitmap directly.
     *
     * @param bitmap The Bitmap to blur. Must be in RGBA_8888 format.
     * @param radius The blur radius. A higher value results in a stronger blur.
     */
    external fun nativeGlassMorphismBitmap(bitmap: Bitmap, radius: Int)
}