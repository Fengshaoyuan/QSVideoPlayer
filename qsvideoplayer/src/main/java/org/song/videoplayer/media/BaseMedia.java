package org.song.videoplayer.media;

import android.os.Handler;
import android.os.Looper;
import android.view.Surface;

/**
 * 解码器父类
 */
public abstract class BaseMedia implements IMediaControl {

    protected IMediaCallback iMediaCallback;
    protected Surface surface;
    protected boolean isPrepare;
    protected Handler mainThreadHandler;

    public Surface getSurface() {
        return surface;
    }

    public BaseMedia(IMediaCallback iMediaCallback) {
        if (iMediaCallback == null)
            throw new IllegalArgumentException();
        this.iMediaCallback = iMediaCallback;
        mainThreadHandler = new Handler(Looper.getMainLooper());
    }
}
