package com.example.ajaxex.controller;

import com.example.ajaxex.dto.AjaxDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AjaxController {

    @GetMapping("/ex01")
    public String ex01() {
        System.out.println("AjaxController.ex01");
        return "index"; // index.html 에 작성된 내용이 출력됨
    }

    @PostMapping("/ex02")
    public @ResponseBody String ex02() {
        System.out.println("AjaxController.ex02");
        return "안녕하세요"; // 리턴값이 그대로 출력됨
    }

    @GetMapping("/ex03")
    public @ResponseBody String ex03(@RequestParam("param1") String param1,
                                     @RequestParam("param2") String param2) {
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
        return "ex03 메서드 호출 완료";
    }

    @PostMapping("/ex04")
    public @ResponseBody String ex04(@RequestParam("param1") String param1,
                                     @RequestParam("param2") String param2) {
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
        return "ex04 메서드 호출 완료";
    }

    @GetMapping("/ex05")
    public @ResponseBody String ex05(@ModelAttribute AjaxDTO ajaxDTO) {
        System.out.println("ajecDTO = " + ajaxDTO);
        return "ex05 메서드 호출 완료";

    }
}
