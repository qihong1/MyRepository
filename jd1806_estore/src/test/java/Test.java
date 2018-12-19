

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import org.apache.ibatis.session.SqlSession;
import com.briup.bean.User;
import com.briup.common.MyBatisSqlSessionFactory;
import com.briup.dao.IUserDao;

class Test {

	@org.junit.jupiter.api.Test
	void test1() {
		SqlSession session=null;
		try {
			session = MyBatisSqlSessionFactory.openSession();
			IUserDao mapper = session.getMapper(IUserDao.class);
			User user = mapper.findUserByName("tom");
			System.out.println(user);
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
	}
	@org.junit.jupiter.api.Test
	void test2() {
		SqlSession session=null;
		try {
			session = MyBatisSqlSessionFactory.openSession();
			IUserDao mapper = session.getMapper(IUserDao.class);
			User user = new User("tom","123","238192","安徽省马鞍山市含山县","10086","tom@123.com");
			user.setDob(new Date());
			mapper.saveUser(user);
			
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
	}
}
