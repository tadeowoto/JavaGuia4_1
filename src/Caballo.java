




public class Caballo extends Animal {
    
    
    
    
    public Caballo(String nombre, String alimento, String raza, int edad) {
        super(nombre, alimento, raza, edad);
    }
    
    
    @Override
    public void animalFeed(){
        
        System.out.println("soy un caballo y como "+alimento);
    
    }
    
    
    
}
