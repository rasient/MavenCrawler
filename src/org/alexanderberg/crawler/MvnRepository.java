package org.alexanderberg.crawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element; 

import java.util.HashMap;
import java.util.Map;

public class MvnRepository {

    private static final String PAGE_URL_PREFIX = "http://mvnrepository.com/artifact/";
    private static final String VERSION_SELECTOR = "html body div[id*=page] div[id*=maincontent] div table[class*=grid versions] tbody tr td a[class*=vbtn release]";

    public static final Map<String,String> getVersionsForArtifacts(String[] artifacts) {
        Map<String,String> versionArtifactMap = new HashMap<String, String>();
        try {
            for (String artifact : artifacts) {
                Element element = Jsoup.connect(PAGE_URL_PREFIX + artifact).userAgent(Browser.MOZILLA).header(Browser.ACCEPT_LANGUAGE, Browser.LANGUAGE).get().select(VERSION_SELECTOR).first();
                System.out.println(artifact + " ===> " + element.html());
                versionArtifactMap.put(artifact, element.html());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return versionArtifactMap;
    }
}