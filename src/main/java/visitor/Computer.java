package visitor;

/**
 * Created by V3790147 on 5/4/2016.
 */
public class Computer implements ComputerPart {

    ComputerPart[] computerParts;

    public Computer(){
        computerParts = new ComputerPart[]{ new Mouse(), new Monitor(), new Keyboard()};
    }

    public void accept(ComputerPartVisitor visitor) {

        for(int i=0;i<computerParts.length;i++){
            computerParts[i].accept(visitor);
        }

        visitor.visit(this);
    }

}
