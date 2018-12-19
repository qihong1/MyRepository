import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import com.briup.bean.Product;
import com.briup.common.MyBatisSqlSessionFactory;
import com.briup.dao.IProductDao;

class ProductTest {

	@Test
	void test() {
		SqlSession session=null;
		try {
			session = MyBatisSqlSessionFactory.openSession();
			IProductDao mapper = session.getMapper(IProductDao.class);
			List<Product> list = mapper.findAllProducts();
			for (Product p : list) {
				System.out.println(p.getName());
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
			IProductDao mapper = session.getMapper(IProductDao.class);
			Product product = mapper.getProductById(1);
			System.out.println(product.getName());
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
	}

}
