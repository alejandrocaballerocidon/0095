import java.util.Random;
import java.util.ArrayList;

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
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        responses = new ArrayList();
        
        responses.add("Response 1");
        responses.add("Response 2");
        responses.add("Response 3");
        responses.add("Response 4");
        responses.add("Response 5");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        
        return responses.get(aleatorio.nextInt(responses.size()));
    }
}
