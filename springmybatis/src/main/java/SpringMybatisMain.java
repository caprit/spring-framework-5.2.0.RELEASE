import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;

public class SpringMybatisMain {

	public static void main(String[] args) {
		try {
			SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate((SqlSessionFactory) new SqlSessionFactoryBean().getObject());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
