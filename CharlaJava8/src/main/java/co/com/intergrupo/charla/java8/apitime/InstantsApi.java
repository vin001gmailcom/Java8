package co.com.intergrupo.charla.java8.apitime;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/*Equivalente a java.util.Date*/
public class InstantsApi {

	public static void main(String[] args) {
		Instant instant = Instant.now();
		Instant instant2 = Instant.now();
		System.out.println("instant: "+instant);
		System.out.println("instant2: "+instant2);
		System.out.println("Instant es menor que instant2: "+(instant2.isAfter(instant)));
	
		ZoneId zone = ZoneId.of("America/Bogota");
		Clock clock = Clock.system(zone );
		Instant instantWithClock = Instant.now(clock);
		System.out.println(instantWithClock);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("LocalDateTime: "+localDateTime);
		
	}

}
