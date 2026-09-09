package com.genymobile.scrcpy.model;

import android.media.MediaCodec;
import com.genymobile.scrcpy.util.Ln;

public interface Codec {

    enum Type {
        VIDEO,
        AUDIO,
    }

    Type getType();

    int getId();

    String getName();

    String getMimeType();

    public final class CC {
        public static String getMimeType(MediaCodec codec) {
            String[] types = codec.getCodecInfo().getSupportedTypes();
            return types.length > 0 ? types[0] : null;
        }
    }
}
