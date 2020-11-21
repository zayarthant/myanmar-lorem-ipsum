package com.mdls.mli;

/**
 * Myanmar Lorem Ipsum Dummy Text Generator
 * 
 * @author Zayar Shin Thant
 * @see com.mdls.mli.DummyText.class
 * @since 1.0
 * 
 */
public class DummyText {

    private DummyTextEngine dummyTextEngine;
    private SyllableSegmentation syllableSegmentation;

    public DummyText() {
        this.dummyTextEngine = DummyTextEngine.getInstance();
        this.syllableSegmentation = new SyllableSegmentation();
    }

    public DummyText(DummyTextEngine dummyTextEngine) {
        this.dummyTextEngine = dummyTextEngine;
    }

    public String generate(String rawString, int count){
        rawString = rawString.replaceAll("[။၊ \s]", "");
        rawString = syllableSegmentation.segment(rawString, ",");
        final String[] letter = rawString.split(",");
        return dummyTextEngine.createDummyText(letter, count).toString();
    }

    
}
