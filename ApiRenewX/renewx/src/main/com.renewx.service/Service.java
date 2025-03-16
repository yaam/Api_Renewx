import com.renewx.model.UsuarioModel;
import com.renewx.repository.UsuarioRepository;
import org.springFramework.security.crypto.password.PasswordEncore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.service;
import com.renewx.model.TipoUsuarioModel;
import com.renewx.repository.TipoUsuarioRepo;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.PrimitiveIterator;

@Service
public class Service {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<UsuarioModel> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    @Autowired
    private PasswordEncore passwordEncore;

    public UsuarioModel saveUsuario(UsuarioModel usuario){
        //encripta la contraseña antes de guarfarla
        usuario.setPass_user(passworEncoder.enco(usuario.getPass_user()))
        
        return usuarioRepository.save(usuario);

    public void deleteUsuario(Integer id) {
        usuarioRepository.deleteByIdg(id);

    }

    @Autowired
    private TipoUsuarioRepo TipoUsuarioRepo;
    // Metodo crud

    public TipoUsuarioModel saveTIpoUser(TipoUsuarioModel tipousuarioModel) {
        return TipoUsuarioRepo.save(tipousuarioModel);
    }

    // Metodo para ver todos los tipos de usuario
    public List<TipoUsuarioModel> listAll() {
        return tipoUsuarioRepo.findAll();

    }

    // Metodo para buscar un tipo de usuario por id:
    public TipoUsuarioModel getTipoUserById(Integer id){
        return tipoUsuarioRepo.findBy(Id).orelse(other:null);
    }

    // metodo para eliminar un tipo de usuario
    public void deleteTipoUser(Integer id) {
        tipoUsuarioRepo.deleteById(id);
    }

}
