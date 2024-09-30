package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller()
public class MomController {

   @ResponseBody
   @RequestMapping("/mom")
   public String food(){
      return"Ok.. Take it.....";
   }
}
