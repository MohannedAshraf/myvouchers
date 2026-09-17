package com.myvouchers.myvouchers.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Voucher {
    

    @Id 
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private  long  id;
    private String code;
    private BigDecimal discount;
    private String expireDate; 

    public String getCode (){
        return code;
    }
    public void setCode(String code){
        this.code =code;
    }

    public BigDecimal getDiscount (){
        return discount;
    }
    public void setDiscount(BigDecimal discount){
        this.discount = discount;
    }

    public String getExpireDate(){
        return expireDate;
    }
    public void getExpireDate(String expireDate){
        this.expireDate = expireDate;
    }
}
