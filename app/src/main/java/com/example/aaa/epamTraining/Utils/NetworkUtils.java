package com.example.aaa.epamTraining.Utils;

import android.net.Uri;

import java.net.MalformedURLException;
import java.net.URL;

public class NetworkUtils {
    private static final String VK_API_BASIC_USER_URL = "https://api.vk.com/";
    private static final String VK_USER_GET  = "/method/user.get";
    private static final String PARAM_USER_ID  = "user_id";
    private static final String PARAM_VERTION  = "v";

    public static URL generateURL(String userId) {
        Uri builtUri = Uri.parse(VK_API_BASIC_USER_URL + VK_USER_GET)
                .buildUpon()
                .appendQueryParameter(PARAM_USER_ID, userId)
                .appendQueryParameter(PARAM_VERTION, "5.8")
                .build();
        URL url = null;
        try {
            url = new URL(builtUri.toString());
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }

        return url;
    }
}
