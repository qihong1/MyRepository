import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import com.briup.bean.Category;
import com.briup.common.MyBatisSqlSessionFactory;
import com.briup.dao.ICategoryDao;

class CategoryTest {

	@Test
	void test() {
		SqlSession session=null;
		try {
			session = MyBatisSqlSessionFactory.openSession();
			ICategoryDao mapper = session.getMapper(ICategoryDao.class);
			List<Category> list = mapper.findAllCategory();
			for (Category c : list) {
				System.out.println(c.getId()+" "+c.getName());
			}
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
	}

}
