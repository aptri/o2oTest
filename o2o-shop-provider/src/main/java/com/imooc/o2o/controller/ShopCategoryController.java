package com.imooc.o2o.controller;

import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.entity.ShopCategory;
import com.imooc.o2o.service.ShopCategoryService;
import com.imooc.o2o.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shopCategory")
public class ShopCategoryController {
    @Autowired
    private ShopCategoryService shopCategoryService;

    @GetMapping("/queryShopCategory")
    public List<ShopCategory> queryShopCategory() {
        List<ShopCategory> categoryList = shopCategoryService.queryShopCategory();
        return categoryList;
    }
}
