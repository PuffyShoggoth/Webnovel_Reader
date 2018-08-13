package com.example.arielle.wuxiaworld;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * Created by arielle on 8/13/2018.
 */

public class WWTextGetter {
    public static String getText(String link) {
        try {
            Document doc = Jsoup.connect(link).get();
            return doc.title();
        }
        catch(IOException e){
            return "poop";
        }

    }
}
