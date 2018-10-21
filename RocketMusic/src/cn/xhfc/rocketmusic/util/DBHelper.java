package cn.xhfc.rocketmusic.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBHelper {
	public static SqlSession getSession() {
		String config="mybatis.xml";
		InputStream is=null;
		SqlSession session=null;
		try {
			is = Resources.getResourceAsStream(config);
			SqlSessionFactory ssFactory=new SqlSessionFactoryBuilder().build(is);
			session=ssFactory.openSession();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return session;
	}
}
