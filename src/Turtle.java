public class Turtle extends Animal implements Swimable,Runable,Speakable{

    public Penguin(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }


    @Override
    public String toString() {
        return "Turtle" + super.toString();
    }

    @Override
    public int runSpeed() {
        return 0;
    }

    @Override
    public String speak() {
        return "brbrbrbrb";
    }

    @Override
    public int swimSpeed() {
        return 50;
    }
}
