package visitor;

import org.junit.Test;

/**
 * Created by V3790147 on 5/4/2016.
 */
public class VisitorTest {

    @Test
    public void visitorTest(){
        ComputerPart computerPart = new Computer();
        computerPart.accept(new ComputerPartDisplayVisitor());

    }
}
