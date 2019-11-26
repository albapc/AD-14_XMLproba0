package xmlproba0;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

/**
 *
 * @author Alba
 */
public class XMLproba0 {

    public static void main(String[] args) throws IOException, XMLStreamException {
        XMLOutputFactory xof = XMLOutputFactory.newInstance();
        
        XMLStreamWriter xsw = xof.createXMLStreamWriter(new FileWriter("autores.xml"));
        
        xsw.writeStartDocument("1.0"); //escribe a declaracion XML coa Version especificada
        xsw.writeStartElement("autores"); //escribe o tag de inicio de un elemento
        xsw.writeStartElement("autor");
        xsw.writeAttribute("codigo", "a1"); //escribe un atributo para o elemento actual
        xsw.writeStartElement("nome");
        xsw.writeCharacters("Alexandre Dumas");
        xsw.writeEndElement();
        xsw.writeStartElement("titulo");
        xsw.writeCharacters("El conde de montecristo");
        xsw.writeEndElement();
        xsw.writeStartElement("titulo");
        xsw.writeCharacters("Los miserables");
        xsw.writeEndElement();
        xsw.writeEndElement();
        xsw.writeStartElement("autor");
        xsw.writeAttribute("codigo", "a2");
        xsw.writeStartElement("nome");
        xsw.writeCharacters("Fiodor Dostoyevski");
        xsw.writeEndElement();
        xsw.writeStartElement("titulo");
        xsw.writeCharacters("El idiota");
        xsw.writeEndElement();
        xsw.writeStartElement("titulo");
        xsw.writeCharacters("Noches blancas");
        xsw.writeEndElement();
        xsw.writeEndElement();
        xsw.writeEndElement();
//        xsw.flush();
        xsw.close();
        
        
        //flujo de lectura
//        XMLEventReader xer = XMLInputFactory.newInstance().createXMLEventReader("autores.xml", new FileInputStream("autores.xml"));
//        
        //lectura
//        while(xer.hasNext()) {
//            System.out.println(xer.nextEvent().toString());
//        }
//        xer.close();
    }
    
}
