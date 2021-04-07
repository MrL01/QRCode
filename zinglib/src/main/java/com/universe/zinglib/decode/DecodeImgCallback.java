package com.universe.zinglib.decode;

import com.google.zxing.Result;

/**
 * <p>
 * 解析图片的回调
 */

public interface DecodeImgCallback {
    void onImageDecodeSuccess(Result result);

    void onImageDecodeFailed();
}
