package com.yang.controller;

import com.google.gson.Gson;
import com.yang.vo.budget.BudgetDto;
import lombok.extern.log4j.Log4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: Jingyi.Yang
 * Date: 2016/8/11
 **/
@RestController
@RequestMapping("/google-api")
@Log4j
public class GoogleApiMockController {
    @RequestMapping(value = "/{accountId}/budgets", method = RequestMethod.GET)
    public BudgetDto getBudgets(@PathVariable String accountId) {
        log.info(" Fetching00 budget from api for account: " + accountId);
        Gson gson = new Gson();
        BudgetDto budgets = gson.fromJson("{\n" +
                "    \"budget\": [\n" +
                "        {\n" +
                "            \"account_daily\": {\n" +
                "                \"amount\": 10.22,\n" +
                "                \"currency\": \"<3_letter_currency_code>\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"maximum_bid\": {\n" +
                "                \"amount\": 2,\n" +
                "                \"currency\": \"<3_letter_currency_code>\"\n" +
                "            }\n" +
                "        }\n" +
                "    ]\n" +
                "}", BudgetDto.class);
        return budgets;
    }
/*
    @RequestMapping(value = "/{accountId}/budgets/update", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String updateBudget(@PathVariable String accountId, Budget budget) {
        log.info(" Updating budget from api for account: " + accountId);
        log.info(" New data is : " + budget.toString());
        return "";
    }*/
}
