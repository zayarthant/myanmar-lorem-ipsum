package com.mandalarsoft.mli;

import java.io.IOException;

/**
 * Myanmar Lorem Ipsum Dummy Text Generator
 * 
 * @author Zayar Shin Thant
 * @since 1.0
 * 
 */
public class DummyTextGenerator {

    private static DummyText dummyText = new DummyText();

    public static String get(String resourceName, int count) throws IOException {
        if(count > 1)
            count--;
        else
            count = 0;
        String data = Resources.get(resourceName);
        String result = dummyText.generate(data, count);
        return result;
    }

    
}