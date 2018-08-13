package com.example.arielle.wuxiaworld;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;

/**
 * Created by arielle on 8/13/2018.
 */

public class WWTextGetter {
    public static String getText(Document doc) {
        Elements paragraphs = doc.select("p");
        StringBuilder s = new StringBuilder();
        for(Element i: paragraphs){
            s.append('\n');
            s.append(i.text());
        }
        return s.toString();
    }
}
