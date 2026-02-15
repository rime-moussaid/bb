package com.veloura.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VelouraController {

    @GetMapping("/")
    public String home(Model model) {
        // Ajout d'attributs pour la page si nécessaire
        model.addAttribute("pageTitle", "VELOURA - Café Premium");
        return "index";
    }
}
