package hello

import org.springframework.context.annotation.{Configuration, ComponentScan}
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * This object bootstraps Spring Boot web application.
 * Via Gradle: gradle bootRun
 *
 * @author Ruchi Agarwal
 * @since 1.0
 */

@Controller
@Configuration
@EnableAutoConfiguration
@ComponentScan
class HelloConfig {

  @RequestMapping(value=Array("/"), method=Array(RequestMethod.GET))
  @ResponseBody
  def myApp(): String = {
    "Hello World!! This is my first App."
  }

}

