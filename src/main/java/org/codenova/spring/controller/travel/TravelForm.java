package org.codenova.spring.controller.travel;


import org.codenova.spring.model.TravelPlan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/travel")
public class TravelForm {

    @RequestMapping("/form")
    public void TravelFormHandle() {}

    @RequestMapping("/calculate")
    public String travelCalculate(@ModelAttribute TravelPlan plan, Model model) {

        int travelCoast = (plan.getTravelPay() + plan.getFoodCoast()) / plan.getMember();

        model.addAttribute("travelCoast", travelCoast);

        return "travel/calculate";
    }

}
