package vista;

import javax.swing.JOptionPane;

public class Interfaz 
{
	public Interfaz()
	{

	}
	
	public String objetoOperacion() 
	{
		return (JOptionPane.showInputDialog(null,"Ingrese el objeto con el quiera hacer una operacion: \n1. Avion \n2. Pajaro \n3. Helicoptero \n4. Kryptoniano \n5. Hidroavion \n6. Superman","Flyer",JOptionPane.INFORMATION_MESSAGE));
	}
	
	public String operacion() 
	{
		return (JOptionPane.showInputDialog(null,"Ingrese la Operacion","Flyer",JOptionPane.INFORMATION_MESSAGE));
	}
	
	public void move()
	{
		JOptionPane.showMessageDialog(null, "Despegando");
	}
	
	public void turnOn()
	{
		JOptionPane.showMessageDialog(null, "Encendiendo");
	}
}
