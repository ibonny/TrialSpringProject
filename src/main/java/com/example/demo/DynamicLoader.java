package com.example.demo;

import java.lang.reflect.InvocationTargetException;
// import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import org.springframework.stereotype.Service;

@Service
public class DynamicLoader {
    private Class<?> loadJarFile(String jarFilename, String className) throws MalformedURLException {
        URLClassLoader child = new URLClassLoader(new URL[] { new URL("file://" + jarFilename) },
                this.getClass().getClassLoader());

        Class<?> classToLoad;

        try {
            classToLoad = Class.forName(className, true, child);
        } catch (ClassNotFoundException cnfe) {
            return null;
        }

        return classToLoad;
    }

    public Object executeFunction(String funcName) throws NoSuchMethodException, SecurityException,
            InstantiationException, IllegalAccessException, InvocationTargetException, MalformedURLException {
        Class<?> classToLoad = loadJarFile("./target/demo-0.0.1-SNAPHOT.war", "com.example.demo.DemoService");

        // Method method = classToLoad.getDeclaredMethod(funcName);
        DemoService instance = (DemoService) classToLoad.getConstructor().newInstance();

        return instance.sampleFunction();

        // Object result = method.invoke(instance);

        // return result;
    }
}