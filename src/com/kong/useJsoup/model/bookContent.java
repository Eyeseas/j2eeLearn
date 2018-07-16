package com.kong.useJsoup.model;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class bookContent {
    private String chapterId;

    public String getChapterId() {
        return chapterId;
    }

    public void setChapterId(String chapterId) {
        this.chapterId = chapterId;
    }

    public Document getConnet() throws IOException {
        return Jsoup.connect("https://www.biquge5200.cc/"+chapterId+".html").get();
    }

    public String getTitle() throws IOException {
        Document doc = getConnet();

        String title = doc.head().getElementsByTag("title").get(0).html();
        String clearTitle = title.substring(0,title.length()-4);

        return clearTitle;
    }

    public String getChapterTitle() throws IOException {
        Document doc = getConnet();
        String chapterTitle = doc.select("div.bookname h1").html();
        return chapterTitle;
    }

    public String getContent() throws IOException{
        Document doc = getConnet();

        String content = doc.select("#content").html();
        return content;
    }

}
