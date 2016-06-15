package es.ufv.dis.discos.ws;

public class MotorWSProxy implements es.ufv.dis.discos.ws.MotorWS {
  private String _endpoint = null;
  private es.ufv.dis.discos.ws.MotorWS motorWS = null;
  
  public MotorWSProxy() {
    _initMotorWSProxy();
  }
  
  public MotorWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initMotorWSProxy();
  }
  
  private void _initMotorWSProxy() {
    try {
      motorWS = (new es.ufv.dis.discos.ws.MotorWSServiceLocator()).getMotorWS();
      if (motorWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)motorWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)motorWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (motorWS != null)
      ((javax.xml.rpc.Stub)motorWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public es.ufv.dis.discos.ws.MotorWS getMotorWS() {
    if (motorWS == null)
      _initMotorWSProxy();
    return motorWS;
  }
  
  public es.ufv.dis.discos.bean.Disco[] getDiscos(java.lang.String titulo) throws java.rmi.RemoteException{
    if (motorWS == null)
      _initMotorWSProxy();
    return motorWS.getDiscos(titulo);
  }
  
  public void insertar(java.lang.String id, java.lang.String titulo, java.lang.String artista, java.lang.String genero) throws java.rmi.RemoteException{
    if (motorWS == null)
      _initMotorWSProxy();
    motorWS.insertar(id, titulo, artista, genero);
  }
  
  public void modificar(java.lang.String id, java.lang.String titulo, java.lang.String soporte, java.lang.String artista, java.lang.String genero) throws java.rmi.RemoteException{
    if (motorWS == null)
      _initMotorWSProxy();
    motorWS.modificar(id, titulo, soporte, artista, genero);
  }
  
  public void eliminar(java.lang.String soporte) throws java.rmi.RemoteException{
    if (motorWS == null)
      _initMotorWSProxy();
    motorWS.eliminar(soporte);
  }
  
  public void guardar() throws java.rmi.RemoteException{
    if (motorWS == null)
      _initMotorWSProxy();
    motorWS.guardar();
  }
  
  
}