
package clientconsole8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para add complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="add">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="j" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="k" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "add", propOrder = {
    "j",
    "k"
})
public class Add {

    protected int j;
    protected int k;

    /**
     * Obtiene el valor de la propiedad j.
     * 
     */
    public int getJ() {
        return j;
    }

    /**
     * Define el valor de la propiedad j.
     * 
     */
    public void setJ(int value) {
        this.j = value;
    }

    /**
     * Obtiene el valor de la propiedad k.
     * 
     */
    public int getK() {
        return k;
    }

    /**
     * Define el valor de la propiedad k.
     * 
     */
    public void setK(int value) {
        this.k = value;
    }

}
