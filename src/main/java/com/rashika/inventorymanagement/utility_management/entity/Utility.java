package com.rashika.inventorymanagement.utility_management.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Utility {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String utility_type;
    private String utility_pay_date;
    private double utility_amount;
    private boolean utility_paid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUtility_type() {
        return utility_type;
    }

    public void setUtility_type(String utility_type) {
        this.utility_type = utility_type;
    }

    public String getUtility_pay_date() {
        return utility_pay_date;
    }

    public void setUtility_pay_date(String utility_pay_date) {
        this.utility_pay_date = utility_pay_date;
    }

    public double getUtility_amount() {
        return utility_amount;
    }

    public void setUtility_amount(double utility_amount) {
        this.utility_amount = utility_amount;
    }

    public boolean isUtility_paid() {
        return utility_paid;
    }

    public void setUtility_paid(boolean utility_paid) {
        this.utility_paid = utility_paid;
    }

    public Utility(Long id, String utility_type, String utility_pay_date, double utility_amount, boolean utility_paid) {
        this.id = id;
        this.utility_type = utility_type;
        this.utility_pay_date = utility_pay_date;
        this.utility_amount = utility_amount;
        this.utility_paid = utility_paid;
    }

    public Utility() {
    }

    @Override
    public String toString() {
        return "Utility{" +
                "id=" + id +
                ", utility_type='" + utility_type + '\'' +
                ", utility_pay_date='" + utility_pay_date + '\'' +
                ", utility_amount=" + utility_amount +
                ", utility_paid=" + utility_paid +
                '}';
    }
}
