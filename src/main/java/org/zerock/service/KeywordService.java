package org.zerock.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class KeywordService {

    private static KeywordService ourInstance = new KeywordService();

    public static KeywordService getInstance() {
        return ourInstance;
    }

    private KeywordService() {
    }
    public List<String> find() throws Exception{

        List<String> result = new ArrayList<String>();

        String path ="https://datalab.naver.com/keyword/realtimeList.naver?where=main";
        Document doc = Jsoup.connect(path).get();
        System.out.println(doc);

        Elements els = doc.select(".list");
        System.out.println(els);

        //강사님 코드
        int idx = 0 ;
        for(Element el: els){
            Element span = el.select("span").first();

            String text = span.ownText();

            //trim은 공백을 없애는 기능이다.
            if(text.trim().length()==0){
                continue;
            }

            result.add(span.ownText());

            //몇 개만 가져와보죠
            if(idx==19){
                break;
            }
            idx++;
        }
        //학생 코드
        Elements labels = els.select("span.title");//span탭에 class가 title인 것만 추출한다.

        ArrayList<String> arr = new ArrayList<String>();

        for(Element element:labels){
            //System.out.println(element.ownText());
            arr.add(element.ownText());
        }
        //System.out.println(arr);

        return result;
    }

    public static void main(String[] args) throws Exception{
        List<String> list = KeywordService.getInstance().find();

        System.out.println(list);
    }

}
