package com.yang.controller;

import com.yang.vo.BudgetDto;
import lombok.extern.log4j.Log4j;
import org.springframework.http.MediaType;
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
    public BudgetDto getBudget(@PathVariable String accountId) {
        log.info(" Fetching budget from api for account: " + accountId);
        BudgetDto budgetDto = new BudgetDto();
        return budgetDto;
    }

    @RequestMapping(value = "/{accountId}/budgets/update", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String updateBudget(@PathVariable String accountId, BudgetDto budgetDto) {
        log.info(" Updating budget from api for account: " + accountId);
        log.info(" New data is : " + budgetDto.toString());
        return "";
    }
}
