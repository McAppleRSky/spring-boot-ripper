package com.ironbank.moneyraven.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class NameBasedProphetService implements ProphetService{
    @Override
    public boolean willSurvive(String name){
        return !name.contains("stark") && ThreadLocalRandom.current().nextBoolean();
    }
}
