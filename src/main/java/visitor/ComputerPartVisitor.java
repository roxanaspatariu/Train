package visitor;

/**
 * Created by V3790147 on 5/4/2016.
 */
public interface ComputerPartVisitor {

    void visit(Computer computer);
    void visit(Keyboard keyboard);
    void visit(Mouse mouse);
    void visit(Monitor monitor);

}
