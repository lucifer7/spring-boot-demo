package com.yang.vo;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Jingyi.Yang
 * Date: 2016/8/10
 **/
public class BudgetDto {
    private List<Budget> budget;

    public BudgetDto() {
    }

    public List<Budget> getBudget() {
        return budget;
    }

    public void setBudget(List<Budget> budget) {
        this.budget = budget;
    }

    private class Budget {
        private BidAmount account_daily;
        private BidAmount maximum_bid;

        public Budget() {
        }

        public BidAmount getAccount_daily() {
            return account_daily;
        }

        public void setAccount_daily(BidAmount account_daily) {
            this.account_daily = account_daily;
        }

        public BidAmount getMaximum_bid() {
            return maximum_bid;
        }

        public void setMaximum_bid(BidAmount maximum_bid) {
            this.maximum_bid = maximum_bid;
        }
    }

    private class BidAmount {
        private BigDecimal amount;
        private String currency;

        public BidAmount() {
        }

        public BigDecimal getAmount() {
            return amount;
        }

        public void setAmount(BigDecimal amount) {
            this.amount = amount;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }
    }

}
