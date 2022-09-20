package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {

    private final static UserService user = new UserServiceImpl();

    public static void main(String[] args) {

        user.createUsersTable();

        user.saveUser("Artem", "Danieljan", (byte) 26);
        user.saveUser("Alexandr", "Belov", (byte) 31);
        user.saveUser("Vladimir", "Serov", (byte) 51);
        user.saveUser("Svetlana", "Puhova", (byte) 19);

        for (User u : user.getAllUsers()) {
            System.out.println(u);
        }

        user.cleanUsersTable();

        user.dropUsersTable();
    }
}
