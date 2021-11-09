import javax.swing.JOptionPane;

import dominio.Usuario;
import service.UsuarioService;

public class Principal {
	
	public static void main(String[] args) {
		
		UsuarioService usuarioService = new UsuarioService();
		
		
		String email = JOptionPane.showInputDialog("Ingrese el email para registrar");
		String contrasena = JOptionPane.showInputDialog("Ingrese la contrasena para registrar");
		
		
		Usuario usuario = new Usuario(email, contrasena);
		
		usuarioService.registrarUsuario(usuario);
		
		if(usuarioService.validarUsuario(usuario)) {
			System.out.println("Usuario con el mail: " + usuario.getEmail() + " es valido");
		}else {
			System.out.println("Usuario y/o contrasena invalidos");
		}
		
		
		
	}

}
