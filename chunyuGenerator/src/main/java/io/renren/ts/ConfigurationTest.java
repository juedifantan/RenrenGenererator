package io.renren.ts;

import io.renren.entity.TableEntity;
import io.renren.utils.RRException;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.lang.StringUtils;

/**
 * @author DN
 * @ClassName ConfigurationTest
 * @Description TODO
 * @date Create Date  2019/4/30 0030 下午 2:32
 * @Version 2.0
 */
public class ConfigurationTest {
    /**
     * 获取配置信息
     */
    public static Configuration getConfig() {
        try {
            return new PropertiesConfiguration("test.properties" );
        } catch (ConfigurationException e) {
            throw new RRException("获取配置文件失败，", e);
        }
    }

    public static void main(String[] args) {
        //配置信息
        Configuration config = getConfig();
        boolean hasBigDecimal = false;
        //表信息
        TableEntity tableEntity = new TableEntity();

        //表名转换成Java类名
        String company = config.getString("company");
        String tourist=config.getString("tourist");
        System.out.println(company+"--"+tourist);

    }

}
