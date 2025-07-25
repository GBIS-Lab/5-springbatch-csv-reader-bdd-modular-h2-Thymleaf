package com.smartphonebatch.processor;

import com.smartphonebatch.model.Smartphone;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class SmartphoneItemProcessor implements ItemProcessor<Smartphone, Smartphone> {

    @Override
    public Smartphone process(Smartphone smartphone) {
        if (smartphone.getAnneeSortie() < 2023) {
            smartphone.setPrix(smartphone.getPrix() * 0.9);
        }
        return smartphone;
    }
}