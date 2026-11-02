package com.intergi.playwiresdk;

import android.content.Context;

/** No ads in this build: stands in for the advertising SDK so the app compiles without it. */
public final class PlaywireSDK {
    public static final PlaywireSDK INSTANCE = new PlaywireSDK();

    public interface Callback { Object invoke(); }

    private PlaywireSDK() {}

    public void initialize(String publisherId, String appId, Context context, Callback callback) {}

    public void setTest(boolean test) {}
}
