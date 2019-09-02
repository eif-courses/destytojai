package eif.viko.lt.destytojai.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

  @Bean
  public Docket destytojaiAPI(){
    return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.basePackage("eif.viko.lt.destytojai"))
        .paths(PathSelectors.regex("/resource.*"))
        .build()
        .apiInfo(metaInfo());
  }

  private ApiInfo metaInfo(){
    return new ApiInfo(
      "Dėstytojai API",
        "Vilnius kolegijos Elektronikos ir informatikos fakulteto API",
        "v1.0",
        "https://eif-courses.github.io",
        "Marius Gžegoževskis",
        "Vilniaus kolegija EIF licencija",
        "https://eif-courses.github.io"
    );
  }

}

