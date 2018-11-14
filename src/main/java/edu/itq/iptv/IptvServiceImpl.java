/**
 * IptvServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package edu.itq.iptv;

import edu.itq.iptv.business.BusinessLogic;
import iptv.itq.edu.RequestIptvDocument;
import iptv.itq.edu.ResponseIptvDocument;
import iptv.itq.edu.ResponseIptvDocument.ResponseIptv;

/**
 * IptvServiceSkeleton java skeleton for the axisService
 */
public class IptvServiceImpl extends IptvProveedorDefinicionServiceSkeleton {

    private BusinessLogic businessLogic;

    public ResponseIptvDocument iptvOperation(RequestIptvDocument requestIptv) {
        ResponseIptvDocument doc = ResponseIptvDocument.Factory.newInstance();
        ResponseIptv resp = doc.addNewResponseIptv();
        
        // Obtain parameters from request...
        int idSolicitud = requestIptv.getRequestIptv().getIdSolicitud();

        // Call business logic...
        String response = businessLogic.defineService(idSolicitud);

        resp.setRespuesta(response);
        return doc;
    }

    /**
     * @param businessLogic the businessLogic to set
     */
    public void setBusinessLogic(BusinessLogic businessLogic) {
        this.businessLogic = businessLogic;
    }

}
