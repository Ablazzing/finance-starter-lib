package com.javaacademy.finance_app;

import com.javaacademy.finance_starter.FinanceService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
public class FinanceServiceTest {
    @Autowired
    private FinanceService financeService;

    @Test
    public void successPay() {
        assertDoesNotThrow(() -> financeService.takePayment(BigDecimal.TEN, "Любой текст"));
    }
}
