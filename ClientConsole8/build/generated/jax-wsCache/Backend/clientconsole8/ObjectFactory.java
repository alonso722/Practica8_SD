
package clientconsole8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clientconsole8 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ComprarResponse_QNAME = new QName("http://t8felix.mycompany.com/", "comprarResponse");
    private final static QName _PagarResponse_QNAME = new QName("http://t8felix.mycompany.com/", "pagarResponse");
    private final static QName _Comprar_QNAME = new QName("http://t8felix.mycompany.com/", "comprar");
    private final static QName _Add_QNAME = new QName("http://t8felix.mycompany.com/", "add");
    private final static QName _Pagar_QNAME = new QName("http://t8felix.mycompany.com/", "pagar");
    private final static QName _AddResponse_QNAME = new QName("http://t8felix.mycompany.com/", "addResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clientconsole8
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link Pagar }
     * 
     */
    public Pagar createPagar() {
        return new Pagar();
    }

    /**
     * Create an instance of {@link Comprar }
     * 
     */
    public Comprar createComprar() {
        return new Comprar();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link ComprarResponse }
     * 
     */
    public ComprarResponse createComprarResponse() {
        return new ComprarResponse();
    }

    /**
     * Create an instance of {@link PagarResponse }
     * 
     */
    public PagarResponse createPagarResponse() {
        return new PagarResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComprarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://t8felix.mycompany.com/", name = "comprarResponse")
    public JAXBElement<ComprarResponse> createComprarResponse(ComprarResponse value) {
        return new JAXBElement<ComprarResponse>(_ComprarResponse_QNAME, ComprarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://t8felix.mycompany.com/", name = "pagarResponse")
    public JAXBElement<PagarResponse> createPagarResponse(PagarResponse value) {
        return new JAXBElement<PagarResponse>(_PagarResponse_QNAME, PagarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Comprar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://t8felix.mycompany.com/", name = "comprar")
    public JAXBElement<Comprar> createComprar(Comprar value) {
        return new JAXBElement<Comprar>(_Comprar_QNAME, Comprar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://t8felix.mycompany.com/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pagar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://t8felix.mycompany.com/", name = "pagar")
    public JAXBElement<Pagar> createPagar(Pagar value) {
        return new JAXBElement<Pagar>(_Pagar_QNAME, Pagar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://t8felix.mycompany.com/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

}
