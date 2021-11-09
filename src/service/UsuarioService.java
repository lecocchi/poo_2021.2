package service;

import java.util.ArrayList;
import java.util.List;

import dominio.Usuario;

public class UsuarioService {
	
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	
	
	public void registrarUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}
	
	public void eliminarUsuario(Usuario usuario) {
		usuarios.remove(usuario);
	}
	
	
	public boolean validarUsuario(Usuario usuario) {
		// Buscar en la lista si existe el par email y contrasena del usuario dado
		
		for (Usuario usuarioFor : usuarios) {
			if(usuarioFor.getEmail().equalsIgnoreCase(usuario.getEmail())  && 
					usuarioFor.getContrasena().equalsIgnoreCase(usuario.getContrasena()) ) {
				return true;	
			}
			
		}
		
		return false;
		
	}

}
