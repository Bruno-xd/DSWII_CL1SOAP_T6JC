//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.09.29 a las 09:45:05 PM COT 
//


package com.examen.dswll_cl1soap_t6jc.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paciente" type="{http://www.DSWll_CL1SOAP_T6JC.examen.com/ws/objects}pacientews"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "paciente"
})
@XmlRootElement(name = "postPacienteResponse")
public class PostPacienteResponse {

    @XmlElement(required = true)
    protected Pacientews paciente;

    /**
     * Obtiene el valor de la propiedad paciente.
     * 
     * @return
     *     possible object is
     *     {@link Pacientews }
     *     
     */
    public Pacientews getPaciente() {
        return paciente;
    }

    /**
     * Define el valor de la propiedad paciente.
     * 
     * @param value
     *     allowed object is
     *     {@link Pacientews }
     *     
     */
    public void setPaciente(Pacientews value) {
        this.paciente = value;
    }

}
