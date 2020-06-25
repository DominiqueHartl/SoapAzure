/**
 * SoapMethodsService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public interface SoapMethodsService extends javax.xml.rpc.Service {
    public java.lang.String getSoapMethodsAddress();

    public soap.SoapMethods getSoapMethods() throws javax.xml.rpc.ServiceException;

    public soap.SoapMethods getSoapMethods(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
