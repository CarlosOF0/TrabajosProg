package controlador;

import modelo.Mundo;
import vista.Interfaz;

public class Controlador 
{
	private Mundo m;
	private Interfaz gui;
	private String objeto;
	
	public Controlador()
	{
		m = new Mundo();
		gui = new Interfaz();
		
		objeto = gui.objetoOperacion();
		
		if(objeto.equalsIgnoreCase("1"))
		{
			String obj = gui.operacion();
			if(obj.equalsIgnoreCase("1"))
			{
				
			}
			else if(obj.equalsIgnoreCase("2"))
			{
				
			}
			else if(obj.equalsIgnoreCase("3"))
			{
				
			}
			else if(obj.equalsIgnoreCase("4"))
			{
				
			}
			else if(obj.equalsIgnoreCase("5"))
			{
				
			}
			else if(obj.equalsIgnoreCase("6"))
			{
				
			}
		}
		
		if(objeto.equalsIgnoreCase("2"))
		{
			String obj = gui.operacion();
			if(obj.equalsIgnoreCase("1"))
			{
				
			}
			else if(obj.equalsIgnoreCase("2"))
			{
				
			}
			else if(obj.equalsIgnoreCase("3"))
			{
				
			}
			else if(obj.equalsIgnoreCase("4"))
			{
				
			}
			else if(obj.equalsIgnoreCase("5"))
			{
				
			}
		}
		
		if(objeto.equalsIgnoreCase("3"))
		{
			String obj = gui.operacion();
			if(obj.equalsIgnoreCase("1"))
			{
				
			}
			else if(obj.equalsIgnoreCase("2"))
			{
				
			}
			else if(obj.equalsIgnoreCase("3"))
			{
				
			}
			else if(obj.equalsIgnoreCase("4"))
			{
				
			}
			else if(obj.equalsIgnoreCase("5"))
			{
				
			}
			else if(obj.equalsIgnoreCase("6"))
			{
				
			}
		}
		
		if(objeto.equalsIgnoreCase("4"))
		{
			String obj = gui.operacion();
			if(obj.equalsIgnoreCase("1"))
			{
				
			}
			else if(obj.equalsIgnoreCase("2"))
			{
				
			}
			else if(obj.equalsIgnoreCase("3"))
			{
				
			}
			else if(obj.equalsIgnoreCase("4"))
			{
				
			}
			else if(obj.equalsIgnoreCase("5"))
			{
				
			}
		}
		
		if(objeto.equalsIgnoreCase("5"))
		{
			String obj = gui.operacion();
			if(obj.equalsIgnoreCase("1"))
			{
				
			}
			else if(obj.equalsIgnoreCase("2"))
			{
				
			}
			else if(obj.equalsIgnoreCase("3"))
			{
				
			}
			else if(obj.equalsIgnoreCase("4"))
			{
				
			}
			else if(obj.equalsIgnoreCase("5"))
			{
				
			}
			else if(obj.equalsIgnoreCase("6"))
			{
				
			}
		}
		
		if(objeto.equalsIgnoreCase("6"))
		{
			String obj = gui.operacion();
			if(obj.equalsIgnoreCase("1"))
			{
				
			}
			else if(obj.equalsIgnoreCase("2"))
			{
				
			}
			else if(obj.equalsIgnoreCase("3"))
			{
				
			}
			else if(obj.equalsIgnoreCase("4"))
			{
				
			}
			else if(obj.equalsIgnoreCase("5"))
			{
				
			}
		}
	}
}
