package visitor;

/**
 * Created by V3790147 on 5/4/2016.
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    public void visit(Computer computer) {
        System.out.println("Dispaying computer");
    }


    public void visit(Keyboard keyboard) {
        System.out.println("Display keyboard");
    }


    public void visit(Mouse mouse) {
        System.out.println("Display mouse");
    }


    public void visit(Monitor monitor) {
        System.out.println("Display monitor");
    }
}
