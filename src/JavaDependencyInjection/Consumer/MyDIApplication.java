package JavaDependencyInjection.Consumer;

import JavaDependencyInjection.Service.MessageService;

public class MyDIApplication implements Consumer{

    private MessageService service;

    public MyDIApplication(MessageService svc){
        this.service=svc;
    }

    //setter dependency injection
//    public void setService(MessageService service) {
//        this.service = service;
//    }

    @Override
    public void processMessages(String msg, String rec){
        //do some msg validation, manipulation logic etc
        this.service.sendMessage(msg, rec);
    }

}
