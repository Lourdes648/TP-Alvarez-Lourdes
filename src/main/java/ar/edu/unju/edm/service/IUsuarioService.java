package ar.edu.unju.edm.service;

import org.springframework.stereotype.Service;
import ar.edu.unju.edm.model.Usuario;

@Service
public interface IUsuarioService {

	public void guardarUsuario(Usuario usuario);
	public Usuario buscarUsuario(Long idUsuario) throws Exception;
	public void eliminarUsuario(Long idUsuario);

} 