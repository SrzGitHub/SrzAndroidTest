package com.srz.net.util;

import android.util.Log;

import com.srz.net.BuildConfig;

public class SLog {

    private static final String TAG = "SLog";
    static String className;//类名
    static String methodName;//方法名
    static int lineNumber;//行数

    /**
     * 判断是否可以调试
     *
     * @return
     */
    public static boolean isDebuggable() {
        return BuildConfig.DEBUG;
    }

    private static String createLog(String log) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("(").append(className).append(":").append(lineNumber).append(") ");
        buffer.append("Methods: ");
        buffer.append(methodName + ": ");
        buffer.append(log);
        return buffer.toString();
    }

    /**
     * 获取文件名、方法名、所在行数
     *
     * @param sElements
     */
    private static void getMethodNames(StackTraceElement[] sElements) {
        className = sElements[1].getFileName();
        methodName = sElements[1].getMethodName();
        lineNumber = sElements[1].getLineNumber();
    }

    public static void e(String message) {
        if (!isDebuggable())
            return;
        getMethodNames(new Throwable().getStackTrace());
        Log.e(TAG, createLog(message));
    }

    public static void i(String message) {
        if (!isDebuggable())
            return;
        getMethodNames(new Throwable().getStackTrace());
        Log.i(TAG, createLog(message));
    }

    public static void d(String message) {
        if (!isDebuggable())
            return;
        getMethodNames(new Throwable().getStackTrace());
        Log.d(TAG, createLog(message));
    }

    public static void v(String message) {
        if (!isDebuggable())
            return;
        getMethodNames(new Throwable().getStackTrace());
        Log.v(TAG, createLog(message));
    }

    public static void w(String message) {
        if (!isDebuggable())
            return;
        getMethodNames(new Throwable().getStackTrace());
        Log.w(TAG, createLog(message));
    }


}