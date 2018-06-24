package dao;

import java.io.InputStream;

import pojo.User;

public class DaoTest {
	public class MyBatis_dao_test {
	    private SqlSessionFactory sqlSessionFactory;
	    @Before
	    public void init() throws IOException{
	      
	        String resource = "mybatis.cfg.xml";
	       
	        InputStream inputStream = Resources.getResourceAsStream(resource);
	       
	        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	    }
	    @Test
	    public void testFindUserById() throws Exception{
	        
	        Dao userDao = new DaoImp(sqlSessionFactory);
	        
	        User user = userDao.selectUserById(10);
	        
	        System.out.println(user);
	    }
	}

}
