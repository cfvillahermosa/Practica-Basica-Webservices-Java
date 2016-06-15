package es.ufv.dis.discos.bean;

public class Disco {

	private String id;
	private String titulo;
	private String soporte;
	private String artista;
	private String genero;
	

	
	public Disco() {
		super();
		
	}


	public Disco(String id, String titulo,String soporte, String artista, String genero) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.soporte = soporte;
		this.artista = artista;
		this.genero = genero;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getSoporte() {
		return soporte;
	}


	public void setSoporte(String soporte) {
		this.soporte = soporte;
	}


	public String getArtista() {
		return artista;
	}


	public void setArtista(String artista) {
		this.artista = artista;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}

		
}
