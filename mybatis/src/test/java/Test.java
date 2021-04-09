import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.javassist.expr.NewArray;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.zjj.mybatis.pojo.User01;
public class Test {
	
	public static void main(String[] args) {
		
		String resources="SqlMapConfig.xml";
		try {
			InputStream inputStream=Resources.getResourceAsStream(resources);
		    SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		    
		    SqlSession session=sessionFactory.openSession(true);
		    
//		    List<User01> list=session.selectList("com.zjj.mybatis.mapper.selectAll", User01.class);
//		    
//		     for (User01 user01 : list) {
//				System.out.println(user01.getName()+"\t"+user01.getAge());
//			}
		    
		    
//		   User01 user01 = session.selectOne("com.zjj.mybatis.mapper.selectOne", 12);
//		   
//		   System.out.println(user01.getName());
		    
		    session.insert("com.zjj.mybatis.mapper.insertUser", new User01("hfc", 18, "男"));
		   
		    session.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
