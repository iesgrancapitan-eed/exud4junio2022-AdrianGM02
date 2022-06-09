package com.agm.examen.junio;

/**
 * Simula el comportamiento de una bicicleta
 * @author Adrian Gonzalez Martinez
 *
 */

class Byke implements Vehicle {  
  int speed;
  int gear;
  
  /**
   * Cambia el Gear 
   * @param int newGear
   */
    
  @Override
  public void changeGear(int newGear){     
      gear = newGear;
  }
  
  /**
   * Incrementa la velocidad 
   * @param int increment
   */
    
  
  @Override
  public void speedUp(int increment){
      speed = speed + increment;
  }
  
  /**
   * Disminuye la velocidad 
   * @param int decrement
   */
    
  @Override
  public void applyBrakes(int decrement){     
      speed = speed - decrement;
  }
  
  /**
   * Se consigue la velocidad
   * @return speed
   */
    
  @Override
  public int getSpeed() {
    return speed;
  }
  
  /**
   * Cambias la velocidad
   * @param int speed
   */


  @Override
  public void setSpeed(int speed) {
    this.speed = speed;
  }
  
  /**
   * Se consigue el gear
   * @return gear
   */


  @Override
  public int getGear() {
    return gear;
  }
  
  /**
   * Cambia el gear 
   * @param int increment
   */


  @Override
  public void setGear(int gear) {
    this.gear = gear;
  }
  
  /**
   * Devuelve una frase con la velocidad y el gear
   * 
   */


  @Override
  public void printStates() {
      System.out.println("speed: " + speed
          + " gear: " + gear);
  }
  
  
  /**
   * Incrementa la velocidad 
   * @return "Bicycle [speed=" + speed + ", gear=" + gear + "]"
   */


@Override
public String toString() {
	return "Bicycle [speed=" + speed + ", gear=" + gear + "]";
}
  
}

//class Bike implements Vehicle {
//    
//  int speed;
//  int gear;
//
//  @Override
//  public void changeGear(int newGear){
//        
//      gear = newGear;
//  }
//    
//  @Override
//  public void speedUp(int increment){
//        
//      speed = speed + increment;
//  }
//
// @Override
//  public void applyBrakes(int decrement){
//        
//      speed = speed - decrement;
//  }
//    
//  public void printStates() {
//      System.out.println("speed: " + speed
//          + " gear: " + gear);
//  } 
//}

//class GFG {
//    
//  public static void main (String[] args) {
//    
//      // creating an inatance of Bicycle
//      // doing some operations
//      Bicycle bicycle = new Bicycle();
//      bicycle.changeGear(2);
//      bicycle.speedUp(3);
//      bicycle.applyBrakes(1);
//        
//      System.out.println("Bicycle present state :");
//      bicycle.printStates();
//        
//      // creating instance of the bike.
//      Bike bike = new Bike();
//      bike.changeGear(1);
//      bike.speedUp(4);
//      bike.applyBrakes(3);
//        
//      System.out.println("Bike present state :");
//      bike.printStates();
//  }
//}