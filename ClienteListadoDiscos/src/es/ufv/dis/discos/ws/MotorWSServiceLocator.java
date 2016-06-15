/**
 * MotorWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.ufv.dis.discos.ws;

public class MotorWSServiceLocator extends org.apache.axis.client.Service implements es.ufv.dis.discos.ws.MotorWSService {

    public MotorWSServiceLocator() {
    }


    public MotorWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MotorWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MotorWS
    private java.lang.String MotorWS_address = "http://localhost:8080/ListadoDiscos/services/MotorWS";

    public java.lang.String getMotorWSAddress() {
        return MotorWS_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MotorWSWSDDServiceName = "MotorWS";

    public java.lang.String getMotorWSWSDDServiceName() {
        return MotorWSWSDDServiceName;
    }

    public void setMotorWSWSDDServiceName(java.lang.String name) {
        MotorWSWSDDServiceName = name;
    }

    public es.ufv.dis.discos.ws.MotorWS getMotorWS() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MotorWS_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMotorWS(endpoint);
    }

    public es.ufv.dis.discos.ws.MotorWS getMotorWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            es.ufv.dis.discos.ws.MotorWSSoapBindingStub _stub = new es.ufv.dis.discos.ws.MotorWSSoapBindingStub(portAddress, this);
            _stub.setPortName(getMotorWSWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMotorWSEndpointAddress(java.lang.String address) {
        MotorWS_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (es.ufv.dis.discos.ws.MotorWS.class.isAssignableFrom(serviceEndpointInterface)) {
                es.ufv.dis.discos.ws.MotorWSSoapBindingStub _stub = new es.ufv.dis.discos.ws.MotorWSSoapBindingStub(new java.net.URL(MotorWS_address), this);
                _stub.setPortName(getMotorWSWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("MotorWS".equals(inputPortName)) {
            return getMotorWS();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.discos.dis.ufv.es", "MotorWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.discos.dis.ufv.es", "MotorWS"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MotorWS".equals(portName)) {
            setMotorWSEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
