package com.intergi.playwiresdk.ads.view.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;

import com.intergi.playwiresdk.ads.view.PWViewAd;

/** No ads in this build: an empty, hidden view. */
public class PWBannerView extends FrameLayout {
    public interface Listener {
        void onViewAdOpened(@NonNull PWViewAd ad);
        void onViewAdLoaded(@NonNull PWViewAd ad);
        void onViewAdImpression(@NonNull PWViewAd ad);
        void onViewAdFailedToLoad(@NonNull PWViewAd ad);
        void onViewAdClosed(@NonNull PWViewAd ad);
        void onViewAdClicked(@NonNull PWViewAd ad);
    }

    public PWBannerView(Context context) { super(context); setVisibility(GONE); }
    public PWBannerView(Context context, AttributeSet attrs) { super(context, attrs); setVisibility(GONE); }
    public PWBannerView(Context context, AttributeSet attrs, int defStyle) { super(context, attrs, defStyle); setVisibility(GONE); }

    public void setListener(Listener listener) {}
    public void setAdUnitName(String name) {}
    public void load() {}
    public void destroy() {}
}
