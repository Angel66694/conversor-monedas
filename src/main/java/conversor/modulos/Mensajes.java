package conversor.modulos;

public class Mensajes {
    public void mensaje(){
        String divisaSoportada = """
          *** Lista de divisas ***
************************************************|
AED	|AFN| ALL| AMD|	ANG| AOA| ARS| AUD|	AWG| AZN|
------------------------------------------------|	
BAM	|BBD| BDT| BGN|	BHD| BIF| BMD| BND|	BOB| BRL|
------------------------------------------------|	
BSD |BTN| BWP| BYN|	BZD| CAD| CDF| CHF|	CLP| CNY|	
------------------------------------------------|
COP	|CRC| CUP| CVE|	CZK| DJF| DKK| DOP|	DZD| EGP|
------------------------------------------------|	
ERN	|ETB| EUR| FJD|	FKP| FOK| GBP| GEL|	GGP| GHS|
------------------------------------------------|	
GIP	|GMD| GNF| GTQ|	GYD| HKD| HNL| HRK|	HTG| HUF|	
------------------------------------------------|
IDR	|ILS| IMP| INR|	IQD| IRR| ISK| JEP|	JMD| JOD|
------------------------------------------------|	
JPY	|KES| KGS| KHR|	KID| KMF| KRW| KWD|	KYD| KZT|	
------------------------------------------------|
LAK	|LBP| LKR| LRD| LSL| LYD| MAD| MDL| MGA| MKD|
------------------------------------------------|
MMK |MNT| MOP| MRU| MUR| MVR| MWK| MXN| MYR| MZN|
------------------------------------------------|
NAD |NGN| NIO| NOK| NPR| NZD| OMR| PAB| PEN| PGK|
------------------------------------------------|
PHP |PKR| PLN| PYG| QAR| RON| RSD| RUB| RWF| SAR|
------------------------------------------------|
SBD |SCR| SDG| SEK| SGD| SHP| SLE| SOS| SRD| SSP|
------------------------------------------------|
STN |SYP| SZL| THB| TJS| TMT| TND| TOP| TRY| TTD|
------------------------------------------------|
TVD |TWD| TZS| UAH| UGX| USD| UYU| UZS| VES| VND|
------------------------------------------------|
VUV |WST| XAF| XCD| XDR| XOF| XPF| YER| ZAR|    |
*************************************************
*** Si tienes alguna duda o no sabes que tipo de 
divisa deverias usar entra aqui: 
https://www.exchangerate-api.com/docs/supported-currencies
    
""";

        System.out.println(divisaSoportada);
    }

    public void menjaEntrada(){
        String mensajeBienvenida = """
                --------------------------------------------
                ***Bienvenido a mi convertidor***
                --------------------------------------------
                Tipos de cambio mas usados:
                - MX  - EUR - ARS - BRL
                - CLP - COP - USD - UYI
                """;
        System.out.println(mensajeBienvenida);
    }

    public void menuInicio(){
        String menu = """
                ***Selecciona la opción que requieras: ***
                ------------------------------------------
            
                1) Convertidor de divisas..
                2) Convertidor de temperatura..
                3) Lista completa de divisas disponibles..
                
                9) Salir
                
                """;

        System.out.println(menu);
    }
}

