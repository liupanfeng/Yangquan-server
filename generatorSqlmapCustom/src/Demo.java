import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.yangquan.pojo.User;

public class Demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		User user = new User();
		// 获取f对象对应类中的所有属性域
		Field[] fields = user.getClass().getDeclaredFields();
		for (int i = 0, len = fields.length; i < len; i++) {
			// 对于每个属性，获取属性名
			PropertyDescriptor pd = new PropertyDescriptor(fields[i].getName(), user.getClass());
			Method getMethod = pd.getReadMethod();// 获得get方法
			getMethod.invoke(user);// 此处为执行该Object对象的get方法
			String varName = fields[i].getName();
			System.out.println(varName + "---" + getMethod.getName());
		}
	}

}