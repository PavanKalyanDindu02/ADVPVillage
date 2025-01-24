package com.example.Adavipalem.Controller;

import com.example.Adavipalem.Model.Temple;
import com.example.Adavipalem.Service.VillageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Adavipalem")
public class VillageController {
    @Autowired
    VillageService VS;
    @GetMapping("Home")
    public String villageDetails()
    {
        return "Temple";
    }

    @GetMapping("Temples")
    public String TemplesADVP()
    {
        return "Temples.html";
    }

    @GetMapping("addTemple")
    public void Add_temple()
    {
        Temple temple = new Temple(1001, "Ramalayam", "9912237871", "Ramulavarivewedhi, Advaipalem", "The temple is constructed in 2005 and the main god in this Sri ramudu and Seethamatha");
        VS.Add_temple(temple);

    }



}
