package pro.sky.calculator;

import org.springframework.stereotype.Service;

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

    public String divideCalculator(double num1, double num2) {
        return String.valueOf(num1 / num2);
    }
}


