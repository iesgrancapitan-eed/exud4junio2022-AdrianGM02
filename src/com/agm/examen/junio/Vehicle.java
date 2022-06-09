package com.agm.examen.junio;



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
