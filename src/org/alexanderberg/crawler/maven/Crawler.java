package org.alexanderberg.crawler.maven;

import org.alexanderberg.crawler.MvnRepository;

public class Crawler extends AbstractProject {
	
	static {
        PAGE_SUFFIXES = new String[]{
        		"org.jsoup/jsoup",
        		"com.google.guava/guava",
        		"net.sf.trove4j/trove4j",
        		"mysql/mysql-connector-java"
        };
	}
	
	//needed for eclipse
	public static void main(String args[]) {
        MvnRepository.getVersionsForArtifacts(PAGE_SUFFIXES);
    }
}