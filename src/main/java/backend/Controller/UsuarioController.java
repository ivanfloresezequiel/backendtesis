package backend.Controller;

import backend.DTO.Response;
import backend.Servicios.UsuarioServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private static final Logger LOG = LoggerFactory.getLogger(UsuarioController.class);

    @Autowired
    private UsuarioServicio usuarioServicio;

    @GetMapping
    public ResponseEntity<Response> list() throws Exception {
        System.out.println("HolaSoycontrolador");
        Response response = usuarioServicio.findAll();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Response> obtenerUsuarioporId(@PathVariable(value = "id") Integer usuarioId){
        System.out.println("QuieroBuscarporID");
        Response response = usuarioServicio.findId(usuarioId);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
