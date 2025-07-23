package com.smartphonebatch.controller;

import com.smartphonebatch.model.Smartphone;
import com.smartphonebatch.repository.SmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SmartphoneController {

    @Autowired
    private SmartphoneRepository smartphoneRepository;

    @GetMapping("/smartphones")
    public String listSmartphones(Model model) {
        List<Smartphone> smartphones = smartphoneRepository.findAll();
        model.addAttribute("smartphones", smartphones);
        return "smartphones"; // Le nom de la page HTML (smartphones.html)
    }
}