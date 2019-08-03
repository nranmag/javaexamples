package clases;

public class Preguntas {
    
    String[] preguntas = {
      
        "1.- ¿De las siguientes opciones, cual nos muestra las instrucciones de como se debe de conectar un sistema?",
        "2.- ¿Qué tipos de cables existen en las celdas de pruebas para conectar los sistemas?",
        "3.- ¿Que debo de hacer cuando un Sistema que viene del área de ensamble presente un defecto?",
        "4.- ¿Cuáles de las siguientes áreas interactúan con el área de pruebas como proveedor?", 
        "5.- ¿De las siguientes operaciones  subraya las correctas que marca Duluth cuando terminan el proceso de pruebas un sistema?"
    };
    
    public String getPregunta(int posicion){
        return preguntas[posicion];
    }
}
