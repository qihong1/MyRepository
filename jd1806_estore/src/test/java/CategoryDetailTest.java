import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import com.briup.bean.Category;
import com.briup.bean.CategoryDetail;
import com.briup.common.MyBatisSqlSessionFactory;
import com.briup.dao.ICategoryDao;
import com.briup.dao.ICategoryDetailDao;

class CategoryDetailTest {

	@Test
	void test() {
		SqlSession session=null;
		try {
			session = MyBatisSqlSessionFactory.openSession();
			ICategoryDetailDao mapper = session.getMapper(ICategoryDetailDao.class);
			List<CategoryDetail> list = mapper.getCategoryDetailsByCategoryId(1);
			for (CategoryDetail categoryDetail : list) {
				System.out.println(categoryDetail);
			}
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
	}

	@Test
	void test1() {
		SqlSession session=null;
		try {
			session = MyBatisSqlSessionFactory.openSession();
			ICategoryDetailDao mapper = session.getMapper(ICategoryDetailDao.class);
			 /*List<CategoryDetail> listCategoryDetail = mapper.listCategoryDetail();
			for (CategoryDetail categoryDetail : listCategoryDetail) {
				System.out.println(categoryDetail.getName());
			}*/
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
	}
}
