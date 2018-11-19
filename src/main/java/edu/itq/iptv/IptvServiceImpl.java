/**
 * IptvServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package edu.itq.iptv;

import edu.itq.iptv.business.BusinessLogic;
import iptv.itq.edu.RequestIptvProvDefDocument;
import iptv.itq.edu.ResponseIptvProvDefDocument;
import iptv.itq.edu.ResponseIptvProvDefDocument.ResponseIptvProvDef;

/**
 * IptvServiceSkeleton java skeleton for the axisService
 */
public class IptvServiceImpl extends IptvProveedorDefinicionServiceSkeleton {

    private BusinessLogic businessLogic;

    public ResponseIptvProvDefDocument iptvOperation(
            RequestIptvProvDefDocument requestIptv) {
        ResponseIptvProvDefDocument doc = ResponseIptvProvDefDocument.Factory
                .newInstance();
        ResponseIptvProvDef resp = doc.addNewResponseIptvProvDef();

        // Obtain parameters from request...
        int idSolicitud = requestIptv.getRequestIptvProvDef().getIdSolicitud();

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
