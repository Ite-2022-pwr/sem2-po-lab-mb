package org.example;
import org.jsoup.jsoup.*;



public class StringHtmlCleaner {
    public static String main(String textParam) {
        String textToClean = textParam;
        Document document = Jsoup.parse(textToClean);
        String textWithoutHtml = document.text();
        return textWithoutHtml;
    }
}