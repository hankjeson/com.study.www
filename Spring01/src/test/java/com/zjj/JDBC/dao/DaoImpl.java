package com.zjj.JDBC.dao;


import com.zjj.JDBC.entity.Stu;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import lombok.Data;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

@Data
public class DaoImpl  implements Dao{
   private JdbcTemplate jdbcTemplate;
   
	public void add() throws Exception {
		String sql = "insert into stu(name,password,age,email) values(?,?,?,?)";
        int count = jdbcTemplate.update(sql, "hfc", "123321", 23, "222@qq.com");
        System.out.println(count);
		
	}

	public void del() throws Exception {
		// TODO Auto-generated method stub
		String sql = "delete from stu where id=? ";
        int row = jdbcTemplate.update(sql, 2);
        System.out.println("删除了" + row + "条数据！！！");
	}

	public void update() throws Exception {
		// TODO Auto-generated method stub
		String sql = "update stu set name='小狗狗' where id=?";
        int row = jdbcTemplate.update(sql, 3);
        System.out.println("删除了" + row + "条数据！！！");
	}

	public void select() throws Exception {
		// TODO Auto-generated method stub
		String sql = "select *from stu";
        RowMapper<Stu> rowMapper = new BeanPropertyRowMapper<Stu>(Stu.class);
        List<Stu> list = jdbcTemplate.query(sql, rowMapper);
        for (Stu stu : list) {
            System.out.println(stu.getName() + "\t" + stu.getEmail());

        }
	}

}
