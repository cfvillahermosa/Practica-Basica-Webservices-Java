package es.ufv.dis.discos.ws;

import java.util.Vector;

import es.ufv.dis.discos.bean.Disco;
import es.ufv.dis.discos.motor.Motor;

public class MotorWS {

	public void guardar() {
		Motor motor = new Motor();
		motor.guardar();
	}
	
	
	public void insertar(String id, String titulo, String artista, String genero)
	{
		Motor motor = new Motor();
		motor.insertar(id, titulo, artista, genero);
	}	

	public void modificar(String id, String titulo, String soporte, String artista, String genero)
	{
		Motor motor = new Motor();
		motor.modificar(id, titulo, soporte, artista, genero);
	}	
	
	public void eliminar(String soporte)
	{
		Motor motor = new Motor();
		Disco disco = new Disco("","",soporte,"","");
		motor.eliminar(disco);
	}	
	
	public Disco[] getDiscos(String titulo)
	{
		Vector<Disco> als = null;
		Disco[] alsArray = null;
		Motor motor = new Motor();
		als = motor.getDiscos(titulo);
//		alsArray = new Alumno[als.size()];
		alsArray = als.toArray(new Disco[als.size()]);
		return alsArray;
	}
	
	
	
}
