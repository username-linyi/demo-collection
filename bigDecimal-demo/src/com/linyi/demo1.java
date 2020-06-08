package com.linyi;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 * 利用BigDecimal对货币和百分比格式化
 *
 * @author linyi
 * @date 2020 06 08 09:16
 */
public class demo1 {
    public static void main(String[] args) {
        //建立货币格式化引用
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        //建立百分比格式化引用
        NumberFormat percent = NumberFormat.getPercentInstance();
        //百分比小数点最多3位
        percent.setMaximumFractionDigits(3);
        //贷款金额
        BigDecimal loanAmount = new BigDecimal("15000.48");
        //利率
        BigDecimal interestRate = new BigDecimal("0.008");
        //相乘
        BigDecimal interest = loanAmount.subtract(interestRate);

        System.out.println("贷款金额: " + currency.format(loanAmount));
        System.out.println("利率:\t " + percent.format(interestRate));
        System.out.println("利息:\t " + currency.format(interest));
    }
}
