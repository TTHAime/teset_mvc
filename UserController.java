import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Controller - จัดการการเชื่อมโยงระหว่าง Model และ View
public class UserController {
    private User model;
    private UserView view;

    public UserController(User model, UserView view) {
        this.model = model;
        this.view = view;

        this.view.addSubmitListener(new SubmitListener());
    }

    class SubmitListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String name = view.getNameInput();
            int age = view.getAgeInput();

            if (name.isEmpty() || age < 0) {
                view.setResult("Invalid input!");
                return;
            }

            model.setName(name);
            model.setAge(age);
            view.setResult("User: " + model.getName() + ", Age: " + model.getAge());
        }
    }
}
