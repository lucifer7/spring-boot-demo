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

    public class Budget {
        private BidAmount accountDaily;
        private BidAmount maximumBid;

        public Budget() {
        }

        public BidAmount getAccountDaily() {
            return accountDaily;
        }

        public void setAccountDaily(BidAmount accountDaily) {
            this.accountDaily = accountDaily;
        }

        public BidAmount getMaximumBid() {
            return maximumBid;
        }

        public void setMaximumBid(BidAmount maximumBid) {
            this.maximumBid = maximumBid;
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

    @Override
    public String toString() {
        return "BudgetDto{" +
                "budget=" + budget +
                '}';
    }
}
