package ie.atu.Passenger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
@RequestMapping(path = "api/passenger")

public class PassengerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassengerApplication.class, args);
	}

	@GetMapping
	public List<Passenger> getPassengers();

	List<Passenger> myPassengers = List.of(
			new Passenger("Mr", "Lorcan", "123", 2L, 23),
			new Passenger("Mr", "Lorcan2", "6723", 2444L, 93),
			new Passenger("Mr", "Lorcan3", "144", 5562L, 53));

	return myPassengers;
}
