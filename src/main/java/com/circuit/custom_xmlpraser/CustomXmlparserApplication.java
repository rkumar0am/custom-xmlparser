package com.circuit.custom_xmlpraser;

import java.io.StringReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.circuit.custom_xmlpraser.pojo.AppHeader;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

@SpringBootApplication
public class CustomXmlparserApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomXmlparserApplication.class, args);

		String xmlString = "<Envelope>" + "    <AppHeader>" + "        <crtdInfo><id>CIRCT001XXX</id></crtdInfo>"
				+ "        <debtInfo> <id>CIRCT001ISF</id></debtInfo>" + "    </AppHeader>" + "    <Document>"
				+ " 	 	<infoLocation>India</infoLocation>" + "    	<firstName>Ramkumar</firstName>"
				+ "    </Document>" + "</Envelope>";

		customXMLParsingToPojo(xmlString);
	}

	public static void customXMLParsingToPojo(String xmlString) {

		String sTag = "<AppHeader>";
		String eTag = "</AppHeader>";

		String appHeaderString = xmlString.substring(xmlString.indexOf(sTag),
				xmlString.lastIndexOf(eTag) + eTag.length());

		JAXBContext jaxbContext;
		
		try {
			
			jaxbContext = JAXBContext.newInstance(AppHeader.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			StringReader reader = new StringReader(appHeaderString);
			AppHeader appHeader = (AppHeader) jaxbUnmarshaller.unmarshal(reader);
			
			System.out.println("CreditInfo: " + appHeader.getCrtdInfo().getId() + ", DebitInfo: " + appHeader.getDebtInfo().getId());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
