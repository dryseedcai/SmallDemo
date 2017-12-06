package small.demo.com.smalldemo.app;

import android.app.Application;
import android.content.Context;

import net.wequick.small.Small;

import small.demo.com.smalldemo.SmallManager;

/**
 * Created by caiminming on 2017/12/6.
 */

public class SmallHostApp extends Application {
    private static Context sContext;

    public SmallHostApp() {

    }

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = this;
        Small.preSetUp(this);
        SmallManager.getInstance().requestInitPlug();
    }

    public static Context getAppContext() {
        return sContext;
    }
}
