package lesson08.task;

import java.util.ArrayList;

public class Users {
    ArrayList<User> arrayList = new ArrayList<>();

    public ArrayList<User> getArrayList() {
        return arrayList;
    }

    public void addUser(User user) {
        arrayList.add(user);
    }

    public User getUser(int indx) {
        return arrayList.get(indx);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (User u : arrayList) {
            sb.append(u.getName()).append((" ")).append(u.getAge()).append("\n");
        }
        return sb.toString();
    }
}