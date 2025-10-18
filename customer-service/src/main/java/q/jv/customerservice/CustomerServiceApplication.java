package q.jv.customerservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import q.jv.customerservice.entities.Customer;
import q.jv.customerservice.repository.CustomerRepository;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository) {
        return args -> {
            customerRepository.save(Customer.builder()
                    .name("Youssef")
                    .email("ysf@email.mail")
                    .build());
            customerRepository.save(Customer.builder()
                    .name("test")
                    .email("tst@email.mail")
                    .build());
            customerRepository.save(Customer.builder()
                    .name("test2")
                    .email("tst@email.mail")
                    .build());
        };
    }
}
