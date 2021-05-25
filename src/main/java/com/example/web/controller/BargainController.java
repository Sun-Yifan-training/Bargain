package com.example.web.controller;
import java.util.Calendar;
import com.example.persistence.entity.Bargain;
import com.example.service.BargainService;
import com.example.web.form.BargainForm;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.PipedOutputStream;
import java.time.DayOfWeek;
import java.util.List;
@Controller
@RequestMapping("/all")

public class BargainController {
    private final BargainService bargainService;

    public BargainController(BargainService bargainService){
        this.bargainService = bargainService;
    }

    @GetMapping("/index")
    public String index(Model model){
        List<Bargain> bargainList= bargainService.findAll();
        model.addAttribute("bargainList", bargainList);
        return ("all/index");
    }
    @GetMapping("/findByNameLike")
    public String findByNameLike(@RequestParam String keyword, Model model) {
        List<Bargain> bargainList = bargainService.findByNameLike(keyword);
        model.addAttribute("bargainList", bargainList);
        return "all/index";
    }

    @GetMapping("/findByCategory")
    public String findByCategory(@RequestParam int keyword, Model model) {
        System.out.println(keyword);
        List<Bargain> bargainList = bargainService.findByCategory(keyword);
        model.addAttribute("bargainList", bargainList);
        return "all/index";

    }

    @GetMapping("/findDate")
    public String findDate(Model model){
        //int day = Calendar.get(Calendar.DAY_OF_WEEK) ;
        return "all/index";
    }

    @GetMapping("/insertMain")
    public String insertMain() {
        return "all/insertMain";
    }

    @PostMapping("/insertComplete")
    public String insertComplete(BargainForm bargainForm) {
        Bargain bargain = bargainForm.convertToEntity();
        bargainService.insert(bargain);

        return "redirect:index";
    }
}
