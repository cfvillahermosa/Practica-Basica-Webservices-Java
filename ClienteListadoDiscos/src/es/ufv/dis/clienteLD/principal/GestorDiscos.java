package es.ufv.dis.clienteLD.principal;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import es.ufv.dis.discos.bean.Disco;
import es.ufv.dis.discos.ws.MotorWS;
import es.ufv.dis.discos.ws.MotorWSServiceLocator;

public class GestorDiscos {
	public static void main(String[] args){
		System.out.println("Listado de discos");
		try {
			MotorWS motor = new MotorWSServiceLocator().getMotorWS();
			Disco[] discos = motor.getDiscos("");
			for(int i=0; i<discos.length;i++){
				System.out.println("Nombre: " + discos[i].getId() + " " + discos[i].getTitulo());
			}
			
			//motor.insertar("5", "5", "5", "5");
			//motor.insertar("5", "5", "5", "5");
			//motor.insertar("5", "5", "5", "5");
			//motor.modificar("ese2", "ese2", "2", "ese2", "ese2");
			motor.eliminar("1");
			motor.guardar();
			
		} catch (ServiceException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
