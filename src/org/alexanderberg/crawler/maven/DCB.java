package org.alexanderberg.crawler.maven;

import org.alexanderberg.crawler.MvnRepository;

public class DCB extends AbstractProject {

    static {
        PAGE_SUFFIXES = new String[]{
            "org.apache.maven.plugins/maven-war-plugin",
            "org.apache.maven.plugins/maven-compiler-plugin",
            "org.springframework/spring-core",
            "org.springframework/spring-context",
            "org.springframework/spring-tx",
            "org.springframework/spring-web",
            "org.springframework/spring-webmvc",
            "org.springframework/spring-beans",
            "org.springframework/spring-jdbc",
            "org.springframework/spring-orm",
            "log4j/log4j",
            "org.hibernate/hibernate-entitymanager",
            "org.hibernate/hibernate-core",
            "org.hibernate/hibernate-validator",
            "junit/junit",
            "jstl/jstl",
            "javax.validation/validation-api",
            "mysql/mysql-connector-java",
            "commons-dbcp/commons-dbcp",
            "fr.opensagres.xdocreport/org.springframework.web.servlet.view.xdocreport",
            "javax.servlet/javax.servlet-api",
            "javax.servlet/jsp-api",
            "org.apache.httpcomponents/httpclient",
            "com.googlecode.json-simple/json-simple",
            "com.fasterxml.jackson.core/jackson-databind",
            "opensymphony/sitemesh",
            "com.google.code.gson/gson"
        };
    }
    
    //needed for eclipse
    public static void main(String[] args) {
        MvnRepository.getVersionsForArtifacts(PAGE_SUFFIXES);
    }
}