package view.controller;

import beans.User;

public class ControllerManager {

    private WelcomeController welcomeController;
    private RegisterController registerController;
    private RegisterController1 registerController1;
    private RegisterController2 registerController2;
    private MainController mainController;
    private LoginController loginController;
    private User user;

    private static ControllerManager instance;

    public static ControllerManager getInstance() {
        if(instance == null)
            instance = new ControllerManager();
        return instance;
    }

    private ControllerManager(){}

    public WelcomeController getWelcomeController() {
        return welcomeController;
    }

    public void setWelcomeController(WelcomeController welcomeController) {
        this.welcomeController = welcomeController;
    }

    public RegisterController getRegisterController() {
        return registerController;
    }
    
    public RegisterController1 getRegisterController1() {
        return registerController1;
    }
    
    public RegisterController2 getRegisterController2() {
        return registerController2;
    }

    
    public void setRegisterController(RegisterController registerController) {
        this.registerController = registerController;
    }
    
    public void setRegisterController1(RegisterController1 registerController1) {
        this.registerController1 = registerController1;
    }
    
    public void setRegisterController2(RegisterController2 registerController2) {
        this.registerController2 = registerController2;
    }
    
    public MainController getMainController() {
        return mainController;
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    public LoginController getLoginController() {
        return loginController;
    }

    public void setLoginController(LoginController loginController) {
        this.loginController = loginController;
    }
}
