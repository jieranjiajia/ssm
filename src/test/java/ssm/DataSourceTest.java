package ssm;

import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.druid.pool.DruidDataSource;

public class DataSourceTest extends BaseTest {
	
	
	@Autowired
	private DruidDataSource dataSource;
	
	@Autowired
	private SqlSessionFactoryBean sqlSessionFactory;
	
	@Test
	public void test() {
		log.debug("测试数据源的连接：{}",dataSource.getInitialSize());
		log.debug("mybatis的会话工厂：{}",sqlSessionFactory);
	}
}
