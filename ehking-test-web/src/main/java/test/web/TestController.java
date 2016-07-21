package test.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/weixin")
public class TestController {
  
  static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);
  
  @RequestMapping("/index")
  public String index(HttpServletRequest request, HttpServletResponse response) {
    LOGGER.info("request successful");
    return "index";
  }   
}
