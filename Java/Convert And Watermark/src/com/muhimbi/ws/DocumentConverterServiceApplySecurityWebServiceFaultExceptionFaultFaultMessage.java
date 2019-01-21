
package com.muhimbi.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "WebServiceFaultException", targetNamespace = "http://types.muhimbi.com/2009/10/06")
public class DocumentConverterServiceApplySecurityWebServiceFaultExceptionFaultFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private WebServiceFaultException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public DocumentConverterServiceApplySecurityWebServiceFaultExceptionFaultFaultMessage(String message, WebServiceFaultException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public DocumentConverterServiceApplySecurityWebServiceFaultExceptionFaultFaultMessage(String message, WebServiceFaultException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.muhimbi.ws.WebServiceFaultException
     */
    public WebServiceFaultException getFaultInfo() {
        return faultInfo;
    }

}
