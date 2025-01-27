package com.example.Adavipalem.Controller;

import com.example.Adavipalem.Model.Temple;
import com.example.Adavipalem.Service.VillageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("Adavipalem")
public class VillageController {
    @Autowired
    VillageService VS;
    @GetMapping("Home")
    public String villageDetails()
    {
//        Added a comment
        return "Home";
    }

    @GetMapping("Temple")
    public String TemplesADVP()
    {
        return "Temple";
    }

    @GetMapping("Festival")
    public String FestivalADVP()
    {
        return "Festivals";
    }
    @GetMapping("Crop")
    public String cropADVP()
    {
        return "Crop";
    }
    @GetMapping("People")
    public String peopleADVP()
    {
        return "People";
    }
    @GetMapping("View")
    public String ViewADVP()
    {
        return "View";
    }
    @GetMapping("House")
    public String houseADVP()
    {
        return "House";
    }

    @PostMapping("addTemple")
    public String Add_temple(@ModelAttribute("temple") Temple temple)
    {

        VS.Add_temple(temple);
        return "redirect:/Adavipalem/Temples";
    }

}
