package es.ufv.dis.discos.motor;

import java.util.Vector;

import es.ufv.dis.discos.bean.Disco;
import es.ufv.dis.discos.dao.Dao;

public class Motor {

	public Vector<Disco> getDiscos()
	{
		
		Dao dao = Dao.getInstance();
		return dao.getDiscos();
		
	}

	public Vector<Disco> getDiscos(String titulo)
	{
		
		Dao dao = Dao.getInstance();;
		Vector<Disco> discos = dao.getDiscos();
		Vector<Disco> resultado = new Vector<Disco>();

		// cargar en un nuevo vector los alumnos que contienen el mismo nombre
		for (int i = 0; i < discos.size(); i++)
		{
			Disco disco = discos.elementAt(i);
			if (disco.getTitulo().toLowerCase().contains(titulo.toLowerCase()))
			{
				resultado.addElement(disco);
			}
		}
		
		return resultado;
		
	
	}
	
	public void modificar(String id, String titulo, String soporte, String artista, String genero) {
		Disco disco = new Disco(id, titulo, soporte, artista, genero);
		Dao dao = Dao.getInstance();
		dao.modifica(disco);
		
	}
	
	public void eliminar(Disco disco) {
		Dao dao = Dao.getInstance();
		dao.elimina(disco);
	}
	
	public void insertar(String id, String titulo, String artista, String genero)
	{
		
		int x = getDiscos().size()+1;
		String soporte = String.valueOf(x);
		Disco disco = new Disco(id, titulo, soporte, artista, genero);
		Dao dao = Dao.getInstance();
		dao.inserta(disco);
	}
	
	public void guardar()
	{
		Dao dao = Dao.getInstance();
		dao.escribir();
	}
	
	
	
}
