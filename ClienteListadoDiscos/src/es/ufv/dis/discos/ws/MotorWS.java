/**
 * MotorWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.ufv.dis.discos.ws;

public interface MotorWS extends java.rmi.Remote {
    public es.ufv.dis.discos.bean.Disco[] getDiscos(java.lang.String titulo) throws java.rmi.RemoteException;
    public void insertar(java.lang.String id, java.lang.String titulo, java.lang.String artista, java.lang.String genero) throws java.rmi.RemoteException;
    public void modificar(java.lang.String id, java.lang.String titulo, java.lang.String soporte, java.lang.String artista, java.lang.String genero) throws java.rmi.RemoteException;
    public void eliminar(java.lang.String soporte) throws java.rmi.RemoteException;
    public void guardar() throws java.rmi.RemoteException;
}
