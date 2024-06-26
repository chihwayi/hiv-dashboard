package zw.org.mohcc.hiv_dashboard;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@OpenAPIDefinition
@EnableCaching
public class HivDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(HivDashboardApplication.class, args);
	}

}
