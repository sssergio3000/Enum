package animals;

public enum Animals {

    WOLF(10), FOX(5), RABBIT(3), HORSE(13), MONKEY(4);
    int age;
     Animals(int age){
        this.age = age;

    }
    public int getAge(){
         return this.age;
    }
    public String toString(){
         return this.name()+" age "+getAge();
    }

}
