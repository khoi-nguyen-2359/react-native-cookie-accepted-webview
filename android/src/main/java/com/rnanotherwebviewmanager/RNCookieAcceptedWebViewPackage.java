package com.rnanotherwebviewmanager;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.Arrays;
import java.util.List;

/**
 * Created by khoinguyen on 3/15/17.
 */

public class RNCookieAcceptedWebViewPackage implements ReactPackage {
	@Override
	public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
		return Arrays.asList();
	}

	@Override
	public List<Class<? extends JavaScriptModule>> createJSModules() {
		return Arrays.asList();
	}

	@Override
	public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
		return Arrays.<ViewManager>asList(
			new RNCookieAcceptedWebViewManager()
		);
	}
}
