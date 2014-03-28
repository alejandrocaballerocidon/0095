import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    Random aleatorio;
    ArrayList<String> responses;
    HashMap<String, String> respuestaPregunta;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        responses = new ArrayList();
        respuestaPregunta = new HashMap<String, String>();
        
        responses.add("Response 1");
        responses.add("Response 2");
        responses.add("Response 3");
        responses.add("Response 4");
        responses.add("Response 5");
        
        respuestaPregunta.put("servicio", "Nuestro software ofrece diversos servicios.");
        respuestaPregunta.put("plataformas", "Está diseñado para diversas plataformas.");
        respuestaPregunta.put("fallos", "Estamos solucionando los problemas, en un rato el servicio funcionará con normalidad.");
        respuestaPregunta.put("gratuito", "Actualmente disponemos de un software gratuito pero más limitado.");
        
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String userInput)
    {
        String response = null;
        response = respuestaPregunta.get(userInput);
        
        if (response == null){
            response = responses.get(aleatorio.nextInt(responses.size()));
        }
        
        return response;
    }
}
