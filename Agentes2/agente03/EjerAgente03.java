package agente03;
import jade.core.Agent;
/**
 *
 * @author areli
 */
public class EjerAgent03 extends Agent 
{
    protected void setup ()
    {
        comporta03 objAg = new comporta03();
        addBehaviour(objAg);
    }
}
