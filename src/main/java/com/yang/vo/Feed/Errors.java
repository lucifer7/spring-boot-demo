package com.yang.vo.Feed;

/**
 * Created with IntelliJ IDEA.
 * User: Jingyi.Yang
 * Date: 2016/8/11
 **/
public class Errors {
    private String code;

    private String issue_type;

    private String byte_index;

    private String message;

    public void setCode(String code){
        this.code = code;
    }
    public String getCode(){
        return this.code;
    }
    public void setIssue_type(String issue_type){
        this.issue_type = issue_type;
    }
    public String getIssue_type(){
        return this.issue_type;
    }
    public void setByte_index(String byte_index){
        this.byte_index = byte_index;
    }
    public String getByte_index(){
        return this.byte_index;
    }
    public void setMessage(String message){
        this.message = message;
    }
    public String getMessage(){
        return this.message;
    }
}
