public class SyntaxLecture {

    public static void main(String[] args){

        String animal = "Dog";
        String Breed = "ShibaDoodle";
        byte weight;
        int heavyweight;
        boolean cuteOrNot = false;
        cuteOrNot = true;
        String name = "monsterTurtle";
        System.out.println(name + " is a " + Breed);

        char mOrF = 'M';

        long phoneNumber = 12108545555L;

        float  lengthInInches = 32.7F;

        if (cuteOrNot) {
            System.out.println(name + " is cute");
        } else {
            System.out.println(name + " is mean");
        }
        weight = (byte) 140;

//        if (weight > 30) {
//            System.out.println(name + " goes WOOF");
//        } else {
//            System.out.println( name + " goes yip");
//        }
//        System.out.println(name + "'s phone number is " + phoneNumber);

        System.out.println(name + " weighs " + weight + " pounds.");
    }
}
