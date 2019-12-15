package org.song.videoplayer.cache;

import android.content.Context;

import com.danikula.videocache.HttpProxyCacheServer;

import java.util.Map;

public class CacheManager {

    public static String buildCacheUrl(Context context, String rawUrl, Map<String, String> headers) {
        HttpProxyCacheServer proxy = Proxy.getProxy(context, headers);
        return proxy.getProxyUrl(rawUrl);
    }

}
