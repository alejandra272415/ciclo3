//1.Modelo o eteidad
//2.interface
//3.Repository
//4.servicios
//.5.Controlador web  25 clases en el proyecto

package Reto3_Domingo_Tarde.Reto3_Domingo_Tarde;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@EntityScan(basePackages = {"Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.model"})
@SpringBootApplication
public class Reto3DomingoTardeApplication {

	public static void main(String[] args) {
		SpringApplication.run(Reto3DomingoTardeApplication.class, args);
	}

}
