class Animals {
  public void animalSound(){
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animals {
  public void animalSound(){
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animals {
  public void animalSound(){
    System.out.println("The dog says: bow bow");
  }
}

class Animal {
  public static void main(String[] args) {
    Animals myAnimals = new Animals();
    Animals myPig = new Pig();
    Animals myDog = new Dog();
    myAnimals.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}
