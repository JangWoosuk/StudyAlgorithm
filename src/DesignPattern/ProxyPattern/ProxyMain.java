package DesignPattern.ProxyPattern;

import java.util.ArrayList;
import java.util.List;

public class ProxyMain {
    public static void main(String[] args) throws InterruptedException {
        List<Thumbnail> thumbnailList = new ArrayList<>();

        thumbnailList.add(new ProxyThumbname("title 1 " , "./movie1"));
        thumbnailList.add(new ProxyThumbname("title 2 " , "./movie2"));

        for(Thumbnail thumb : thumbnailList){
            thumb.showTitle();
        }
        for(Thumbnail thumb : thumbnailList){
            thumb.showPreview();
            Thread.sleep(1000);
        }
        //스펙타클
    }
}
