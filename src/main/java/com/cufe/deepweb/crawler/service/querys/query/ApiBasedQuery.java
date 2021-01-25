package com.cufe.deepweb.crawler.service.querys.query;
//  继承query  实现api的四个参数
public class ApiBasedQuery extends Query {
    private String url;
    private String inputXpath;
    private String submitXpath;
    private String keyword;
    ApiBasedQuery(String url, String inputXpath, String submitXpath, String keyword) {
        this.url = url;
        this.inputXpath = inputXpath;
        this.submitXpath =submitXpath;
        this.keyword = keyword;
    }

    public String getUrl() {
        return url;
    }

    public String getInputXpath() {
        return inputXpath;
    }

    public String getKeyword() {
        return keyword;
    }

    public String getSubmitXpath() {
        return submitXpath;
    }
}
