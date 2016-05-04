package visitor;

/**
 * Created by V3790147 on 5/4/2016.
 */
public class Client {

    public static void main(String[] args){
        ComputerPart computerPart = new Computer();
        computerPart.accept(new ComputerPartDisplayVisitor());
    }
}
