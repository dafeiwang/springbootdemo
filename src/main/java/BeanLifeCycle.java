
import com.smart.springbootdemo.model.Car;
import com.smart.springbootdemo.model.MyBeanPostProcessor;
import com.smart.springbootdemo.model.MyInstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

/**
 * Created by dafei on 9/5/2017.
 */
public class BeanLifeCycle {
    public static void main(String[] args) {
        Resource res = new ClassPathResource("beans.xml");

        BeanFactory bf = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader((BeanDefinitionRegistry) bf);
        reader.loadBeanDefinitions(res);

        ((ConfigurableBeanFactory)bf).addBeanPostProcessor(new MyBeanPostProcessor());

        ((ConfigurableBeanFactory)bf).addBeanPostProcessor(new MyInstantiationAwareBeanPostProcessor());

        Car car1 = (Car) bf.getBean("car");
        car1.introduce();
        car1.setColor("红色");

        Car car2 = (Car) bf.getBean("car");

        System.out.println("car1 == car2: " + (car1 == car2));

        ((ConfigurableBeanFactory) bf).destroySingletons();

    }
}
