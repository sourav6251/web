package com.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MomController {

   @ResponseBody
   @RequestMapping("/food")
   public String giveFood(){
      return "Here is your food";
   }
}
