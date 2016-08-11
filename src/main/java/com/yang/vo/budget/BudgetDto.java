package com.yang.vo.budget;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Jingyi.Yang
 * Date: 2016/8/11
 **/
public class BudgetDto {

    //private List<Budget> budget ;
    private List<Map<String, BidAmount>> budget ;

    public List<Map<String, BidAmount>> getBudget() {
        return budget;
    }

    public void setBudget(List<Map<String, BidAmount>> budget) {
        this.budget = budget;
    }
}
