package Datos1495;

public class Contactos1495 {

	
	String Nombre;
	String Apellido;
	String Direcci�n;
	String E_Mail;
	String Telefono;






	public Contactos1495(String nombre, String apellido, String direcci�n, String e_Mail, String telefono) {
	
		this.Nombre = nombre;
		this.Apellido = apellido;
		this.Direcci�n = direcci�n;
		this.E_Mail = e_Mail;
		this.Telefono = telefono;
	}




	public String getNombre() {
		return Nombre;
	}




	public void setNombre(String nombre) {
		Nombre = nombre;
	}




	public String getApellido() {
		return Apellido;
	}




	public void setApellido(String apellido) {
		Apellido = apellido;
	}




	public String getDirecci�n() {
		return Direcci�n;
	}




	public void setDirecci�n(String direcci�n) {
		Direcci�n = direcci�n;
	}




	public String getE_Mail() {
		return E_Mail;
	}




	public void setE_Mail(String e_Mail) {
		E_Mail = e_Mail;
	}
	
	

	public String getTelefono() {
		return Telefono;
	}




	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String DameDatos() {
		
		
		return "Nombre: "+Nombre+"\nApellido: "+Apellido+"\nDirecci�n: "+Direcci�n+"\nE_Mail: "+E_Mail+"\nTelefono: "+Telefono;
	}
	
	
	
}
