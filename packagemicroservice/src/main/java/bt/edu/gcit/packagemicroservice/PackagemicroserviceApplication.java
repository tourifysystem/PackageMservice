package bt.edu.gcit.packagemicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class PackagemicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PackagemicroserviceApplication.class, args);
	}

}
