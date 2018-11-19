/*
 * An XML document type.
 * Localname: responseIptvProvDef
 * Namespace: edu.itq.iptv
 * Java type: iptv.itq.edu.ResponseIptvProvDefDocument
 *
 * Automatically generated - do not modify.
 */
package iptv.itq.edu;


/**
 * A document containing one responseIptvProvDef(@edu.itq.iptv) element.
 *
 * This is a complex type.
 */
public interface ResponseIptvProvDefDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResponseIptvProvDefDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCF29C4840D117B20784FC67ED475D5BC").resolveHandle("responseiptvprovdeffcb0doctype");
    
    /**
     * Gets the "responseIptvProvDef" element
     */
    iptv.itq.edu.ResponseIptvProvDefDocument.ResponseIptvProvDef getResponseIptvProvDef();
    
    /**
     * Sets the "responseIptvProvDef" element
     */
    void setResponseIptvProvDef(iptv.itq.edu.ResponseIptvProvDefDocument.ResponseIptvProvDef responseIptvProvDef);
    
    /**
     * Appends and returns a new empty "responseIptvProvDef" element
     */
    iptv.itq.edu.ResponseIptvProvDefDocument.ResponseIptvProvDef addNewResponseIptvProvDef();
    
    /**
     * An XML responseIptvProvDef(@edu.itq.iptv).
     *
     * This is a complex type.
     */
    public interface ResponseIptvProvDef extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResponseIptvProvDef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCF29C4840D117B20784FC67ED475D5BC").resolveHandle("responseiptvprovdef40d2elemtype");
        
        /**
         * Gets the "respuesta" element
         */
        java.lang.String getRespuesta();
        
        /**
         * Gets (as xml) the "respuesta" element
         */
        org.apache.xmlbeans.XmlString xgetRespuesta();
        
        /**
         * Sets the "respuesta" element
         */
        void setRespuesta(java.lang.String respuesta);
        
        /**
         * Sets (as xml) the "respuesta" element
         */
        void xsetRespuesta(org.apache.xmlbeans.XmlString respuesta);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static iptv.itq.edu.ResponseIptvProvDefDocument.ResponseIptvProvDef newInstance() {
              return (iptv.itq.edu.ResponseIptvProvDefDocument.ResponseIptvProvDef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static iptv.itq.edu.ResponseIptvProvDefDocument.ResponseIptvProvDef newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (iptv.itq.edu.ResponseIptvProvDefDocument.ResponseIptvProvDef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static iptv.itq.edu.ResponseIptvProvDefDocument newInstance() {
          return (iptv.itq.edu.ResponseIptvProvDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static iptv.itq.edu.ResponseIptvProvDefDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (iptv.itq.edu.ResponseIptvProvDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static iptv.itq.edu.ResponseIptvProvDefDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (iptv.itq.edu.ResponseIptvProvDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static iptv.itq.edu.ResponseIptvProvDefDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (iptv.itq.edu.ResponseIptvProvDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static iptv.itq.edu.ResponseIptvProvDefDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (iptv.itq.edu.ResponseIptvProvDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static iptv.itq.edu.ResponseIptvProvDefDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (iptv.itq.edu.ResponseIptvProvDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static iptv.itq.edu.ResponseIptvProvDefDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (iptv.itq.edu.ResponseIptvProvDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static iptv.itq.edu.ResponseIptvProvDefDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (iptv.itq.edu.ResponseIptvProvDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static iptv.itq.edu.ResponseIptvProvDefDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (iptv.itq.edu.ResponseIptvProvDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static iptv.itq.edu.ResponseIptvProvDefDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (iptv.itq.edu.ResponseIptvProvDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static iptv.itq.edu.ResponseIptvProvDefDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (iptv.itq.edu.ResponseIptvProvDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static iptv.itq.edu.ResponseIptvProvDefDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (iptv.itq.edu.ResponseIptvProvDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static iptv.itq.edu.ResponseIptvProvDefDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (iptv.itq.edu.ResponseIptvProvDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static iptv.itq.edu.ResponseIptvProvDefDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (iptv.itq.edu.ResponseIptvProvDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static iptv.itq.edu.ResponseIptvProvDefDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (iptv.itq.edu.ResponseIptvProvDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static iptv.itq.edu.ResponseIptvProvDefDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (iptv.itq.edu.ResponseIptvProvDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static iptv.itq.edu.ResponseIptvProvDefDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (iptv.itq.edu.ResponseIptvProvDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static iptv.itq.edu.ResponseIptvProvDefDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (iptv.itq.edu.ResponseIptvProvDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
