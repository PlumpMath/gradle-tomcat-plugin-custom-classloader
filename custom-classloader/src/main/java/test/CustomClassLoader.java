package test;

import org.apache.catalina.loader.WebappClassLoader;

/**
 * @autor Dmitry Vyazelenko
 */
public class CustomClassLoader extends WebappClassLoader {
    public CustomClassLoader(ClassLoader parent) {
        super(parent);
    }
}
