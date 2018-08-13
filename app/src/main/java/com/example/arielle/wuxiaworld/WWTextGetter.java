package com.example.arielle.wuxiaworld;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;

/**
 * Created by arielle on 8/13/2018.
 */

public class WWTextGetter {
    public static String getText(Document doc) {
        return doc.body().text();
    }
}
