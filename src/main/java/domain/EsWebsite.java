package com.vodafone.dxltr.websearching.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.*;

@Document(indexName = "indexname", type = "typename", shards = 1, replicas = 0, refreshInterval = "-1")
@Setting(settingPath = "/settings.json")
public class EsWebsite {

    @Id
    private String link;

    @Field(type = FieldType.String, searchAnalyzer = "turkish", analyzer = "turkish")
    private String content;

    @Field(type = FieldType.String, index = FieldIndex.not_analyzed)
    private String area;

    @Field(type = FieldType.String, searchAnalyzer = "turkish", analyzer = "turkish")
    private String title;


    public EsWebsite() {

    }

    public EsWebsite(String link, String content, String area, String title) {
        this.link = link;
        this.content = content;
        this.area = area;
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return "EsWebsite [link=" + link + ", content=" + content + ", area=" + area + ", title=" + title
                + ", suggestion=" + "" + "]";
    }

}