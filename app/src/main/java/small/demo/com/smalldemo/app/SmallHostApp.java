package small.demo.com.smalldemo.app;

import android.app.Application;

import net.wequick.small.Small;

/**
 * Created by caiminming on 2017/12/6.
 */

public class SmallHostApp extends Application {
    public SmallHostApp() {
        //Small初始化。
        Small.preSetUp(this);
    }
}
