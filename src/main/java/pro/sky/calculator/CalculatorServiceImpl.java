package pro.sky.calculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String helloCalculator() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    public String plusCalculator(int num1, int num2) {
        return String.valueOf(num1 + num2);
    }

    public String minusCalculator(int num1, int num2) {
        return String.valueOf(num1 - num2);
    }

    public String multiplyCalculator(int num1, int num2) {
        return String.valueOf(num1 * num2);
    }

    public String divideCalculator(int num1, int num2) {
        return String.valueOf(num1 / num2);
    }

//    public String mistakeCalculator(int num1, int num2) {
//        if (num1 == Integer.parseInt(null) || num2 == Integer.parseInt((null)))
//            System.out.println("Данные введены не полностью");
//
//        return null;
        public String mistakeCalculator(@RequestParam(required = false) int num1,
                @RequestParam(required = false) int num2) {

        return "Данные введены не полностью";

    }
    }

