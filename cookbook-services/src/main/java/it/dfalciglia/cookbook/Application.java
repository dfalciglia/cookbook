package it.dfalciglia.cookbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
//@Import(RepositoryRestMvcConfiguration.class)
@EnableJpaRepositories(basePackages = "it.dfalciglia.cookbook.services.repositories")
@EntityScan(basePackages = "it.dfalciglia.cookbook.model")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
