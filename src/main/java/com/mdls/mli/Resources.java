package com.mdls.mli;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Myanmar Lorem Ipsum Dummy Text Generator
 * 
 * @author Zayar Shin Thant
 * @see com.mdls.mli.Resources.class
 * @since 1.0
 * 
 */
public interface Resources {
    public String OFFICE = "office.txt";
    public String GOV = "government.txt";
    public String PALI = "pali.txt";
    public String SHAN = "shan.txt";

    public static String get(String file) throws IOException {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classloader.getResourceAsStream(file);
        StringBuffer buffer = new StringBuffer();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                buffer.append(line);
            }
        }
        return buffer.toString();
    }
}
