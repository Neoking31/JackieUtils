package utils.ws;

import com.sun.tools.ws.WsImport;

public class WSDLParserUtility {

	public static void main(String[] args) {
		 try {
			WsImport.doMain("http://wsf.cdyne.com/WeatherWS/Weather.asmx?wsdl"
			         .split("\\s+"));
		} catch (Throwable e) {
			e.printStackTrace();
		}

	}

}
