package com.pchmn.materialchips.model;


import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Chip implements ChipInterface {

    private long id;
    private Uri avatarUri;
    private Drawable avatarDrawable;
    private String label;
    private String info;

    public Chip(@NonNull long id, @Nullable Uri avatarUri, @NonNull String label, @Nullable String info) {
        this.id = id;
        this.avatarUri = avatarUri;
        this.label = label;
        this.info = info;
    }

    public Chip(@NonNull long id, @Nullable Drawable avatarDrawable, @NonNull String label, @Nullable String info) {
        this.id = id;
        this.avatarDrawable = avatarDrawable;
        this.label = label;
        this.info = info;
    }

    public Chip(@Nullable Uri avatarUri, @NonNull String label, @Nullable String info) {
        this.avatarUri = avatarUri;
        this.label = label;
        this.info = info;
    }

    public Chip(@Nullable Drawable avatarDrawable, @NonNull String label, @Nullable String info) {
        this.avatarDrawable = avatarDrawable;
        this.label = label;
        this.info = info;
    }

    public Chip(@NonNull long id, @NonNull String label, @Nullable String info) {
        this.id = id;
        this.label = label;
        this.info = info;
    }

    public Chip(@NonNull String label, @Nullable String info) {
        this.label = label;
        this.info = info;
    }

    @Override
    public long get_id() {
        return id;
    }

    @Override
    public Uri getAvatarUri() {
        return avatarUri;
    }

    @Override
    public Drawable getAvatarDrawable() {
        return avatarDrawable;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public String getInfo() {
        return info;
    }

    @Override
    public String getAvatarUrl() {
        return null;
    }
}
