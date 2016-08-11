package com.yang.vo.Feed;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Jingyi.Yang
 * Date: 2016/8/11
 **/
public class Results {
    private String partner;

    private String timestamp;

    private String partner_timestamp;

    private String partner_id;

    private String feed_type;

    private boolean file_pulled;

    private String status;

    private int error_count;

    private int success_count;

    private List<Errors> errors ;

    public void setPartner(String partner){
        this.partner = partner;
    }
    public String getPartner(){
        return this.partner;
    }
    public void setTimestamp(String timestamp){
        this.timestamp = timestamp;
    }
    public String getTimestamp(){
        return this.timestamp;
    }
    public void setPartner_timestamp(String partner_timestamp){
        this.partner_timestamp = partner_timestamp;
    }
    public String getPartner_timestamp(){
        return this.partner_timestamp;
    }
    public void setPartner_id(String partner_id){
        this.partner_id = partner_id;
    }
    public String getPartner_id(){
        return this.partner_id;
    }
    public void setFeed_type(String feed_type){
        this.feed_type = feed_type;
    }
    public String getFeed_type(){
        return this.feed_type;
    }
    public void setFile_pulled(boolean file_pulled){
        this.file_pulled = file_pulled;
    }
    public boolean getFile_pulled(){
        return this.file_pulled;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return this.status;
    }
    public void setError_count(int error_count){
        this.error_count = error_count;
    }
    public int getError_count(){
        return this.error_count;
    }
    public void setSuccess_count(int success_count){
        this.success_count = success_count;
    }
    public int getSuccess_count(){
        return this.success_count;
    }
    public void setErrors(List<Errors> errors){
        this.errors = errors;
    }
    public List<Errors> getErrors(){
        return this.errors;
    }


}
