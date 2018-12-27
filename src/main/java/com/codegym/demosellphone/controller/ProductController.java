package com.codegym.demosellphone.controller;

import com.codegym.demosellphone.model.Product;
import com.codegym.demosellphone.service.ProductService;
import com.codegym.demosellphone.storage.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Calendar;


@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    private final StorageService storageService;

    public ProductController(StorageService storageService) {
        this.storageService = storageService;
    }


    @GetMapping("/create")
    public ModelAndView createForm() {
        ModelAndView modelAndView = new ModelAndView("product/create");
        modelAndView.addObject("product", new Product());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView create(@ModelAttribute("product") Product product, @RequestParam("file") MultipartFile file) {
        if (!file.isEmpty()) {
            String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
            product.setImage(timeStamp + file.getOriginalFilename());
            storageService.store(file);
        }
        productService.save(product);
        ModelAndView modelAndView = new ModelAndView("product/create");
        modelAndView.addObject("product", product);
        return modelAndView;
    }






}