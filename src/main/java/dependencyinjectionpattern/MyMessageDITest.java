package dependencyinjectionpattern;

/**
 * Created by V3790147 on 5/11/2016.
 */
public class MyMessageDITest {

    public static void main(String[] args){
        String message ="Hi Paul";
        String email = "paul@example.com";
        String phone="0775369289";
        MessageServiceInjector injector = null;
        Consumer app = null;

        //Send email
        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessages(message, email);

        //Send sms
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessages(message, phone);

    }
}
