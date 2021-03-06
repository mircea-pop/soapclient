/**
 * TUploadScale_Return.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.productimage.model;


/**
 * the output structure of an uploadscale() call
 */
public class TUploadScale_Return  implements java.io.Serializable {
    private java.lang.Boolean writeOK;

    private java.lang.Boolean scaleOK;

    private java.lang.String file;

    private de.epages.ws.common.model.TError error;

    public TUploadScale_Return() {
    }

    public TUploadScale_Return(
           java.lang.Boolean writeOK,
           java.lang.Boolean scaleOK,
           java.lang.String file,
           de.epages.ws.common.model.TError error) {
           this.writeOK = writeOK;
           this.scaleOK = scaleOK;
           this.file = file;
           this.error = error;
    }


    /**
     * Gets the writeOK value for this TUploadScale_Return.
     * 
     * @return writeOK
     */
    public java.lang.Boolean getWriteOK() {
        return writeOK;
    }


    /**
     * Sets the writeOK value for this TUploadScale_Return.
     * 
     * @param writeOK
     */
    public void setWriteOK(java.lang.Boolean writeOK) {
        this.writeOK = writeOK;
    }


    /**
     * Gets the scaleOK value for this TUploadScale_Return.
     * 
     * @return scaleOK
     */
    public java.lang.Boolean getScaleOK() {
        return scaleOK;
    }


    /**
     * Sets the scaleOK value for this TUploadScale_Return.
     * 
     * @param scaleOK
     */
    public void setScaleOK(java.lang.Boolean scaleOK) {
        this.scaleOK = scaleOK;
    }


    /**
     * Gets the file value for this TUploadScale_Return.
     * 
     * @return file
     */
    public java.lang.String getFile() {
        return file;
    }


    /**
     * Sets the file value for this TUploadScale_Return.
     * 
     * @param file
     */
    public void setFile(java.lang.String file) {
        this.file = file;
    }


    /**
     * Gets the error value for this TUploadScale_Return.
     * 
     * @return error
     */
    public de.epages.ws.common.model.TError getError() {
        return error;
    }


    /**
     * Sets the error value for this TUploadScale_Return.
     * 
     * @param error
     */
    public void setError(de.epages.ws.common.model.TError error) {
        this.error = error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TUploadScale_Return)) return false;
        TUploadScale_Return other = (TUploadScale_Return) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.writeOK==null && other.getWriteOK()==null) || 
             (this.writeOK!=null &&
              this.writeOK.equals(other.getWriteOK()))) &&
            ((this.scaleOK==null && other.getScaleOK()==null) || 
             (this.scaleOK!=null &&
              this.scaleOK.equals(other.getScaleOK()))) &&
            ((this.file==null && other.getFile()==null) || 
             (this.file!=null &&
              this.file.equals(other.getFile()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError())));
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
        if (getWriteOK() != null) {
            _hashCode += getWriteOK().hashCode();
        }
        if (getScaleOK() != null) {
            _hashCode += getScaleOK().hashCode();
        }
        if (getFile() != null) {
            _hashCode += getFile().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TUploadScale_Return.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductImageTypes/2006/03", "TUploadScale_Return"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("writeOK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WriteOK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scaleOK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ScaleOK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file");
        elemField.setXmlName(new javax.xml.namespace.QName("", "File"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Error"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
