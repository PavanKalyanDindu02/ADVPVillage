package com.example.Adavipalem.Service;

import com.example.Adavipalem.Repo.VillageRepo;
import com.example.Adavipalem.Model.Temple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VillageService {

    @Autowired
    VillageRepo VR;

    public void Add_temple(Temple temple) {
        VR.save(temple);
//        Added comment

    }

    public List<Temple> getTempleDetails() {

        List<Temple> temple = VR.findAll();
        return temple;
    }
}
