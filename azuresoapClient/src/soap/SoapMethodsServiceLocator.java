/**
 * SoapMethodsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class SoapMethodsServiceLocator extends org.apache.axis.client.Service implements soap.SoapMethodsService {

    public SoapMethodsServiceLocator() {
    }


    public SoapMethodsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SoapMethodsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SoapMethods
    private java.lang.String SoapMethods_address = "http://localhost:8082/azuresoap/services/SoapMethods";

    public java.lang.String getSoapMethodsAddress() {
        return SoapMethods_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SoapMethodsWSDDServiceName = "SoapMethods";

    public java.lang.String getSoapMethodsWSDDServiceName() {
        return SoapMethodsWSDDServiceName;
    }

    public void setSoapMethodsWSDDServiceName(java.lang.String name) {
        SoapMethodsWSDDServiceName = name;
    }

    public soap.SoapMethods getSoapMethods() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SoapMethods_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSoapMethods(endpoint);
    }

    public soap.SoapMethods getSoapMethods(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            soap.SoapMethodsSoapBindingStub _stub = new soap.SoapMethodsSoapBindingStub(portAddress, this);
            _stub.setPortName(getSoapMethodsWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSoapMethodsEndpointAddress(java.lang.String address) {
        SoapMethods_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (soap.SoapMethods.class.isAssignableFrom(serviceEndpointInterface)) {
                soap.SoapMethodsSoapBindingStub _stub = new soap.SoapMethodsSoapBindingStub(new java.net.URL(SoapMethods_address), this);
                _stub.setPortName(getSoapMethodsWSDDServiceName());
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
        if ("SoapMethods".equals(inputPortName)) {
            return getSoapMethods();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap", "SoapMethodsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap", "SoapMethods"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SoapMethods".equals(portName)) {
            setSoapMethodsEndpointAddress(address);
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
