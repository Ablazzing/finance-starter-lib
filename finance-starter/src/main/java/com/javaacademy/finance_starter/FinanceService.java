package com.javaacademy.finance_starter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Slf4j
public class FinanceService {

    public void takePayment(BigDecimal paymentAmount, String description) {
        log.info("{} {}", paymentAmount, description);
    }
}
