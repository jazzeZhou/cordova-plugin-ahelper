package com.sroom.ahelper;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;
import android.util.Log;

public class Ahelper extends CordovaPlugin {

  public static final String ACTION_EXIT = "Exit";

  private static CallbackContext mCallbackContext;
  private static CordovaInterface mCordova = null;
  private static CordovaPlugin mPlugin = null;

  public void initialize(CordovaInterface cordova, CordovaWebView webView) {
    super.initialize(cordova, webView);
    mCordova = cordova;
    mPlugin = this;
  }

  public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
    if (ACTION_EXIT.equals(action)) {
      System.exit(0);
    }
    return true;
  }
}
