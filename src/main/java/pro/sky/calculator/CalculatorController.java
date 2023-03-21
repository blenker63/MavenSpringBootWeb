package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping
    public String helloCalculator() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    @GetMapping(path = "/plus")
    public String plusCalculator(@RequestParam int num1,
                                 @RequestParam int num2) {
            return  num1 + " + " + num2 + " = " +  (num1 + num2);
        }
    }
