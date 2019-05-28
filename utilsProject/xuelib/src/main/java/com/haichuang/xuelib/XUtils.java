package com.haichuang.xuelib;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;

public class XUtils {
  static   Context curContext;
    public static  void LogMes(String message){
        Log.e("123",message);
    }
    public  static void init(Context context){
        curContext=context;
    }
    public  static void init(Application application){
        curContext=application.getApplicationContext();

    }
    public static void Toash(String message){
        if (isMainLooper()) {
            Toast.makeText(curContext,message,Toast.LENGTH_SHORT).show();
        } else {
           LogMes("当前线程为子线程");
        }
    }

    private static boolean isMainLooper() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

}
