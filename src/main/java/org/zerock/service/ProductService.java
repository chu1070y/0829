package org.zerock.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class ProductService {

    private static ProductService ourInstance = new ProductService();

    public static ProductService getInstance() {
        return ourInstance;
    }

    private ProductService() {
    }

    public String getProductById(String id) throws IOException {
        File input = new File("C:\\zzz\\products.html");
        Document doc = Jsoup.parse(input, "UTF-8", "http://example.com/");
        //System.out.println(doc);

        Element el = doc.select("#" + id).first();
        System.out.println(el);

        Elements labels = el.select("label");
        //System.out.println(labels);

        for (Element element : labels) {
            //System.out.println(element.ownText());
        }

        return "";
    }

    public static void main(String[] args) throws Exception{
        ProductService obj = ProductService.getInstance();
        obj.getProductById("p1");
    }

}
