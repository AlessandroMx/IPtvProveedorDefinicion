/*
 * An XML document type.
 * Localname: requestIptv
 * Namespace: edu.itq.iptv
 * Java type: iptv.itq.edu.RequestIptvDocument
 *
 * Automatically generated - do not modify.
 */
package iptv.itq.edu.impl;
/**
 * A document containing one requestIptv(@edu.itq.iptv) element.
 *
 * This is a complex type.
 */
public class RequestIptvDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements iptv.itq.edu.RequestIptvDocument
{
    private static final long serialVersionUID = 1L;
    
    public RequestIptvDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUESTIPTV$0 = 
        new javax.xml.namespace.QName("edu.itq.iptv", "requestIptv");
    
    
    /**
     * Gets the "requestIptv" element
     */
    public iptv.itq.edu.RequestIptvDocument.RequestIptv getRequestIptv()
    {
        synchronized (monitor())
        {
            check_orphaned();
            iptv.itq.edu.RequestIptvDocument.RequestIptv target = null;
            target = (iptv.itq.edu.RequestIptvDocument.RequestIptv)get_store().find_element_user(REQUESTIPTV$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "requestIptv" element
     */
    public void setRequestIptv(iptv.itq.edu.RequestIptvDocument.RequestIptv requestIptv)
    {
        generatedSetterHelperImpl(requestIptv, REQUESTIPTV$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "requestIptv" element
     */
    public iptv.itq.edu.RequestIptvDocument.RequestIptv addNewRequestIptv()
    {
        synchronized (monitor())
        {
            check_orphaned();
            iptv.itq.edu.RequestIptvDocument.RequestIptv target = null;
            target = (iptv.itq.edu.RequestIptvDocument.RequestIptv)get_store().add_element_user(REQUESTIPTV$0);
            return target;
        }
    }
    /**
     * An XML requestIptv(@edu.itq.iptv).
     *
     * This is a complex type.
     */
    public static class RequestIptvImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements iptv.itq.edu.RequestIptvDocument.RequestIptv
    {
        private static final long serialVersionUID = 1L;
        
        public RequestIptvImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDSOLICITUD$0 = 
            new javax.xml.namespace.QName("edu.itq.iptv", "id_solicitud");
        
        
        /**
         * Gets the "id_solicitud" element
         */
        public int getIdSolicitud()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDSOLICITUD$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "id_solicitud" element
         */
        public org.apache.xmlbeans.XmlInt xgetIdSolicitud()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDSOLICITUD$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "id_solicitud" element
         */
        public void setIdSolicitud(int idSolicitud)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDSOLICITUD$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDSOLICITUD$0);
                }
                target.setIntValue(idSolicitud);
            }
        }
        
        /**
         * Sets (as xml) the "id_solicitud" element
         */
        public void xsetIdSolicitud(org.apache.xmlbeans.XmlInt idSolicitud)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDSOLICITUD$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(IDSOLICITUD$0);
                }
                target.set(idSolicitud);
            }
        }
    }
}
