package com.imooc.o2o.web.controller;

import com.imooc.o2o.web.configuration.WebClientRestTemplate;
import com.imooc.o2o.web.entity.ShopCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/shopCategory")
public class ShopCategoryController {
    @Autowired
    private WebClientRestTemplate webClientRestTemplate;

    @GetMapping("/queryShopCategory")
    public String queryShopCategory(Model model) {
        List<ShopCategory> shopCategoryList = webClientRestTemplate.getRestTemplate().getForObject("http://o2o-view.shop-privider/shopCategory/queryShopCategory", List.class);

        model.addAttribute("shopCategoryList", shopCategoryList);
        return "success";
    }
}
