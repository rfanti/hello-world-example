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
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


/**
 * Classe de teste para a classe Bootstrapper.
 * 
 * Esta classe contém testes unitários para verificar o comportamento da classe Bootstrapper.
 */
class BootstrapperTest {

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
     * Este teste verifica se a instância da classe Bootstrapper inicializada corretamente.
     */
    @Test
    public void testInitialization() {
        assertNotNull(bootstrapper);
    }

    /**
     * Teste para verificar o método main da classe Bootstrapper.
     * 
     * Este teste verifica se o método main da classe Bootstrapper retorna verdadeiro indicando sucesso.
     */
    @Test
    public void testMain() {
        // Configura o fluxo de saída para capturar a impressão
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out; // Salva a saída original
        System.setOut(new PrintStream(outputStream));

        // Chama o método main da classe Bootstrapper
        Bootstrapper.main(new String[]{});

        // Restaura a saída original
        System.setOut(originalOut);

        // Verifica a saída capturada
        String expectedOutput = "Hello world, John\n"; // Verifique se a quebra de linha é a correta
        assertEquals(expectedOutput, outputStream.toString());
    }
}