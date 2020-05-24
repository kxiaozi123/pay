package com.imooc.pay.service.impl;

import com.imooc.pay.PayApplicationTests;
import com.lly835.bestpay.enums.BestPayTypeEnum;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PayServiceTest extends PayApplicationTests {
    @Autowired
    private PayService payService;
    @Test
    public void create() {
        System.out.println(payService.create("" + System.currentTimeMillis(),
                BigDecimal.valueOf(0.01),
                BestPayTypeEnum.WXPAY_NATIVE));
    }
}