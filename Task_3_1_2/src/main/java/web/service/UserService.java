package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    public void add(User user);

    public List<User> findAll();

    public User findOne(Integer id);

    public void update(Integer id, User user);

    public void delete(Integer id);
}
