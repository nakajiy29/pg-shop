package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopController {
    @GetMapping("/huga")
    public String huga(Model model) {
        model.addAttribute("message", "Hello Springboot");
        return "image";
    }

    /**
     * HOME
     * @param model
     * @return
     */
    @GetMapping("/index")
    public String index(Model model) {
        return "index";
    }

    /**
     * ABOUT
     * @param model
     * @return
     */
    @GetMapping("/about")
    public String about(Model model) {
        return "about";
    }

    /**
     * SHOPPING
     * @param model
     * @return
     */
    @GetMapping("/shopping")
    public String shopping(Model model) {
        return "shopping";
    }

    /**
     * FAQ
     * @param model
     * @return
     */
    @GetMapping("/faq")
    public String faq(Model model) {
        return "faq";
    }

    /**
     * CONTACT
     * @param model
     * @return
     */
    @GetMapping("/contact")
    public String contact(Model model) {
        return "contact";
    }
    /**
     * お問い合わせフォームの確認画面
     * @param model
     * @return
     */
    @GetMapping("/confirm")
    public String confirm(Model model) {
        return "confirm";
    }

    /**
     * お問い合わせフォームの完了画面
     * @param model
     * @return
     */
    @GetMapping("/finish")
    public String finish(Model model) {
        return "finish";
    }

    /**
     * 会社概要
     * @param model
     * @return
     */
    @GetMapping("/company")
    public String company(Model model) {
        return "company";
    }

    /**
     * 商品ページ
     * @param model
     * @return
     */
    @GetMapping("/item")
    public String item(Model model) {
        return "item";
    }

    /**
     * 商品ページ
     * @param model
     * @return
     */
    @GetMapping("/link")
    public String link(Model model) {
        return "link";
    }

    /**
     * 商品一覧
     * @param model
     * @return
     */
    @GetMapping("/shopping2")
    public String shopping2(Model model) {
        return "shopping2";
    }
}