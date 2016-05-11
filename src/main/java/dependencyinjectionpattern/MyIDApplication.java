package dependencyinjectionpattern;

/**
 * Created by V3790147 on 5/11/2016.
 */
public class MyIDApplication implements Consumer {

    private MessageService messageService;

    public MyIDApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessages(String message, String receiver) {
        //message validation, manipulation logic
        this.messageService.sendMessage(message, receiver);
    }
}
