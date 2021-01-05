import java.rmi.*;
public interface myRemote extends Remote{
    public String sayHello() throws RemoteException;
}
