package com.kong.useJsoup.model;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class parseBookDetial {

    private String bookId;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public Document bookTitle() throws IOException {
        Document doc = Jsoup.connect("https://www.biquge5200.cc/"+bookId).get();
        return doc;
    }
}
