package com.dhl.inventorystockmanagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

  /**
   * @api /swagger-ui/index.html
   * @api /v3/api-docs
   */

  @Bean
  public Docket api() {                
      return new Docket(DocumentationType.SWAGGER_2)          
        .apiInfo(apiInfo());
  }

  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
      .title("Drink and Delight - Stock Management Service")
      .description("Manages product Stock and RM stocks")
      .license("Apache 2.0")
      .licenseUrl("https://github.com/abhinandanchivate/dhlms")
      .version("1.0")
      .contact(
        new Contact(
          "Abhi", 
          "www.github.com/abhinandanchivate", 
          "Doesn't Exist")
      )
      .build();
  }

}