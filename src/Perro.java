









public class Perro extends Animal {
    
    
    
    
    
    public Perro(String nombre, String alimento, String raza, int edad) {
        super(nombre, alimento, raza, edad);
        
    }

    
    @Override
    public void animalFeed(){
        
        System.out.println("soy un perro y como "+alimento);
  
        
    }
    
    

    
    
    
    
}
