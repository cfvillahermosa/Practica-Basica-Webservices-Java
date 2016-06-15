package es.ufv.dis.discos.dao;

import java.io.File;
import java.io.IOException;
import java.util.Vector;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import es.ufv.dis.discos.bean.Disco;

public class Dao {
	
	
	private Vector<Disco> discos = new Vector<Disco>();
	private static Dao _dao;
	
	
	
	public static Dao getInstance() 
	{
		if (_dao == null)
		{
			_dao = new Dao();
			_dao.leeDiscos();
		}
		return _dao;
		
	}
	
	
	private Document generaDOM()
	{
		Document doc = null;

		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();   
		DocumentBuilder docBuilder = null;
		try {
			docBuilder = docBuilderFactory.newDocumentBuilder();
			doc = docBuilder.newDocument();
			Element raiz = doc.createElement("discos");
			for ( int i = 0; i < discos.size(); i++)
			{
				Disco disco = discos.elementAt(i);
				Element discoElement = doc.createElement("disco");
				
				Element idElement = doc.createElement("id");
				idElement.setTextContent(disco.getId());
				
				Element tituloElement = doc.createElement("titulo");
				tituloElement.setTextContent(disco.getTitulo());
				
				Element artistaElement = doc.createElement("artista");
				artistaElement.setTextContent(disco.getArtista());
				
				Element generoElement = doc.createElement("genero");
				generoElement.setTextContent(disco.getGenero());
				
				discoElement.appendChild(idElement);
				discoElement.appendChild(tituloElement);
				discoElement.appendChild(artistaElement);
				discoElement.appendChild(generoElement);
				discoElement.setAttribute("soporte", disco.getSoporte());
				
				
				raiz.appendChild(discoElement);

			}
			doc.appendChild(raiz);
			
			
		}
		catch (Exception e)
		{
			
		}
		
		return doc;
	}
	
	private void guardarFicheroXML(Document doc)
	{
		try
		{
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			Result output = new StreamResult(new File("/Users/Black/Eclipse_Workspace/ListadoDiscos/src/xml/Discos.xml"));
			
			Source input = new DOMSource(doc);
	
			transformer.transform(input, output);
		}
		catch (Exception e)
		{
			
		}
	}
	
	
	public void escribir()
	{
		Document doc = generaDOM();
		guardarFicheroXML(doc);
	}
	
	
	
	private void leeDiscos()
	{

		
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();   
		DocumentBuilder docBuilder = null;
		Document doc = null;
	
		try {
			docBuilder = docBuilderFactory.newDocumentBuilder();
			doc = docBuilder.parse (new File("/Users/Black/Eclipse_Workspace/ListadoDiscos/src/xml/Discos.xml"));
			//Document doc = docBuilder.parse(Class.class.getResourceAsStream("/es/ufv/dis/ejercicio1/xml/cv.xml"));
			doc.getDocumentElement().normalize();   
			
			Element raiz = doc.getDocumentElement();
			
			NodeList hijos = raiz.getChildNodes();
			System.out.println( "El numero de hijos es "+hijos.getLength());
			
			for (int i = 0; i < hijos.getLength(); i++)
			{
				Node hijo = hijos.item(i);
				if (hijo.getNodeType() == Node.ELEMENT_NODE)
				{
					Element hijoEl = (Element)hijo;
					String soporte = hijoEl.getAttribute("soporte");
					
					Node idNodo = hijoEl.getElementsByTagName("id").item(0);
					Element idElement = (Element)idNodo;
					String id = idElement.getTextContent();
					
					// String nombre = hijoEl.getElementsByTagName("nombre").item(0).getFirstChild().getNodeValue();
					
					Node tituloNodo = hijoEl.getElementsByTagName("titulo").item(0);
					Element tituloElement = (Element)tituloNodo;
					String titulo = tituloElement.getTextContent();
	
					Node artistaNodo = hijoEl.getElementsByTagName("artista").item(0);
					Element artistaElement = (Element)artistaNodo;
					String artista = artistaElement.getTextContent();
	
					Node generoNodo = hijoEl.getElementsByTagName("genero").item(0);
					Element generoElement = (Element)generoNodo;
					String genero = generoElement.getTextContent();

					Disco disco = new Disco(id, titulo,soporte, artista, genero);
					
					discos.addElement(disco);
					
				}
				
				
			}
			
		
		} catch (SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	
	}
	
	
	
	public Vector<Disco> getDiscos()
	{
		return discos;
	}
	
	
	public void modifica(Disco disco)
	{
		for (int i = 0; i < discos.size(); i++){
			Disco discoVector = discos.elementAt(i);
			if (discoVector.getSoporte().equals(disco.getSoporte())) {
				discoVector.setTitulo(disco.getTitulo());
				discoVector.setArtista(disco.getArtista());
				discoVector.setGenero(disco.getGenero());
				discoVector.setId(disco.getId());
				
//				discos.set(i, disco);
			}
		}
	}
	
	
	
	public void elimina(Disco disco)
	{
		for (int i = 0; i < discos.size(); i++){
			Disco discoVector = discos.elementAt(i);
			if (discoVector.getSoporte().equals(disco.getSoporte())) {
				discos.remove(i);
			}
		}
	}
	
	
	
	public void inserta(Disco disco)
	{
		this.discos.addElement(disco);
	}
	

}
