/**
 * MotorWSService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.ufv.dis.discos.ws;

public interface MotorWSService extends javax.xml.rpc.Service {
    public java.lang.String getMotorWSAddress();

    public es.ufv.dis.discos.ws.MotorWS getMotorWS() throws javax.xml.rpc.ServiceException;

    public es.ufv.dis.discos.ws.MotorWS getMotorWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
