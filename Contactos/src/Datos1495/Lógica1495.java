package Datos1495;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Lógica1495 {

	
	public Contactos1495 contac;
	public ArrayList <Contactos1495>mi_array;
	
	public Lógica1495() {
		
		contac=null;
		mi_array= new ArrayList<Contactos1495>();
		
	}

	
	
	public void Menu() {
		int cont=0;
		boolean condi=true;
	
		while(condi==true) {
			try {
		int opción=Integer.parseInt(JOptionPane.showInputDialog(null, "Contactos\n1.Agregar contacto\n2.Eliminar contacto\n3.Ver contacto\n4.Modificar contacto\n5.Lista contactos\n6.Buscar contacto\n7.Salir\nDigite una opción"));
		
		switch(opción) {
		
		case 1:
			
			
		cont++;
		
		String nombre,apellido,dirección,e_mail,telefono;
		
		
		JOptionPane.showMessageDialog(null,"Contacto #"+cont);
		nombre=JOptionPane.showInputDialog(null,"Digita el nombre del contacto");
		apellido=JOptionPane.showInputDialog(null,"Digita el apellido del contacto");
		dirección=JOptionPane.showInputDialog(null,"Digita la dirección del contacto");
		e_mail=JOptionPane.showInputDialog(null,"Digita el e_mail del contacto");
		telefono=JOptionPane.showInputDialog(null,"Digita el número de telefono o celular del contacto");
			
		
		mi_array.add(new Contactos1495(nombre,apellido,dirección,e_mail,telefono));
			break;
		case 2: 
			
			int posi=0;
			
			String nomape=JOptionPane.showInputDialog(null,"Digita el nombre o apellido del contacto a eliminar");
			
			for(int i=0; i<mi_array.size();i++) {
				
				if(nomape.equalsIgnoreCase(mi_array.get(i).getNombre()) || nomape.equalsIgnoreCase(mi_array.get(i).getApellido())) {

					posi=i;
					
					
				}
				
			}
			
			mi_array.remove(posi);
			break;
		case 3:
			
			int posi1=0;
			String nomape2=JOptionPane.showInputDialog(null,"Digita el nombre o apellido del contacto que desees ver");

			for(int i=0; i<mi_array.size();i++) {
				
				if(nomape2.equalsIgnoreCase(mi_array.get(i).getNombre()) || nomape2.equalsIgnoreCase(mi_array.get(i).getApellido())) {

					posi1=i;
					
					
				}
		
			}
			
			JOptionPane.showMessageDialog(null,mi_array.get(posi1).DameDatos());
			break;
		case 4:
		
			int posi2=0;
			String nomape3=JOptionPane.showInputDialog(null,"Digita el nombre o apellido del contacto que desees ver");

			for(int i=0; i<mi_array.size();i++) {
				
				if(nomape3.equalsIgnoreCase(mi_array.get(i).getNombre()) || nomape3.equalsIgnoreCase(mi_array.get(i).getApellido())) {

					posi2=i;
					
					
				}
		
			}
			
			JOptionPane.showMessageDialog(null,"Contacto: \n"+mi_array.get(posi2).DameDatos());
			
			int modi=Integer.parseInt(JOptionPane.showInputDialog(null,"1.Nombre\n2.Apellido\n3.Dirección\n4.E_Mail\n5.Telefono\nDigite la opción a modificar"));
			
			if(modi==1) {
				
				String nombre2=JOptionPane.showInputDialog(null,"Digita el nuevo nombre");
				mi_array.get(posi2).setNombre(nombre2);
				
			}if(modi==2) {
				
				String apellido2=JOptionPane.showInputDialog(null,"Digita el apellido");
				mi_array.get(posi2).setApellido(apellido2);
				
			}if(modi==3) {
				
				String dirección2=JOptionPane.showInputDialog(null,"Digita la nueva dirección");
				mi_array.get(posi2).setDirección(dirección2);
				
			}if(modi==4) {
				
				String e_mail2=JOptionPane.showInputDialog(null,"Digita el nuevo e_mail");
				mi_array.get(posi2).setE_Mail(e_mail2);
				
			}if(modi==5) {
				
				String telefono2=JOptionPane.showInputDialog(null,"Digita el nuevo telefono");
				mi_array.get(posi2).setTelefono(telefono2);
				
			}
		
			break;
		case 5:
			
			for(Contactos1495 c: mi_array) {
				
				JOptionPane.showMessageDialog(null,"Contactos: \n"+c.DameDatos());

				
				
			}
			
			break;
		case 6:
			
			int posi3=0;
			String nomape4=JOptionPane.showInputDialog(null,"Digita el nombre o apellido del contacto que desees ver");

			for(int i=0; i<mi_array.size();i++) {
				
				if(nomape4.equalsIgnoreCase(mi_array.get(i).getNombre()) || nomape4.equalsIgnoreCase(mi_array.get(i).getApellido())) {

					posi3=i;
					
					
				}
		
			}
			
			
			JOptionPane.showMessageDialog(null,"Contacto: \n"+mi_array.get(posi3).DameDatos());
			
			break;
		case 7:
			
			int salir=JOptionPane.showConfirmDialog(null,"¿Estás seguro?",null,JOptionPane.YES_NO_OPTION);
			
			if(salir==0) {
				
				
				condi=false;
			}
			
			break;
		
		default:
			JOptionPane.showMessageDialog(null,"Digite una opción correcta");
			
			break;
			
			
	}
		
			}catch(Exception e) {
				
				JOptionPane.showMessageDialog(null,"Digita acerca de lo que te piden");
			
			}
}
		

	
	
}
}
