package com.mycompany;
import java.io.IOException;
import org.jsoup.Jsoup;  
import org.jsoup.nodes.Document;  


public class Hotel {
    public static void main(String[] args) throws IOException {
    	int page;	  	
    	for (page = 1; page < 141; page++) {
    		String url = "https://www.taiwan.net.tw/m1.aspx?sNo=0000148&lid=53&page="+page;
    		Document doc = Jsoup.connect(url).get();
    		for (org.jsoup.nodes.Element e: doc.select("ul")) {
    			System.out.println(e.attr("abs:href"));
    			System.out.println(e.text());
    			System.out.println();
    		} 
    		System.out.println(page);
    	}
	
    }
}