import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import app.*;
import app.Facebook;

class ExamenTest {
    //***********************METODO 1***************************
    @Test
    @DisplayName("9 Prueba de la devolucion correcta segun si es multiplo de 3")

    void DevolucionDLosMultiploD3() {
        
        String devolucion = Facebook.metodo1(9);
        assertEquals("Face", devolucion);
    }

    @Test
    @DisplayName("25 Prueba de la devolucion correcta segun si es multiplo de 5")

    void DevolucionDLosMultiploD5() {

        String devolucion = Facebook.metodo1(25);
        assertEquals("Book", devolucion);
    }

    @Test
    @DisplayName("30 Prueba de la devolucion correcta segun si es multiplo de 15")

    void DevolucionDLosMultiploD15(){

        String devolucion= Facebook.metodo1(30);
        assertEquals("Facebook", devolucion);
    }

    @Test
    @DisplayName("17 Prueba de la devolucion correcta segun si es multiplo de ninguno")

    void DevolucionDLosMultiploDNone(){

        String devolucion= Facebook.metodo1(17);
        assertEquals("17", devolucion);
    }
//*********************************************************
//**********************METODO 2***************************
    @Test
    @DisplayName("1,2,3 Prueba de la devolucion correcta segun el array dado")

    void DevolucionDLosMultiploDUnArray123(){
        int[] array = {1,2,3};
        String devolucion= Facebook.metodo2(array);
        assertEquals("1 2 Face ", devolucion);
    }

    
    @Test
    @DisplayName("6,10,30,2,19 Prueba de la devolucion correcta segun el array dado")

    void DevolucionDLosMultiploDUnArray61030219(){
        int[] array = {6,10,30,2,19};
        String devolucion= Facebook.metodo2(array);
        assertEquals("Face Book Facebook 2 19 ", devolucion);
    }

    @Test
    @DisplayName("Fallo en 6 Prueba de la devolucion correcta segun el array dado")

    void DevolucionDLosMultiploDUnArray46811(){
        int[] array = {4,6,8,11};
        String devolucion= Facebook.metodo2(array);
        assertNotEquals("4 6 8 11 ", devolucion);
    }

    @Test
    @DisplayName("4,6,8,11 Prueba de la devolucion correcta segun el array dado")

    void DevolucionDLosMultiploDUnArray46811PeroBien(){
        int[] array = {4,6,8,11};
        String devolucion= Facebook.metodo2(array);
        assertEquals("4 Face 8 11 ", devolucion);
    }
    //*********************************************************
}