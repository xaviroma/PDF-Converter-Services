
package com.muhimbi.ws;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "DocumentConverterService", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://localhost:41734/Muhimbi.DocumentConverter.WebService/?wsdl")
public class DocumentConverterService_Service
    extends Service
{

    private final static URL DOCUMENTCONVERTERSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.muhimbi.ws.DocumentConverterService_Service.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.muhimbi.ws.DocumentConverterService_Service.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:41734/Muhimbi.DocumentConverter.WebService/?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:41734/Muhimbi.DocumentConverter.WebService/?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        DOCUMENTCONVERTERSERVICE_WSDL_LOCATION = url;
    }

    public DocumentConverterService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DocumentConverterService_Service() {
        super(DOCUMENTCONVERTERSERVICE_WSDL_LOCATION, new QName("http://tempuri.org/", "DocumentConverterService"));
    }

    /**
     * 
     * @return
     *     returns DocumentConverterService
     */
    @WebEndpoint(name = "BasicHttpBinding_DocumentConverterService")
    public DocumentConverterService getBasicHttpBindingDocumentConverterService() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_DocumentConverterService"), DocumentConverterService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DocumentConverterService
     */
    @WebEndpoint(name = "BasicHttpBinding_DocumentConverterService")
    public DocumentConverterService getBasicHttpBindingDocumentConverterService(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_DocumentConverterService"), DocumentConverterService.class, features);
    }

}
