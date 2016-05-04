package visitor;

/**
 * Created by V3790147 on 5/4/2016.
 */
public interface ComputerPart {

    public void accept(ComputerPartVisitor computerPartVisitor);

}
