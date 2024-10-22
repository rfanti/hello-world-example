/** 
 * package main;
 */ 
package main;

/**
 * import static org.junit.jupiter.api.Assertions.*;
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Classe de teste para a classe Bootstrapper.
 * 
 * Esta classe contém testes unitários para verificar o comportamento da classe Bootstrapper.
 */
public class BootstrapperTest {

    /**
     * Instância da classe Bootstrapper usada nos testes.
     */
    private Bootstrapper bootstrapper;

    /**
     * Configuração inicial antes de cada teste.
     * 
     * Este método é executado antes de cada método de teste para inicializar a instância da classe Bootstrapper.
     */
    @BeforeEach
    public void setUp() {
        bootstrapper = new Bootstrapper();
    }

    /**
     * Teste para verificar a inicialização da classe Bootstrapper.
     * 
     * Este teste verifica se a instância da classe Bootstrapper é inicializada corretamente.
     */
    @Test
    public void testInitialization() {
        assertNotNull(bootstrapper);
    }

    /**
     * Teste para verificar o método start da classe Bootstrapper.
     * 
     * Este teste verifica se o método start da classe Bootstrapper retorna verdadeiro indicando sucesso.
     */
    @Test
    public void testStart() {
        boolean result = bootstrapper.start();
        assertTrue(result, "Bootstrapper should start successfully");
    }

    /**
     * Teste para verificar o método stop da classe Bootstrapper.
     * 
     * Este teste verifica se o método stop da classe Bootstrapper retorna verdadeiro indicando sucesso.
     */
    @Test
    public void testStop() {
        bootstrapper.start(); // Start first to ensure it can be stopped
        boolean result = bootstrapper.stop();
        assertTrue(result, "Bootstrapper should stop successfully");
    }

    /**
     * Teste para verificar o método restart da classe Bootstrapper.
     * 
     * Este teste verifica se o método restart da classe Bootstrapper retorna verdadeiro indicando sucesso.
     */
    @Test
    public void testRestart() {
        bootstrapper.start(); // Start first to ensure it can be restarted
        boolean result = bootstrapper.restart();
        assertTrue(result, "Bootstrapper should restart successfully");
    }

}