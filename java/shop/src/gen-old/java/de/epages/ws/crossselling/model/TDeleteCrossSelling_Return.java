/**
 * TDeleteCrossSelling_Return.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.crossselling.model;


/**
 * return value of a delete() call.
 *       Product and TargetProduct will be always returned.
 *       the Error element will be returned in case of error.
 *       all other elements will be returned if no error has occured.
 */
public class TDeleteCrossSelling_Return  implements java.io.Serializable {
    /* product object path */
    private java.lang.String product;

    /* target product object path (use wildcard * to delete all related
     * target products belong actual type) */
    private java.lang.String targetProduct;

    /* cross selling type could be 'Accessory', 'ProductComparison'
     * or 'CrossSelling' */
    private java.lang.String type;

    /* is cross selling deleteed (target product assigned to product) */
    private java.lang.Boolean deleted;

    /* error object (see epagestypes:TError) */
    private de.epages.ws.common.model.TError error;

    public TDeleteCrossSelling_Return() {
    }

    public TDeleteCrossSelling_Return(
           java.lang.String product,
           java.lang.String targetProduct,
           java.lang.String type,
           java.lang.Boolean deleted,
           de.epages.ws.common.model.TError error) {
           this.product = product;
           this.targetProduct = targetProduct;
           this.type = type;
           this.deleted = deleted;
           this.error = error;
    }


    /**
     * Gets the product value for this TDeleteCrossSelling_Return.
     * 
     * @return product   * product object path
     */
    public java.lang.String getProduct() {
        return product;
    }


    /**
     * Sets the product value for this TDeleteCrossSelling_Return.
     * 
     * @param product   * product object path
     */
    public void setProduct(java.lang.String product) {
        this.product = product;
    }


    /**
     * Gets the targetProduct value for this TDeleteCrossSelling_Return.
     * 
     * @return targetProduct   * target product object path (use wildcard * to delete all related
     * target products belong actual type)
     */
    public java.lang.String getTargetProduct() {
        return targetProduct;
    }


    /**
     * Sets the targetProduct value for this TDeleteCrossSelling_Return.
     * 
     * @param targetProduct   * target product object path (use wildcard * to delete all related
     * target products belong actual type)
     */
    public void setTargetProduct(java.lang.String targetProduct) {
        this.targetProduct = targetProduct;
    }


    /**
     * Gets the type value for this TDeleteCrossSelling_Return.
     * 
     * @return type   * cross selling type could be 'Accessory', 'ProductComparison'
     * or 'CrossSelling'
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this TDeleteCrossSelling_Return.
     * 
     * @param type   * cross selling type could be 'Accessory', 'ProductComparison'
     * or 'CrossSelling'
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the deleted value for this TDeleteCrossSelling_Return.
     * 
     * @return deleted   * is cross selling deleteed (target product assigned to product)
     */
    public java.lang.Boolean getDeleted() {
        return deleted;
    }


    /**
     * Sets the deleted value for this TDeleteCrossSelling_Return.
     * 
     * @param deleted   * is cross selling deleteed (target product assigned to product)
     */
    public void setDeleted(java.lang.Boolean deleted) {
        this.deleted = deleted;
    }


    /**
     * Gets the error value for this TDeleteCrossSelling_Return.
     * 
     * @return error   * error object (see epagestypes:TError)
     */
    public de.epages.ws.common.model.TError getError() {
        return error;
    }


    /**
     * Sets the error value for this TDeleteCrossSelling_Return.
     * 
     * @param error   * error object (see epagestypes:TError)
     */
    public void setError(de.epages.ws.common.model.TError error) {
        this.error = error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TDeleteCrossSelling_Return)) return false;
        TDeleteCrossSelling_Return other = (TDeleteCrossSelling_Return) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.targetProduct==null && other.getTargetProduct()==null) || 
             (this.targetProduct!=null &&
              this.targetProduct.equals(other.getTargetProduct()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.deleted==null && other.getDeleted()==null) || 
             (this.deleted!=null &&
              this.deleted.equals(other.getDeleted()))) &&
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
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getTargetProduct() != null) {
            _hashCode += getTargetProduct().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getDeleted() != null) {
            _hashCode += getDeleted().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TDeleteCrossSelling_Return.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingTypes/2006/05", "TDeleteCrossSelling_Return"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TargetProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
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
