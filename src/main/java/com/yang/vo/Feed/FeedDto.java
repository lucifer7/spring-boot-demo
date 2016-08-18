package com.yang.vo.Feed;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Jingyi.Yang
 * Date: 2016/8/11
 **/
public class FeedDto {
    private String kind;

    private List<Results> results ;

    public void setKind(String kind){
        this.kind = kind;
    }
    public String getKind(){
        return this.kind;
    }
    public void setResults(List<Results> results){
        this.results = results;
    }
    public List<Results> getResults(){
        return this.results;
    }

}
