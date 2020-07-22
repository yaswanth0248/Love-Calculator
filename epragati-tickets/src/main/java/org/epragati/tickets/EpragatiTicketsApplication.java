package org.epragati.tickets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.client.RestTemplate;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class},scanBasePackages = "org.epragati.*")
@EnableMongoRepositories(basePackages = "org.epragati.ticketsdao")//org.epragati.ticketsdao
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
public class EpragatiTicketsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EpragatiTicketsApplication.class, args);
	}
	/*
	 * MongoClientURI t = new MongoClientURI(
	 * "mongodb://yaswanth0248:Chinna%400248@yaswanth-shard-00-00-1uy51.mongodb.net:27017,yaswanth-shard-00-01-1uy51.mongodb.net:27017,yaswanth-shard-00-02-1uy51.mongodb.net:27017/Test?ssl=true&replicaSet=Yaswanth-shard-0&authSource=admin&retryWrites=true&w=majority"
	 * ); MongoClient mongoClient = new MongoClient(t); MongoDatabase database =
	 * mongoClient.getDatabase("Test");
	 */
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
