package backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@SpringBootApplication
@EntityScan(basePackageClasses = {
        BonsaiBackendAplicacion.class,
        Jsr310JpaConverters.class
})
public class BonsaiBackendAplicacion {
    public static void main(String[] arg){
        SpringApplication.run(BonsaiBackendAplicacion.class,arg);
    }
}
