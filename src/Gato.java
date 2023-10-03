








public class Gato extends Animal {
    
    public Gato(String nombre, String alimento, String raza, int edad) {
        super(nombre, alimento, raza, edad);
    }
    

    @Override
    public void animalFeed(){
        
        System.out.println("soy un gato y como "+alimento);
  
        
    }
    
}
