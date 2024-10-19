package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Classe de teste para a classe HelloWorld.
 */
class HelloTest {

    /**
     * Testa o método getHello() com o nome "José".
     */
    @Test
    void testGetHello() {
        HelloWorld hw = new HelloWorld("José");
        assertEquals("Hello world, José", hw.getHello());
    }

    /**
     * Testa o método getHello() com um nome diferente, "Maria".
     */
    @Test
    void testGetHelloWithDifferentName() {
        HelloWorld hw = new HelloWorld("Maria");
        assertEquals("Hello world, Maria", hw.getHello());
    }

    /**
     * Testa o método getHello() com um nome vazio.
     */
    @Test
    void testGetHelloWithEmptyName() {
        HelloWorld hw = new HelloWorld("");
        assertEquals("Hello world, ", hw.getHello());
    }

    /**
     * Testa o método getHello() com um nome nulo.
     */
    @Test
    void testGetHelloWithNullName() {
        HelloWorld hw = new HelloWorld(null);
        assertEquals("Hello world, null", hw.getHello());
    }

    /**
     * Testa o método getHello() com um nome inesperado para garantir que a saída não seja igual a um valor específico.
     */
    @Test
    void testGetHelloWithUnexpectedName() {
        HelloWorld hw = new HelloWorld("Carlos");
        assertNotEquals("Hello world, Maria", hw.getHello());
    }
}