/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo. La clase
Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego
un mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice
lo siguiente: 

*/




public class main {


    
    public static void main(String[] args) {
        
        Animal perro = new Perro ("Stich","Carne","Doberman",15);
        
        perro.animalFeed();
        
        Animal perro1 = new Perro ("Teddy","alimento balanceado","Doberman",155);
        
        perro1.animalFeed();
        
        Animal gato=new Gato("michi", "asado del vecino", "de la calle pa", 20);
        gato.animalFeed();
        
        Animal caballo=new Caballo("Benedetto", "pasto", "ni idea", 320);
       
        caballo.animalFeed();
       
       
        
        
    }
    
}
