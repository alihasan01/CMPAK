/**
 * EmployeeService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.employee.ws;

public interface EmployeeService extends javax.xml.rpc.Service {
    public java.lang.String getEmployeeAddress();

    public com.employee.ws.Employee getEmployee() throws javax.xml.rpc.ServiceException;

    public com.employee.ws.Employee getEmployee(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
