package com.kong.useJsoup.model;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.List;

public class search {
    private String url;
    private String name;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getSearch() throws IOException {
        String trueUrl = url+name;
        //获取整个 网页文档
        Document doc = Jsoup.connect(trueUrl).get();
        //System.out.print(doc);
        List book = doc.getElementsByTag("tr");
        return book;

    }
}

