/*
 * An XML document type.
 * Localname: responseIptv
 * Namespace: edu.itq.iptv
 * Java type: iptv.itq.edu.ResponseIptvDocument
 *
 * Automatically generated - do not modify.
 */
package iptv.itq.edu;


/**
 * A document containing one responseIptv(@edu.itq.iptv) element.
 *
 * This is a complex type.
 */
public interface ResponseIptvDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResponseIptvDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s94C229E8B5494768EAFDF725AD6911A6").resolveHandle("responseiptv69c6doctype");
    
    /**
     * Gets the "responseIptv" element
     */
    iptv.itq.edu.ResponseIptvDocument.ResponseIptv getResponseIptv();
    
    /**
     * Sets the "responseIptv" element
     */
    void setResponseIptv(iptv.itq.edu.ResponseIptvDocument.ResponseIptv responseIptv);
    
    /**
     * Appends and returns a new empty "responseIptv" element
     */
    iptv.itq.edu.ResponseIptvDocument.ResponseIptv addNewResponseIptv();
    
    /**
     * An XML responseIptv(@edu.itq.iptv).
     *
     * This is a complex type.
     */
    public interface ResponseIptv extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResponseIptv.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s94C229E8B5494768EAFDF725AD6911A6").resolveHandle("responseiptv472celemtype");
        
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
            public static iptv.itq.edu.ResponseIptvDocument.ResponseIptv newInstance() {
              return (iptv.itq.edu.ResponseIptvDocument.ResponseIptv) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static iptv.itq.edu.ResponseIptvDocument.ResponseIptv newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (iptv.itq.edu.ResponseIptvDocument.ResponseIptv) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static iptv.itq.edu.ResponseIptvDocument newInstance() {
          return (iptv.itq.edu.ResponseIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static iptv.itq.edu.ResponseIptvDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (iptv.itq.edu.ResponseIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static iptv.itq.edu.ResponseIptvDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (iptv.itq.edu.ResponseIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static iptv.itq.edu.ResponseIptvDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (iptv.itq.edu.ResponseIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static iptv.itq.edu.ResponseIptvDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (iptv.itq.edu.ResponseIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static iptv.itq.edu.ResponseIptvDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (iptv.itq.edu.ResponseIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static iptv.itq.edu.ResponseIptvDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (iptv.itq.edu.ResponseIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static iptv.itq.edu.ResponseIptvDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (iptv.itq.edu.ResponseIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static iptv.itq.edu.ResponseIptvDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (iptv.itq.edu.ResponseIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static iptv.itq.edu.ResponseIptvDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (iptv.itq.edu.ResponseIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static iptv.itq.edu.ResponseIptvDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (iptv.itq.edu.ResponseIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static iptv.itq.edu.ResponseIptvDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (iptv.itq.edu.ResponseIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static iptv.itq.edu.ResponseIptvDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (iptv.itq.edu.ResponseIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static iptv.itq.edu.ResponseIptvDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (iptv.itq.edu.ResponseIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static iptv.itq.edu.ResponseIptvDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (iptv.itq.edu.ResponseIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static iptv.itq.edu.ResponseIptvDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (iptv.itq.edu.ResponseIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static iptv.itq.edu.ResponseIptvDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (iptv.itq.edu.ResponseIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static iptv.itq.edu.ResponseIptvDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (iptv.itq.edu.ResponseIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
