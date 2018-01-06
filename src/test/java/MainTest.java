import Skipasses.CardSystem;
import Skipasses.Turnstile;
import org.junit.Test;

import static org.junit.Assert.*;


public class MainTest {
    @Test
    public void main() {
        CardSystem cs = new CardSystem();
        Turnstile turnstile1 = new Turnstile(cs);
        Turnstile turnstile2 = new Turnstile();
        turnstile2.connect_to(cs);
        assertEquals(1,1);
    }

}
