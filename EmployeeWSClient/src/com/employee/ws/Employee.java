/**
 * Employee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.employee.ws;

public interface Employee extends java.rmi.Remote {
    public java.lang.String getName(java.lang.String name) throws java.rmi.RemoteException;
    public void setName(java.lang.String name) throws java.rmi.RemoteException;
    public java.lang.String getAge(java.lang.String age) throws java.rmi.RemoteException;
    public java.lang.String getDesignation(java.lang.String designation) throws java.rmi.RemoteException;
    public void setDesignation(java.lang.String designation) throws java.rmi.RemoteException;
    public void setAge(java.lang.String age) throws java.rmi.RemoteException;
}
