package ticwear.design;

import android.os.Build;

/**
 * Library configurations, delete when we integrated the gradle into make.
 *
 * Created by tankery on 4/15/16.
 */
public class DesignConfig {

    public static final boolean DEBUG = !Build.TYPE.equals("user");

    public static final boolean DEBUG_PICKERS = Boolean.parseBoolean("false");
    public static final boolean DEBUG_RECYCLER_VIEW = Boolean.parseBoolean("false");
    public static final boolean DEBUG_SCROLLBAR = Boolean.parseBoolean("false");

}
