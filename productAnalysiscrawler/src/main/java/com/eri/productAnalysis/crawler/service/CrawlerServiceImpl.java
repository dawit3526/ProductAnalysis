package com.eri.productAnalysis.crawler.service;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Named;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

@Named
public class CrawlerServiceImpl implements CrawlerService {

    Logger logger = LoggerFactory.getLogger(CrawlerServiceImpl.class);
    private static final String USER_AGENT =
            "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/535.1 (KHTML, like Gecko) Chrome/13.0.782.112 Safari/535.1";
    private List<String> links = new LinkedList<>();
    private org.jsoup.nodes.Document htmlDocument;
    @Override
    public String  searchProduct(String product) {

        crawl("https://ae.pricena.com/en/");
        String bodyText = searchForWord(product);
        return bodyText;
    }

    public boolean crawl(String url)
    {
        try
        {
            Connection connection = Jsoup.connect(url).userAgent(USER_AGENT);
            Document htmlDocument = connection.get();
            this.htmlDocument = htmlDocument;
            if(connection.response().statusCode() == 200) // 200 is the HTTP OK status code
            // indicating that everything is great.
            {
                System.out.println("\n**Visiting** Received web page at " + url);
            }
            if(!connection.response().contentType().contains("text/html"))
            {
                System.out.println("**Failure** Retrieved something other than HTML");
                return false;
            }
            Elements linksOnPage = ((org.jsoup.nodes.Document) htmlDocument).select("a[href]");
            logger.info("Found (" + linksOnPage.size() + ") links");
            for(Element link : linksOnPage)
            {
                this.links.add(link.absUrl("href"));
            }
            return true;
        }
        catch(IOException ioe)
        {
            // We were not successful in our HTTP request
            return false;
        }
    }

    /**
     * Performs a search on the body of on the HTML document that is retrieved. This method should
     * only be called after a successful crawl.
     *
     * @param searchWord
     *            - The word or string to look for
     * @return whether or not the word was found
     */
    public String searchForWord(String searchWord)
    {
        // Defensive coding. This method should only be used after a successful crawl.
        if(this.htmlDocument == null)
        {
            System.out.println("ERROR! Call crawl() before performing analysis on the document");
            return null;
        }
        logger.info("Searching for the word " + searchWord + "...");
        String bodyText = this.htmlDocument.body().text();
        return bodyText;
    }


    public List<String> getLinks()
    {

        logger.info(String.valueOf(this.links));
        return this.links;
    }
}
