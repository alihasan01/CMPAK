/**
 * EmployeeImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class EmployeeImplServiceLocator extends org.apache.axis.client.Service implements service.EmployeeImplService {

    public EmployeeImplServiceLocator() {
    }


    public EmployeeImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EmployeeImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EmployeeImpl
    private java.lang.String EmployeeImpl_address = "http://localhost:8080/EmployeeWS/services/EmployeeImpl";

    public java.lang.String getEmployeeImplAddress() {
        return EmployeeImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EmployeeImplWSDDServiceName = "EmployeeImpl";

    public java.lang.String getEmployeeImplWSDDServiceName() {
        return EmployeeImplWSDDServiceName;
    }

    public void setEmployeeImplWSDDServiceName(java.lang.String name) {
        EmployeeImplWSDDServiceName = name;
    }

    public service.EmployeeImpl getEmployeeImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EmployeeImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEmployeeImpl(endpoint);
    }

    public service.EmployeeImpl getEmployeeImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            service.EmployeeImplSoapBindingStub _stub = new service.EmployeeImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getEmployeeImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEmployeeImplEndpointAddress(java.lang.String address) {
        EmployeeImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (service.EmployeeImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                service.EmployeeImplSoapBindingStub _stub = new service.EmployeeImplSoapBindingStub(new java.net.URL(EmployeeImpl_address), this);
                _stub.setPortName(getEmployeeImplWSDDServiceName());
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
        if ("EmployeeImpl".equals(inputPortName)) {
            return getEmployeeImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service", "EmployeeImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service", "EmployeeImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EmployeeImpl".equals(portName)) {
            setEmployeeImplEndpointAddress(address);
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
