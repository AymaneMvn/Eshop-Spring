package com.lus.dawm.controller;

import com.lus.dawm.model.Produit;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.lus.dawm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("")
    public String listProducts(Model model) {
        model.addAttribute("products", productService.findAll());
        return "admin/product/lister";
    }
    @GetMapping("/new")
    public String showNewProductForm(Model model) {
        model.addAttribute("product", new Produit());
        return "/admin/product/create";
    }

    @PostMapping("/save")
    public String saveProduct(Produit product) {
        productService.save(product);
        return "redirect:/products";
    }
}
