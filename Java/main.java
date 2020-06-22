public class main {

    //Abstraction is used with an abstract class Voice.
    interface Voice {
        public String sayHi();
    }

    public static class Being implements Voice {
        public Being(String name) {
            this.name = name;
        }

        //Using encapsulation to hide access to variable
        private String name;

        public String sayHi() {
            return "Hello I am " + this.name + " and I am a " + this.getClass().getSimpleName();
        }

        //Encapsulation requires accessing private variables using get and set methods
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


    //Inheritance being used to extend the Being class
    public static class Human extends Being implements Voice {
        public Human(String name) {
            super(name);
        }
    }

    //Inheritance being used to extend the Being class
    public static class Cyborg extends Being implements Voice {
        public Cyborg(String name) {
            super(name);
        }

        //Polymorphism is used to transform the method sayHi() into a different String
        public String sayHi() {
            return "Greetings, I am cyborg and my name is" + this.getName();
        }
    }


    public static void main(String[] args) {
        Human Wyl = new Human("Wyl");
        System.out.println(Wyl.sayHi());

        Cyborg Vision = new Cyborg("Vision");
        System.out.println(Vision.sayHi());
    }
}
