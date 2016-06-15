/**
 * Disco.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.ufv.dis.discos.bean;

public class Disco  implements java.io.Serializable {
    private java.lang.String artista;

    private java.lang.String genero;

    private java.lang.String id;

    private java.lang.String soporte;

    private java.lang.String titulo;

    public Disco() {
    }

    public Disco(
           java.lang.String artista,
           java.lang.String genero,
           java.lang.String id,
           java.lang.String soporte,
           java.lang.String titulo) {
           this.artista = artista;
           this.genero = genero;
           this.id = id;
           this.soporte = soporte;
           this.titulo = titulo;
    }


    /**
     * Gets the artista value for this Disco.
     * 
     * @return artista
     */
    public java.lang.String getArtista() {
        return artista;
    }


    /**
     * Sets the artista value for this Disco.
     * 
     * @param artista
     */
    public void setArtista(java.lang.String artista) {
        this.artista = artista;
    }


    /**
     * Gets the genero value for this Disco.
     * 
     * @return genero
     */
    public java.lang.String getGenero() {
        return genero;
    }


    /**
     * Sets the genero value for this Disco.
     * 
     * @param genero
     */
    public void setGenero(java.lang.String genero) {
        this.genero = genero;
    }


    /**
     * Gets the id value for this Disco.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Disco.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the soporte value for this Disco.
     * 
     * @return soporte
     */
    public java.lang.String getSoporte() {
        return soporte;
    }


    /**
     * Sets the soporte value for this Disco.
     * 
     * @param soporte
     */
    public void setSoporte(java.lang.String soporte) {
        this.soporte = soporte;
    }


    /**
     * Gets the titulo value for this Disco.
     * 
     * @return titulo
     */
    public java.lang.String getTitulo() {
        return titulo;
    }


    /**
     * Sets the titulo value for this Disco.
     * 
     * @param titulo
     */
    public void setTitulo(java.lang.String titulo) {
        this.titulo = titulo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Disco)) return false;
        Disco other = (Disco) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.artista==null && other.getArtista()==null) || 
             (this.artista!=null &&
              this.artista.equals(other.getArtista()))) &&
            ((this.genero==null && other.getGenero()==null) || 
             (this.genero!=null &&
              this.genero.equals(other.getGenero()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.soporte==null && other.getSoporte()==null) || 
             (this.soporte!=null &&
              this.soporte.equals(other.getSoporte()))) &&
            ((this.titulo==null && other.getTitulo()==null) || 
             (this.titulo!=null &&
              this.titulo.equals(other.getTitulo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getArtista() != null) {
            _hashCode += getArtista().hashCode();
        }
        if (getGenero() != null) {
            _hashCode += getGenero().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getSoporte() != null) {
            _hashCode += getSoporte().hashCode();
        }
        if (getTitulo() != null) {
            _hashCode += getTitulo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Disco.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bean.discos.dis.ufv.es", "Disco"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("artista");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.discos.dis.ufv.es", "artista"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genero");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.discos.dis.ufv.es", "genero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.discos.dis.ufv.es", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soporte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.discos.dis.ufv.es", "soporte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titulo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.discos.dis.ufv.es", "titulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
