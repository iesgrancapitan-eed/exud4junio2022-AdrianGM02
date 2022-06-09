package com.agm.examen.junio;

/**
 * Interfaz que simula el comportamineto de un vehiculo
 * @author Adrian
 *
 */

interface Vehicle {

  void changeGear(int newGear);

  void speedUp(int increment);

  void applyBrakes(int decrement);

  int getSpeed();

  void setSpeed(int speed);

  int getGear();

  void setGear(int gear);

  void printStates();

}
