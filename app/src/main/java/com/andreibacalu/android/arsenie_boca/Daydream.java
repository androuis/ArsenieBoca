package com.andreibacalu.android.arsenie_boca;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.service.dreams.DreamService;

public class Daydream extends DreamService {
    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();

        setInteractive(false);
        setFullscreen(true);

        setContentView(R.layout.main_activity_layout);
    }
}
