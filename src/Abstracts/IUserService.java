package Abstracts;

import Entities.User;

public interface IUserService {
	void add(User user);
	void delete(User user);
	void update(User user);
}
