/*
 * An XML document type.
 * Localname: requestIptvProvDef
 * Namespace: edu.itq.iptv
 * Java type: iptv.itq.edu.RequestIptvProvDefDocument
 *
 * Automatically generated - do not modify.
 */
package iptv.itq.edu.impl;
/**
 * A document containing one requestIptvProvDef(@edu.itq.iptv) element.
 *
 * This is a complex type.
 */
public class RequestIptvProvDefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements iptv.itq.edu.RequestIptvProvDefDocument
{
    private static final long serialVersionUID = 1L;
    
    public RequestIptvProvDefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUESTIPTVPROVDEF$0 = 
        new javax.xml.namespace.QName("edu.itq.iptv", "requestIptvProvDef");
    
    
    /**
     * Gets the "requestIptvProvDef" element
     */
    public iptv.itq.edu.RequestIptvProvDefDocument.RequestIptvProvDef getRequestIptvProvDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            iptv.itq.edu.RequestIptvProvDefDocument.RequestIptvProvDef target = null;
            target = (iptv.itq.edu.RequestIptvProvDefDocument.RequestIptvProvDef)get_store().find_element_user(REQUESTIPTVPROVDEF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "requestIptvProvDef" element
     */
    public void setRequestIptvProvDef(iptv.itq.edu.RequestIptvProvDefDocument.RequestIptvProvDef requestIptvProvDef)
    {
        generatedSetterHelperImpl(requestIptvProvDef, REQUESTIPTVPROVDEF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "requestIptvProvDef" element
     */
    public iptv.itq.edu.RequestIptvProvDefDocument.RequestIptvProvDef addNewRequestIptvProvDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            iptv.itq.edu.RequestIptvProvDefDocument.RequestIptvProvDef target = null;
            target = (iptv.itq.edu.RequestIptvProvDefDocument.RequestIptvProvDef)get_store().add_element_user(REQUESTIPTVPROVDEF$0);
            return target;
        }
    }
    /**
     * An XML requestIptvProvDef(@edu.itq.iptv).
     *
     * This is a complex type.
     */
    public static class RequestIptvProvDefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements iptv.itq.edu.RequestIptvProvDefDocument.RequestIptvProvDef
    {
        private static final long serialVersionUID = 1L;
        
        public RequestIptvProvDefImpl(org.apache.xmlbeans.SchemaType sType)
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
