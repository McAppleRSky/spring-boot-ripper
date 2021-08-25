package com.ironbank.moneyraven.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

public interface TransferMoneyService {

    long transfer(String addresseeName, long amount);

}
