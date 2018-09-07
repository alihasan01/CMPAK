package service;

public class EmployeeImplProxy implements service.EmployeeImpl {
  private String _endpoint = null;
  private service.EmployeeImpl employeeImpl = null;
  
  public EmployeeImplProxy() {
    _initEmployeeImplProxy();
  }
  
  public EmployeeImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initEmployeeImplProxy();
  }
  
  private void _initEmployeeImplProxy() {
    try {
      employeeImpl = (new service.EmployeeImplServiceLocator()).getEmployeeImpl();
      if (employeeImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)employeeImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)employeeImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (employeeImpl != null)
      ((javax.xml.rpc.Stub)employeeImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public service.EmployeeImpl getEmployeeImpl() {
    if (employeeImpl == null)
      _initEmployeeImplProxy();
    return employeeImpl;
  }
  
  public java.lang.String getName() throws java.rmi.RemoteException{
    if (employeeImpl == null)
      _initEmployeeImplProxy();
    return employeeImpl.getName();
  }
  
  public void setName(java.lang.String name) throws java.rmi.RemoteException{
    if (employeeImpl == null)
      _initEmployeeImplProxy();
    employeeImpl.setName(name);
  }
  
  public java.lang.String getAge() throws java.rmi.RemoteException{
    if (employeeImpl == null)
      _initEmployeeImplProxy();
    return employeeImpl.getAge();
  }
  
  public java.lang.String getDesignation() throws java.rmi.RemoteException{
    if (employeeImpl == null)
      _initEmployeeImplProxy();
    return employeeImpl.getDesignation();
  }
  
  public void setDesignation(java.lang.String designation) throws java.rmi.RemoteException{
    if (employeeImpl == null)
      _initEmployeeImplProxy();
    employeeImpl.setDesignation(designation);
  }
  
  public void setAge(java.lang.String age) throws java.rmi.RemoteException{
    if (employeeImpl == null)
      _initEmployeeImplProxy();
    employeeImpl.setAge(age);
  }
  
  
}