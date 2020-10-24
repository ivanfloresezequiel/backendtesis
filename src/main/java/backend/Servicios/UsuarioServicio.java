package backend.Servicios;

import backend.DTO.Response;
import backend.Model.Usuario;
import backend.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class UsuarioServicio {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Response findId(int id){
        Response response = new Response();
        response.getMensaje();
        Usuario usuario =  usuarioRepository.findByUsuarioId(id);
        response.setData(usuario);
        return response;
    }
    public Response findAll() throws Exception{
        Response response = new Response();
        List<Usuario> usuarios = usuarioRepository.findAll();
        if(usuarios == null){
            System.out.println("No encontre nada");
            throw new Exception();
        }
        response.setMensaje("Usuarios: ");
        response.setEstado(200);
        response.setData(usuarios);
        return response;
    }

}


