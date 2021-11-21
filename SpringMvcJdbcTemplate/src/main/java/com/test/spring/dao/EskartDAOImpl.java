package com.test.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.test.spring.model.Contact;
import com.test.spring.model.Product;

/**
 * An implementation of the ContactDAO interface.
 * @author www.codejava.net
 *
 */
public class EskartDAOImpl implements EskartDAO {

	private JdbcTemplate jdbcTemplate;
	
	public EskartDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	
	@Override
	public List<Product> getAllProducts() {
		String sql = "SELECT * FROM products";
		List<Product> listProducts = jdbcTemplate.query(sql, new RowMapper<Product>() {

			@Override
			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
				Product product = new Product();
				product.setProductId(rs.getInt("product_id"));
				product.setProductTitle(rs.getString("product_title"));
				product.setProductPrice(rs.getDouble("product_price"));
				product.setProductQuantity(rs.getInt("product_price"));
				product.setProductDesripton(rs.getString("product_desc"));
				return product;
			}

			
		});
		return listProducts;
	}

}
