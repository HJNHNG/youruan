import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GeneratorTest {

    public static void main(String[] args)throws Exception {
        List<String> warnings=new ArrayList<String>();
        boolean overWriter=true;
        //指向配置文件　　
        File configFile=new File("C:\\Users\\HJNHNG\\Desktop\\youruan\\src\\main\\resources\\generatorConfig.xml");
        ConfigurationParser cp=new ConfigurationParser(warnings);
        Configuration config=cp.parseConfiguration(configFile);
        DefaultShellCallback callback=new DefaultShellCallback(overWriter);
        MyBatisGenerator myBatisGenerator=new MyBatisGenerator(config,callback,warnings);
        myBatisGenerator.generate(null);
    }
}