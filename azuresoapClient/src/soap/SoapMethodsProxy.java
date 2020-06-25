package soap;

public class SoapMethodsProxy implements soap.SoapMethods {
  private String _endpoint = null;
  private soap.SoapMethods soapMethods = null;
  
  public SoapMethodsProxy() {
    _initSoapMethodsProxy();
  }
  
  public SoapMethodsProxy(String endpoint) {
    _endpoint = endpoint;
    _initSoapMethodsProxy();
  }
  
  private void _initSoapMethodsProxy() {
    try {
      soapMethods = (new soap.SoapMethodsServiceLocator()).getSoapMethods();
      if (soapMethods != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)soapMethods)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)soapMethods)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (soapMethods != null)
      ((javax.xml.rpc.Stub)soapMethods)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public soap.SoapMethods getSoapMethods() {
    if (soapMethods == null)
      _initSoapMethodsProxy();
    return soapMethods;
  }
  
  public double[] getWind() throws java.rmi.RemoteException{
    if (soapMethods == null)
      _initSoapMethodsProxy();
    return soapMethods.getWind();
  }
  
  public void setWind(double[] wind) throws java.rmi.RemoteException{
    if (soapMethods == null)
      _initSoapMethodsProxy();
    soapMethods.setWind(wind);
  }
  
  public double[] getForecast() throws java.rmi.RemoteException{
    if (soapMethods == null)
      _initSoapMethodsProxy();
    return soapMethods.getForecast();
  }
  
  public void setForecast(double[] forecast) throws java.rmi.RemoteException{
    if (soapMethods == null)
      _initSoapMethodsProxy();
    soapMethods.setForecast(forecast);
  }
  
  public double getTemp() throws java.rmi.RemoteException{
    if (soapMethods == null)
      _initSoapMethodsProxy();
    return soapMethods.getTemp();
  }
  
  public void setTemp(double temp) throws java.rmi.RemoteException{
    if (soapMethods == null)
      _initSoapMethodsProxy();
    soapMethods.setTemp(temp);
  }
  
  
}