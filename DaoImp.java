package dao;

import java.util.List;

import pojo.User;

public class DaoImp implements Dao {
	   private SqlSessionFactory sqlSessionFactory;
	     
	   public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
	       
	       this.sqlSessionFactory = sqlSessionFactory;
	    }

	@Override
	public void insertUser(User user) throws Exception {
		// TODO Auto-generated method stub
		 SqlSession sqlSession = sqlSessionFactory.openSession();
			
		 sqlSession.insert("UserMapper.insertUser", id);
			
		 sqlSession.commit();
			 
		 sqlSession.close();

	}

	@Override
	public void deleteUser(int id) throws Exception {
		// TODO Auto-generated method stub
	 SqlSession sqlSession = sqlSessionFactory.openSession();
		
	 sqlSession.insert("UserMapper.deleteUser", id);
		
	 sqlSession.commit();
		 
	 sqlSession.close();

	}

	@Override
	public void updateUser(User user) throws Exception {
		// TODO Auto-generated method stub
		 SqlSession sqlSession = sqlSessionFactory.openSession();
			
		 sqlSession.insert("UserMapper.updateUser", id);
			
		 sqlSession.commit();
			 
		 sqlSession.close();
	}

	@Override
	public User selectUserById(int id) throws Exception {
         SqlSession sqlSession = sqlSessionFactory.openSession();
         
         User user = sqlSession.selectOne("UserMapper.selectUserById", id);
         
         sqlSession.close();
         
         return user;
	}

	@Override
	public List<User> selectAllUser() throws Exception {
		// TODO Auto-generated method stub
        SqlSession sqlSession = sqlSessionFactory.openSession();
        
        List<User> list = sqlSession.selectOne("UserMapper.selectAllUser");
        
        sqlSession.close();
        
        return list;
	}

	@Override
	public List<User> selectUser(User user) throws Exception {
		// TODO Auto-generated method stub
        SqlSession sqlSession = sqlSessionFactory.openSession();
        
        List<User> list = sqlSession.selectOne("UserMapper.selectUser", user);
        
        sqlSession.close();
        
        return list;
	}

}
