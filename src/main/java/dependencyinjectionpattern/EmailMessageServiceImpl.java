package dependencyinjectionpattern;

/**
 * Created by V3790147 on 5/11/2016.
 */
public class EmailMessageServiceImpl implements MessageService {
    public void sendMessage(String message, String receiver) {
        System.out.println("Email sent to " + receiver + "with message " + message);
    }
}
