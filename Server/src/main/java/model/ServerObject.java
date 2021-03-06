package model;

import model.database.DatabaseUserOperation;
import model.database.FriendsDbOperationsImp;
import server.interfaces.ClientServerRegister;
import server.interfaces.FriendsDbOperations;
import server.interfaces.ServerMessegeSender;
import server.interfaces.ServerObj;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;


public class ServerObject extends UnicastRemoteObject implements ServerObj, Serializable {

    private ClientServerRegister clientServerRegister;
    private DatabaseUserOperation databaseUserOperation;
    private ServerMessegeSender serverMessegeSender;
    private FriendsDbOperations friendsDbOperations;
    private ServerFileTransferImpl serverFileTransferImpl;




    public ServerObject() throws RemoteException, SQLException, ClassNotFoundException {

        clientServerRegister = new ClientServerRegisterImp();
        databaseUserOperation = new DatabaseUserOperation();
        serverMessegeSender = new ServerMessageSenderImplementation();
        friendsDbOperations = new FriendsDbOperationsImp();
        serverFileTransferImpl = new ServerFileTransferImpl();
    }


    @Override
    public ClientServerRegister getClientServerRegister() {
        return clientServerRegister;
    }
    @Override
    public ServerMessegeSender getServerMessegeSender() {
        return serverMessegeSender;
    }
    @Override
    public FriendsDbOperations getFriendsDbOperations() throws RemoteException { return friendsDbOperations; }
    @Override
    public ServerFileTransferImpl getServerFileTransfer() { return serverFileTransferImpl; }

}
