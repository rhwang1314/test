package dao;
import java.util.List;
import pojo.User;

public interface Dao {

    public void insertUser(User user) throws Exception;
   
    public void deleteUser(int id) throws Exception;
   
    public void updateUser (User user) throws Exception;
   
    
    public User selectUserById(int id) throws Exception;
  
    
    public List<User> selectAllUser() throws Exception;
    
    public List<User> selectUser(User user) throws Exception;
    
}