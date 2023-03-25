package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CalculatorController {


    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String helloCalculator() {
        return calculatorService.helloCalculator();
    }

    @GetMapping(path = "/plus")
    public String plusCalculator(@RequestParam(required = false) Integer num1,
                                 @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null)
            return "Данные введены не полностью";
        else
            return num1 + " + " + num2 + " = " + calculatorService.plusCalculator(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minusCalculator(@RequestParam(required = false) Integer num1,
                                  @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null)
            return "Данные введены не полностью";
        else
            return num1 + " - " + num2 + " = " + calculatorService.minusCalculator(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiplyCalculator(@RequestParam(required = false) Integer num1,
                                     @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null)
            return "Данные введены не полностью";
        else
            return num1 + " * " + num2 + " = " + calculatorService.multiplyCalculator(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String dividelCalculator(@RequestParam(required = false) Integer num1,
                                     @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null)
            return "Данные введены не полностью";
        else if (num2 != 0)
            return num1 + " / " + num2 + " = " + calculatorService.divideCalculator(num1, num2);
        else
            return "Делить на 0 нельзя";
    }

}
