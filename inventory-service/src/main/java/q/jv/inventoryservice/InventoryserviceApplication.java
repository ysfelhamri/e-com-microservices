package q.jv.inventoryservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import q.jv.inventoryservice.entities.Product;
import q.jv.inventoryservice.repository.ProductRepository;

import java.util.UUID;

@SpringBootApplication
public class InventoryserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryserviceApplication.class, args);
    }
    @Bean
    CommandLineRunner init(ProductRepository productRepository) {
        return args -> {
          productRepository.save(Product.builder()
                  .id(UUID.randomUUID().toString())
                  .name("Ink")
                  .price(255.0)
                  .quantity(25)
                  .build());
            productRepository.save(Product.builder()
                    .id(UUID.randomUUID().toString())
                    .name("Printer")
                    .price(4000)
                    .quantity(10)
                    .build());
            productRepository.save(Product.builder()
                    .id(UUID.randomUUID().toString())
                    .name("Computer")
                    .price(5000)
                    .quantity(8)
                    .build());
        };
    }
}
