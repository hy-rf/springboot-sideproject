package side.side;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SideApplication {

	public static void main(String[] args) {
		try {
		SpringApplication.run(SideApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
        }
    }

}
