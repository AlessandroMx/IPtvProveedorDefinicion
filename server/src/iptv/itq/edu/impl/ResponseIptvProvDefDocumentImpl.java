/*
 * An XML document type.
 * Localname: responseIptvProvDef
 * Namespace: edu.itq.iptv
 * Java type: iptv.itq.edu.ResponseIptvProvDefDocument
 *
 * Automatically generated - do not modify.
 */
package iptv.itq.edu.impl;
/**
 * A document containing one responseIptvProvDef(@edu.itq.iptv) element.
 *
 * This is a complex type.
 */
public class ResponseIptvProvDefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements iptv.itq.edu.ResponseIptvProvDefDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResponseIptvProvDefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESPONSEIPTVPROVDEF$0 = 
        new javax.xml.namespace.QName("edu.itq.iptv", "responseIptvProvDef");
    
    
    /**
     * Gets the "responseIptvProvDef" element
     */
    public iptv.itq.edu.ResponseIptvProvDefDocument.ResponseIptvProvDef getResponseIptvProvDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            iptv.itq.edu.ResponseIptvProvDefDocument.ResponseIptvProvDef target = null;
            target = (iptv.itq.edu.ResponseIptvProvDefDocument.ResponseIptvProvDef)get_store().find_element_user(RESPONSEIPTVPROVDEF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "responseIptvProvDef" element
     */
    public void setResponseIptvProvDef(iptv.itq.edu.ResponseIptvProvDefDocument.ResponseIptvProvDef responseIptvProvDef)
    {
        generatedSetterHelperImpl(responseIptvProvDef, RESPONSEIPTVPROVDEF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "responseIptvProvDef" element
     */
    public iptv.itq.edu.ResponseIptvProvDefDocument.ResponseIptvProvDef addNewResponseIptvProvDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            iptv.itq.edu.ResponseIptvProvDefDocument.ResponseIptvProvDef target = null;
            target = (iptv.itq.edu.ResponseIptvProvDefDocument.ResponseIptvProvDef)get_store().add_element_user(RESPONSEIPTVPROVDEF$0);
            return target;
        }
    }
    /**
     * An XML responseIptvProvDef(@edu.itq.iptv).
     *
     * This is a complex type.
     */
    public static class ResponseIptvProvDefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements iptv.itq.edu.ResponseIptvProvDefDocument.ResponseIptvProvDef
    {
        private static final long serialVersionUID = 1L;
        
        public ResponseIptvProvDefImpl(org.apache.xmlbeans.SchemaType sType)
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
