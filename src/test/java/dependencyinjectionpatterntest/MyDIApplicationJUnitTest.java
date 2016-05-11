package dependencyinjectionpatterntest;

import dependencyinjectionpattern.Consumer;
import dependencyinjectionpattern.MessageService;
import dependencyinjectionpattern.MessageServiceInjector;
import dependencyinjectionpattern.MyIDApplication;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by V3790147 on 5/11/2016.
 */
public class MyDIApplicationJUnitTest {
    private MessageServiceInjector injector;

    @Before
    public void setUp() {
        //mock the injector with anonymous class
        injector = new MessageServiceInjector() {
            public Consumer getConsumer() {
                return new MyIDApplication(new MessageService() {
                    public void sendMessage(String message, String receiver) {
                        System.out.println("Mock Message Service implementation" + message + " " + receiver);
                    }
                });
            }
        };
    }

    @Test
    public void test() {
        Consumer consumer = injector.getConsumer();
        consumer.processMessages("Hi Paul", "paul@example.com");
    }

    @After
    public void tear() {
        injector = null;
    }
}
