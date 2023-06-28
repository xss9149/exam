package com.example.exam.controller;

import org.springframework.web.bind.annotation.*;


@RestController

public class FactorialController {

    int sum = 0;

    @RequestMapping("/api/factorial")
    public int calculateFactorialValue(@RequestParam int number) {
        if (number == 0 || number == 1) {
            return 1;
        }

        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        sum += factorial;

        return factorial;
    }

    @RequestMapping("/api/factorial/total")
    public int caculateSum() {
        return sum;

    }


}

