package base;

public abstract class ProveedorGrua {

	public abstract int pedirGrua();

	public abstract double consultarEstadoGrua(int id);

	public abstract void cancelarGrua(int id);

	public abstract String getNombreProveedor();

}
