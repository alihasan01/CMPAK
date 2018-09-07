package com.employee.ws;

public class EmployeeProxy implements com.employee.ws.Employee {
  private String _endpoint = null;
  private com.employee.ws.Employee employee = null;
  
  public EmployeeProxy() {
    _initEmployeeProxy();
  }
  
  public EmployeeProxy(String endpoint) {
    _endpoint = endpoint;
    _initEmployeeProxy();
  }
  
  private void _initEmployeeProxy() {
    try {
      employee = (new com.employee.ws.EmployeeServiceLocator()).getEmployee();
      if (employee != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)employee)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)employee)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (employee != null)
      ((javax.xml.rpc.Stub)employee)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.employee.ws.Employee getEmployee() {
    if (employee == null)
      _initEmployeeProxy();
    return employee;
  }
  
  public java.lang.String getName(java.lang.String name) throws java.rmi.RemoteException{
    if (employee == null)
      _initEmployeeProxy();
    return employee.getName(name);
  }
  
  public void setName(java.lang.String name) throws java.rmi.RemoteException{
    if (employee == null)
      _initEmployeeProxy();
    employee.setName(name);
  }
  
  public java.lang.String getAge(java.lang.String age) throws java.rmi.RemoteException{
    if (employee == null)
      _initEmployeeProxy();
    return employee.getAge(age);
  }
  
  public java.lang.String getDesignation(java.lang.String designation) throws java.rmi.RemoteException{
    if (employee == null)
      _initEmployeeProxy();
    return employee.getDesignation(designation);
  }
  
  public void setDesignation(java.lang.String designation) throws java.rmi.RemoteException{
    if (employee == null)
      _initEmployeeProxy();
    employee.setDesignation(designation);
  }
  
  public void setAge(java.lang.String age) throws java.rmi.RemoteException{
    if (employee == null)
      _initEmployeeProxy();
    employee.setAge(age);
  }
  
  
}