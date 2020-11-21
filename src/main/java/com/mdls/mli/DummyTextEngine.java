package com.mdls.mli;

/**
 * Myanmar Lorem Ipsum Dummy Text Generator
 * 
 * @author Zayar Shin Thant
 * @see com.mdls.mli.DummyTextEngine.class
 * @since 1.0
 * 
 */
public class DummyTextEngine {

    private static DummyTextEngine dummyTextEngine;

    private DummyTextEngine() {
    }

    public static DummyTextEngine getInstance() {
        if (dummyTextEngine == null)
            dummyTextEngine = new DummyTextEngine();
        return dummyTextEngine;
    }

    private Integer randomInt(Integer min, Integer max) {
        Double random = Math.random() * (max - min) + min;
        return random.intValue();
    }

    public String randomLetter(String[] word) {
        int index = randomInt(0, word.length);
        return word[index];
    }

    public StringBuffer dumWord(String[] letters) {
        StringBuffer dumWord = new StringBuffer();
        int i = 0, len = randomInt(2, 6);
        while (i < len) {
            dumWord.append(randomLetter(letters));
            i++;
        }
        return dumWord;
    }

    public StringBuffer dumSentence(String[] letters) {
        StringBuffer sentence = new StringBuffer(dumWord(letters));
        int i = 0, len = randomInt(3, 9);
        while (i < len) {
            sentence.append(" ").append(dumWord(letters));
            i++;
        }
        sentence.append("။");
        return sentence;
    }

    public StringBuffer dumParagraph(String[] letter) {
        StringBuffer paragraph = dumSentence(letter);
        int i = 0, len = randomInt(7, 9);
        while (i < len) {
            paragraph.append(" ").append(dumSentence(letter));
            i++;
        }
        return paragraph;
    }

    public StringBuffer createDummyText(String[] letter, int count){
        StringBuffer dummyText = new StringBuffer().append(dumParagraph(letter)).append("\n\n");
        while (count != 0){
            dummyText.append(dumParagraph(letter)).append("\n\n");
            count--;
        }
        return dummyText;
    }

}
