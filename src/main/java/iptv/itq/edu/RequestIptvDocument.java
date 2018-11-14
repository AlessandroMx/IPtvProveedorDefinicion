/*
 * An XML document type.
 * Localname: requestIptv
 * Namespace: edu.itq.iptv
 * Java type: iptv.itq.edu.RequestIptvDocument
 *
 * Automatically generated - do not modify.
 */
package iptv.itq.edu;


/**
 * A document containing one requestIptv(@edu.itq.iptv) element.
 *
 * This is a complex type.
 */
public interface RequestIptvDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RequestIptvDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s94C229E8B5494768EAFDF725AD6911A6").resolveHandle("requestiptv5d0adoctype");
    
    /**
     * Gets the "requestIptv" element
     */
    iptv.itq.edu.RequestIptvDocument.RequestIptv getRequestIptv();
    
    /**
     * Sets the "requestIptv" element
     */
    void setRequestIptv(iptv.itq.edu.RequestIptvDocument.RequestIptv requestIptv);
    
    /**
     * Appends and returns a new empty "requestIptv" element
     */
    iptv.itq.edu.RequestIptvDocument.RequestIptv addNewRequestIptv();
    
    /**
     * An XML requestIptv(@edu.itq.iptv).
     *
     * This is a complex type.
     */
    public interface RequestIptv extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RequestIptv.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s94C229E8B5494768EAFDF725AD6911A6").resolveHandle("requestiptved06elemtype");
        
        /**
         * Gets the "id_solicitud" element
         */
        int getIdSolicitud();
        
        /**
         * Gets (as xml) the "id_solicitud" element
         */
        org.apache.xmlbeans.XmlInt xgetIdSolicitud();
        
        /**
         * Sets the "id_solicitud" element
         */
        void setIdSolicitud(int idSolicitud);
        
        /**
         * Sets (as xml) the "id_solicitud" element
         */
        void xsetIdSolicitud(org.apache.xmlbeans.XmlInt idSolicitud);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static iptv.itq.edu.RequestIptvDocument.RequestIptv newInstance() {
              return (iptv.itq.edu.RequestIptvDocument.RequestIptv) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static iptv.itq.edu.RequestIptvDocument.RequestIptv newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (iptv.itq.edu.RequestIptvDocument.RequestIptv) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static iptv.itq.edu.RequestIptvDocument newInstance() {
          return (iptv.itq.edu.RequestIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static iptv.itq.edu.RequestIptvDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (iptv.itq.edu.RequestIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static iptv.itq.edu.RequestIptvDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (iptv.itq.edu.RequestIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static iptv.itq.edu.RequestIptvDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (iptv.itq.edu.RequestIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static iptv.itq.edu.RequestIptvDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (iptv.itq.edu.RequestIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static iptv.itq.edu.RequestIptvDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (iptv.itq.edu.RequestIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static iptv.itq.edu.RequestIptvDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (iptv.itq.edu.RequestIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static iptv.itq.edu.RequestIptvDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (iptv.itq.edu.RequestIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static iptv.itq.edu.RequestIptvDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (iptv.itq.edu.RequestIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static iptv.itq.edu.RequestIptvDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (iptv.itq.edu.RequestIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static iptv.itq.edu.RequestIptvDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (iptv.itq.edu.RequestIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static iptv.itq.edu.RequestIptvDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (iptv.itq.edu.RequestIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static iptv.itq.edu.RequestIptvDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (iptv.itq.edu.RequestIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static iptv.itq.edu.RequestIptvDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (iptv.itq.edu.RequestIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static iptv.itq.edu.RequestIptvDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (iptv.itq.edu.RequestIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static iptv.itq.edu.RequestIptvDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (iptv.itq.edu.RequestIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static iptv.itq.edu.RequestIptvDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (iptv.itq.edu.RequestIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static iptv.itq.edu.RequestIptvDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (iptv.itq.edu.RequestIptvDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
