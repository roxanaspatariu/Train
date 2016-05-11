package dependencyinjectionpattern;

/**
 * Created by V3790147 on 5/11/2016.
 */
public class EmailServiceInjector implements MessageServiceInjector {
    public Consumer getConsumer() {
        return new MyIDApplication(new EmailMessageServiceImpl());
    }
}
