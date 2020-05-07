package com.pchmn.materialchips.model;


import android.graphics.drawable.Drawable;
import android.net.Uri;

public interface ChipInterface {
    public static final String CHIP_INTERFACE = "CHIP_INTERFACE";

    long get_id();

    Uri getAvatarUri();

    Drawable getAvatarDrawable();

    String getLabel();

    String getInfo();

    String getAvatarUrl();
}
