
abstract class WorkFlow {

    abstract void validatingOrder();
    abstract void processingPayment();
    abstract void  preparingDelivery();
    abstract void sendingNotifications();


    public final void template() {
        validatingOrder();
        processingPayment();
        preparingDelivery();
        sendingNotifications();
    }
}