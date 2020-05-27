
package br.com.caelum.estoque.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
<<<<<<< HEAD
=======
import javax.xml.bind.annotation.XmlSchemaType;
>>>>>>> 07bdbc65ec9dfcec1ba0bddcf2c69451e15983d7
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de filtro complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="filtro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
<<<<<<< HEAD
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
=======
 *         &lt;element name="tipo" type="{http://ws.estoque.caelum.com.br/}tipoItem" minOccurs="0"/>
>>>>>>> 07bdbc65ec9dfcec1ba0bddcf2c69451e15983d7
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filtro", propOrder = {
    "nome",
    "tipo"
})
public class Filtro {

    protected String nome;
<<<<<<< HEAD
    protected String tipo;
=======
    @XmlSchemaType(name = "string")
    protected TipoItem tipo;
>>>>>>> 07bdbc65ec9dfcec1ba0bddcf2c69451e15983d7

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade tipo.
     * 
     * @return
     *     possible object is
<<<<<<< HEAD
     *     {@link String }
     *     
     */
    public String getTipo() {
=======
     *     {@link TipoItem }
     *     
     */
    public TipoItem getTipo() {
>>>>>>> 07bdbc65ec9dfcec1ba0bddcf2c69451e15983d7
        return tipo;
    }

    /**
     * Define o valor da propriedade tipo.
     * 
     * @param value
     *     allowed object is
<<<<<<< HEAD
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
=======
     *     {@link TipoItem }
     *     
     */
    public void setTipo(TipoItem value) {
>>>>>>> 07bdbc65ec9dfcec1ba0bddcf2c69451e15983d7
        this.tipo = value;
    }

}
