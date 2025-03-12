package ch01;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.Reader;

// 1. mybatis 의존성 추가
// 2. mybatis 설정 (xml, java)
// 3. mysql jdbc driver 의존성 추가
// 4. 위 설정한 mybatis xml 문서를 mybatis library 가 읽어서 처리하도록 코드 작성

// mybatis 는 SqlSession 을 통해서 DB 와 연동
public class Test {
    public static void main(String[] args) throws Exception {
        //mybatis 설정 파일을 읽고 정보는 저장하는 reader 객체 생성
        Reader  reader = Resources.getResourceAsReader("config/mybatis-config.xml");

        // SqlSessionFactory 를 Builder 패턴으로 생성
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        // SqlSession 객체를 Factory 패턴으로 생성
        SqlSession session = sqlSessionFactory.openSession();

        // mybatis 로 DB 연동 작업 진행

        session.close();
    }
}
