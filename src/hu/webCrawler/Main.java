package hu.webCrawler;

public class Main {

    public static void main(String[] args) {
	    WebCrawler crawler = new WebCrawler();
        String rootURL = "https://github.com/attilaKimberger91?tab=repositories";
        crawler.crawl(rootURL, 100);
    }
}
