package pt.flag.movieapp.utils;

import pt.flag.movieapp.BuildConfig;

// Use DLog instead of Log to add debug log, so that we could enable/disable logs easily
public class DLog {

    static final boolean LOG = BuildConfig.DEBUG;

    public static void i(String tag, String string) {
        if (LOG) {
            android.util.Log.i(tag, string);
        }
    }

    public static void e(String tag, String string) {
        if (LOG) {
            android.util.Log.e(tag, string);
        }
    }

    public static void d(String tag, String string) {
        if (LOG) {
            android.util.Log.d(tag, string);
        }
    }

    public static void v(String tag, String string) {
        if (LOG) {
            android.util.Log.v(tag, string);
        }
    }

    public static void w(String tag, String string) {
        if (LOG) {
            android.util.Log.w(tag, string);
        }
    }
}