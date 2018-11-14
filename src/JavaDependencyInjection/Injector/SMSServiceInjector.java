package JavaDependencyInjection.Injector;

import JavaDependencyInjection.Consumer.Consumer;
import JavaDependencyInjection.Consumer.MyDIApplication;
import JavaDependencyInjection.Service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new SMSServiceImpl());
    }

}
