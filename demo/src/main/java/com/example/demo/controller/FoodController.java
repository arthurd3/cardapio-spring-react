package com.example.demo.controller;


import com.example.demo.model.Food;
import com.example.demo.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;


    @GetMapping
    public String getAll(){
        List<Food> foodList = foodRepository.findAll();
        if(foodList.isEmpty()){
            return "Lista vazia";
        }
        else return "Lista com sucesso";
    }

}
