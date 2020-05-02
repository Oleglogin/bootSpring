package login.group.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/").setViewName("/welcome");
        registry.addViewController("/welcome").setViewName("welcome");
        registry.addViewController("/login").setViewName("login");

    }

    @Bean
    public MultipartResolver multipartResolver(){
        return new StandardServletMultipartResolver();
    }


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("resources/**")
                .addResourceLocations("/resources/");
        registry
                .addResourceHandler("/workImg/**")
//                .addResourceLocations("/workImg/");
                .addResourceLocations("file:" + System.getProperty("user.home") + File.separator + "Pictures\\");
    }

}
