public class Dog extends Mammal{


    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

        if(speed.equals("slow")){
            System.out.println(gerExplicitType() + " walking");
        }else{
            System.out.println(gerExplicitType() + " Running");
        }

    }

    @Override
    public void shedHair() {

        System.out.println(gerExplicitType() + " shed hair all the time");
    }

    @Override
    public void makeNoise() {

        if(type == "Wolf"){
            System.out.print("Howling! ");
        }else {
            System.out.print("Woof!");
        }
    }
}
