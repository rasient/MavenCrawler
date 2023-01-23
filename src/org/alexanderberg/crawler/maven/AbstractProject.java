package org.alexanderberg.crawler.maven;

import org.alexanderberg.crawler.MvnRepository;

public abstract class AbstractProject {

    public static String[] PAGE_SUFFIXES = null;
    public static void main(String[] args) {
        MvnRepository.getVersionsForArtifacts(PAGE_SUFFIXES);
    }
}