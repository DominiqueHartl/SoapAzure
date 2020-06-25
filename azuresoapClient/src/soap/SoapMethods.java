/**
 * SoapMethods.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public interface SoapMethods extends java.rmi.Remote {
    public double[] getWind() throws java.rmi.RemoteException;
    public void setWind(double[] wind) throws java.rmi.RemoteException;
    public double[] getForecast() throws java.rmi.RemoteException;
    public void setForecast(double[] forecast) throws java.rmi.RemoteException;
    public double getTemp() throws java.rmi.RemoteException;
    public void setTemp(double temp) throws java.rmi.RemoteException;
}
