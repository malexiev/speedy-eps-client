
package com.omgm.speedy.eps.soap.model;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "EPSProviderService", targetNamespace = "http://ver01.eps.speedy.sirma.com/", wsdlLocation = "https://www.speedy.bg/eps/main01.wsdl")
public class EPSProviderService
    extends Service
{

    private final static URL EPSPROVIDERSERVICE_WSDL_LOCATION;
    private final static WebServiceException EPSPROVIDERSERVICE_EXCEPTION;
    private final static QName EPSPROVIDERSERVICE_QNAME = new QName("http://ver01.eps.speedy.sirma.com/", "EPSProviderService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://www.speedy.bg/eps/main01.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EPSPROVIDERSERVICE_WSDL_LOCATION = url;
        EPSPROVIDERSERVICE_EXCEPTION = e;
    }

    public EPSProviderService() {
        super(__getWsdlLocation(), EPSPROVIDERSERVICE_QNAME);
    }

    public EPSProviderService(WebServiceFeature... features) {
        super(__getWsdlLocation(), EPSPROVIDERSERVICE_QNAME, features);
    }

    public EPSProviderService(URL wsdlLocation) {
        super(wsdlLocation, EPSPROVIDERSERVICE_QNAME);
    }

    public EPSProviderService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EPSPROVIDERSERVICE_QNAME, features);
    }

    public EPSProviderService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EPSProviderService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EPSProvider
     */
    @WebEndpoint(name = "EPSProviderPort")
    public EPSProvider getEPSProviderPort() {
        return super.getPort(new QName("http://ver01.eps.speedy.sirma.com/", "EPSProviderPort"), EPSProvider.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EPSProvider
     */
    @WebEndpoint(name = "EPSProviderPort")
    public EPSProvider getEPSProviderPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ver01.eps.speedy.sirma.com/", "EPSProviderPort"), EPSProvider.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EPSPROVIDERSERVICE_EXCEPTION!= null) {
            throw EPSPROVIDERSERVICE_EXCEPTION;
        }
        return EPSPROVIDERSERVICE_WSDL_LOCATION;
    }

}
