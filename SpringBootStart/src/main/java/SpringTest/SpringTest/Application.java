package SpringTest.SpringTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//說明：
//@Configuration 使用 Java Class 作為設定，(非XML)
//@ComponentScan自動掃描 Spring Bean 元件
//@EnableAutoConfiguration 啟用 Spring Boot 自動配置，將自動判斷專案使用到的套件，建立相關的設定。
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}