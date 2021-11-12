import javax.swing.JOptionPane;

import dominio.Usuario;
import service.UsuarioService;

public class Principal {

	public static void main(String[] args) {

		UsuarioService usuarioService = new UsuarioService();

		int opcion;

		opcion = Integer.parseInt(
				JOptionPane.showInputDialog("Ingrese una opcion \n 1- Registrar usuario 2- Loguear 3- Salir"));

		while (opcion != 3) {
			if (opcion == 1) {

				String email = JOptionPane.showInputDialog("Ingrese el email para registrar");
				String contrasena = JOptionPane.showInputDialog("Ingrese la contrasena para registrar");

				Usuario usuario = new Usuario(email, contrasena);

				String mensaje = usuarioService.registrarUsuario(usuario);

				System.out.println(mensaje);

			} else {
				String email = JOptionPane.showInputDialog("Ingrese el email para loguearse");
				String contrasena = JOptionPane.showInputDialog("Ingrese la contrasena para loguearse");

				Usuario usuario = new Usuario(email, contrasena);

				boolean esValido = usuarioService.validarUsuario(usuario);

				if (esValido) {
					System.out.println("El usuario " + usuario.getEmail() + " es valido");
				} else {
					System.out.println("El usuario y/o contrasena son incorrectos");
				}

			}
			opcion = Integer.parseInt(
					JOptionPane.showInputDialog("Ingrese una opcion \n 1- Registrar usuario 2- Loguear 3- Salir"));
		}

		System.out.println("Gracias por ser parte de Mercado Libre");

	}

}
