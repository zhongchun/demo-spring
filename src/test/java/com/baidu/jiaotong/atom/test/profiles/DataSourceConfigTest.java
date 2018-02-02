/**
 * @Title: DataSourceConfigTest.java
 * @Desc: TODO
 * @Package: com.baidu.jiaotong.atom.profiles
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年1月31日 下午8:13:51
 * @version 1.0
 */
package com.baidu.jiaotong.atom.test.profiles;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baidu.jiaotong.atom.profiles.DataSourceConfig;

/**
 * ClassName: DataSourceConfigTest
 * 
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年1月31日 下午8:13:51
 * @version 1.0
 */
public class DataSourceConfigTest {

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(classes = DataSourceConfig.class)
    @ActiveProfiles("dev")
    public static class DevDataSourceTest {

        @Autowired
        private DataSource dataSource;

        @Test
        public void shouldBeEmbeddedDataSource() {
            assertNotNull(dataSource);
            JdbcTemplate jdbc = new JdbcTemplate(dataSource);
            List<String> results = jdbc.query("SELECT id, name FROM Things", new RowMapper<String>() {

                @Override
                public String mapRow(ResultSet rs, int rowNum) throws SQLException {
                    return rs.getLong("id") + ":" + rs.getString("name");
                }
            });
            assertEquals(1, results.size());
            assertEquals("1:A", results.get(0));
        }

    }

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(classes = DataSourceConfig.class)
    @ActiveProfiles("prod")
    public static class ProductionDataSourceTest {

        @Autowired
        private DataSource dataSource;

        @Test
        public void shouldBeEmbeddedDataSource() {
            assertNull(dataSource);
        }

    }

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration("classpath:datasource-config.xml")
    @ActiveProfiles("dev")
    public static class DevDataSourceTest_XMLConfig {

        @Autowired
        private DataSource dataSource;

        @Test
        public void shouldBeEmbeddedDataSource() {
            assertNotNull(dataSource);
            JdbcTemplate jdbc = new JdbcTemplate(dataSource);
            List<String> results = jdbc.query("SELECT id, name FROM Things", new RowMapper<String>() {

                @Override
                public String mapRow(ResultSet rs, int rowNum) throws SQLException {
                    return rs.getLong("id") + ":" + rs.getString("name");
                }
            });
            assertEquals(1, results.size());
            assertEquals("1:A", results.get(0));
        }
    }

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration("classpath:datasource-config.xml")
    @ActiveProfiles("prod")
    public static class ProductionDataSourceTest_XMLConfig {
        @Autowired(required = false)
        private DataSource dataSource;

        @Test
        public void shouldBeEmbeddedDatasource() {
            // should be null, because there isn't a datasource configured in JNDI
            assertNull(dataSource);
        }
    }

}
