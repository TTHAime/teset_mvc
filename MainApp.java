// Main - รันโปรแกรม
public class MainApp {
    public static void main(String[] args) {
        User model = new User("", 0);
        UserView view = new UserView();
        new UserController(model, view);
    }
}
