package org.codenova.spring.controller.parking;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/parking")
public class ParkingController {

    @RequestMapping("/form")
    public String parkingFormHandle() {
        System.out.println("ParkingController.parkingFormHandle");

        return "parking/form";
    }

    @RequestMapping("/calculate")
    public String parkingCalculateHandle(@RequestParam("number") String number,
                                         @RequestParam("time") int time,
                                         @RequestParam("pay") int pay,
                                         Model model) {
        System.out.println("ParkingController.parkingCalculateHandle()");
        System.out.println("number =" +number);
        System.out.println("time =" +time);
        System.out.println("pay =" +pay);

        int chargeTime = time;
        if (pay>100000) {
            chargeTime -= 5 *60;
        }else if (pay> 50000){
            chargeTime -= 4*60;
        }else if (pay >30000) {
            chargeTime -= 3*60;
        }else {
            chargeTime -= 30;
        }

        int fee;
        if (chargeTime <= 0) {
            fee = 0;
        }else {
            fee = chargeTime / 10 * 1000;
        }

        model.addAttribute("fee", fee);
        return "parking/calculate";

    }


}
