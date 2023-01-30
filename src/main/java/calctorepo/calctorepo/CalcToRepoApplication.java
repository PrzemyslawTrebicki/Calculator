package calctorepo.calctorepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalcToRepoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalcToRepoApplication.class, args);

        Calculator calc = new Calculator(2,3);
        System.out.println("Suma liczb to: "+calc.Add());
        System.out.println("Rożnica liczb to: "+calc.Subtract());
    }

}
