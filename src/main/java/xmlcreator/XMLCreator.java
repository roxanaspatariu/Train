package xmlcreator;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

/**
 * Created by V3790147 on 5/5/2016.
 */
public class XMLCreator {

    public void createXML()  {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();

            Element root = document.createElement("CONFIGURATION");
            document.appendChild(root);
            Element browser = document.createElement("BROWSE");
            browser.appendChild(document.createTextNode("chrome"));
            root.appendChild(browser);
            Node base = document.createElement("BASE");
            base.appendChild(document.createTextNode("httP:\\"));
            root.appendChild(base);

            Node baser = document.createElement("BASER");
            baser.appendChild(document.createTextNode("httPR:\\"));
            root.appendChild(baser);

            root.appendChild((document.createElement("P"))).appendChild(document.createTextNode("Mozzila"));

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File("browser.xml"));
            transformer.transform(source, result);
        } catch (ParserConfigurationException p) {
            p.printStackTrace();
        } catch (TransformerException t) {
            t.printStackTrace();
        }
    }

}
