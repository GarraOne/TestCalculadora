package calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestCalculadora {

    @Test
    void testGetVazio() {
        //Instancia um objeto da classe Calculadora
        Calculadora calculadora = new Calculadora();
        //Define o valor esperado para a operação
        double retornoEsperado = 0.0;
        //Chama a operacao getSoma()
        double retornoFeito = calculadora.getSoma();
        //Premissa verifica se os valores são iguais
        assertEquals(retornoEsperado, retornoFeito, 2);
    }

    @Test
    void testGetSoma() {
        //Instancia um objeto da classe Calculadora
        Calculadora calculadora = new Calculadora(4.0, 2.0);
        //Define o valor esperado para a operação
        double retornoEsperado = 6.0;
        //Chama a operacao getSoma()
        double retornoFeito = calculadora.getSoma();
        //Premissa verifica se os valores são iguais
        assertEquals(retornoEsperado, retornoFeito, 2);
    }

    @Test
    void testGetDiferenca() {
        //Instancia um objeto da classe Calculadora
        Calculadora calculadora = new Calculadora(4.0, 2.0);
        //Define o valor esperado para a operação
        double retornoEsperado = 2.0;
        //Chama a operacao getDiferenca()
        double retornoFeito = calculadora.getDiferenca();
        //Premissa verifica se os valores são iguais
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    @Test
    void testGetProduto() {
        //Instancia um objeto da classe Calculadora
        Calculadora calculadora = new Calculadora(4.0, 2.0);
        //Define o valor esperado para a operação
        double retornoEsperado = 8.0;
        //Chama a operacao getProduto()
        double retornoFeito = calculadora.getProduto();
        //Premissa verifica se os valores são iguais
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    @Test
    void testGetQuociente() {
        //Instancia um objeto da classe Calculadora
        Calculadora calculadora = new Calculadora(4.0, 2.0);
        //Define o valor esperado para a operação
        double retornoEsperado = 2.0;
        //Chama a operacao getQuociente()
        double retornoFeito = calculadora.getQuociente();
        //Premissa verifica se os valores são iguais
        assertEquals(retornoEsperado, retornoFeito, 0);
    }
    
    @Test
    void testGetExponencial() {
        //Instancia um objeto da classe Calculadora
        Calculadora calculadora = new Calculadora(2.0, 3.0);
        //Define o valor esperado para a operação
        double retornoEsperado = 8.0;
        //Chama a operacao getExponencial()
        double retornoFeito = calculadora.getExponencial();
        //Premissa verifica se os valores são iguais
        assertEquals(retornoEsperado, retornoFeito, 0);
    }
}
