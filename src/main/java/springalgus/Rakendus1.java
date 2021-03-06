package springalgus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Rakendus1 {
	@RequestMapping("/algus")
    String tervitusfunktsioon() {
        return "Ahoi!";
    }
    
    @RequestMapping("/tervitus")
    String tervitus2(String eesnimi){
        return "Tere, "+eesnimi;
    }
	
	@RequestMapping("/korrutus")
	int korrutamine(int arv1, int arv2){
		return arv1*arv2;
	}
 
    public static void main(String[] args) {
		//System.getProperties().put("server.port", 48888);
        SpringApplication.run(Rakendus1.class, args);
    }
}
