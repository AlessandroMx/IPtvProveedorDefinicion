/*
 * An XML document type.
 * Localname: responseIptv
 * Namespace: edu.itq.iptv
 * Java type: iptv.itq.edu.ResponseIptvDocument
 *
 * Automatically generated - do not modify.
 */
package iptv.itq.edu.impl;
/**
 * A document containing one responseIptv(@edu.itq.iptv) element.
 *
 * This is a complex type.
 */
public class ResponseIptvDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements iptv.itq.edu.ResponseIptvDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResponseIptvDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESPONSEIPTV$0 = 
        new javax.xml.namespace.QName("edu.itq.iptv", "responseIptv");
    
    
    /**
     * Gets the "responseIptv" element
     */
    public iptv.itq.edu.ResponseIptvDocument.ResponseIptv getResponseIptv()
    {
        synchronized (monitor())
        {
            check_orphaned();
            iptv.itq.edu.ResponseIptvDocument.ResponseIptv target = null;
            target = (iptv.itq.edu.ResponseIptvDocument.ResponseIptv)get_store().find_element_user(RESPONSEIPTV$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "responseIptv" element
     */
    public void setResponseIptv(iptv.itq.edu.ResponseIptvDocument.ResponseIptv responseIptv)
    {
        generatedSetterHelperImpl(responseIptv, RESPONSEIPTV$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "responseIptv" element
     */
    public iptv.itq.edu.ResponseIptvDocument.ResponseIptv addNewResponseIptv()
    {
        synchronized (monitor())
        {
            check_orphaned();
            iptv.itq.edu.ResponseIptvDocument.ResponseIptv target = null;
            target = (iptv.itq.edu.ResponseIptvDocument.ResponseIptv)get_store().add_element_user(RESPONSEIPTV$0);
            return target;
        }
    }
    /**
     * An XML responseIptv(@edu.itq.iptv).
     *
     * This is a complex type.
     */
    public static class ResponseIptvImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements iptv.itq.edu.ResponseIptvDocument.ResponseIptv
    {
        private static final long serialVersionUID = 1L;
        
        public ResponseIptvImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESPUESTA$0 = 
            new javax.xml.namespace.QName("edu.itq.iptv", "respuesta");
        
        
        /**
         * Gets the "respuesta" element
         */
        public java.lang.String getRespuesta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPUESTA$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "respuesta" element
         */
        public org.apache.xmlbeans.XmlString xgetRespuesta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPUESTA$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "respuesta" element
         */
        public void setRespuesta(java.lang.String respuesta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPUESTA$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESPUESTA$0);
                }
                target.setStringValue(respuesta);
            }
        }
        
        /**
         * Sets (as xml) the "respuesta" element
         */
        public void xsetRespuesta(org.apache.xmlbeans.XmlString respuesta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPUESTA$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESPUESTA$0);
                }
                target.set(respuesta);
            }
        }
    }
}
