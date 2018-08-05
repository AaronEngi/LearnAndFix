package wang.tyrael.learnandfix;

import android.content.Context;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Enumeration;

import dalvik.system.DexFile;

/**
 * Created by tyraelwang on 2018/8/5 0005.
 */
public class DxManager {
    Context context;

    void loadDex(File dexFilePath){
        File optFile = new File(context.getCacheDir(), dexFilePath.getName());
        DexFile dexFile = null;
        try {
            dexFile = DexFile.loadDex(dexFilePath.getAbsolutePath(), optFile.getAbsolutePath(), Context.MODE_PRIVATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Enumeration<String> entries = dexFile.entries();
        for (String entry : entries){
            fix(realClazz);
        }
    }

    void fix(Class realClazz){
        Method[] methods = realClazz.getDeclaredMethods();
        for (Method method : methods){
            String wrongClazzName = "";
            String

            Class wrongClass = Class.forName(wrongClazzName);
            Method wrongMethod =  wrongClass.getMethod(wrongClazzName, method.getParameterTypes());
            replace(wrongMethod, method);
        }
    }

    private native void replace(Method wrongMethod, Method method);
}
