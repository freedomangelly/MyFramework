package joke.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by hcDarren on 2017/9/10.
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface WXPayEntry {
    /**
     * 包名
     */
    String packageName();

    /**
     * 类的Class
     */
    Class<?> entryClass();
}
