package co.zhanglintc.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation used to declare a servlet filter.
 *
 * <p>This annotation is processed by the container at deployment time,
 * and the corresponding filter applied to the specified URL patterns,
 * servlets, and dispatcher types.
 * 
 * @see javax.servlet.Filter
 *
 * @since Servlet 3.0
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ohMyAnno {

    /**
     * The description of the filter
     * 
     * @return the description of the filter
     */
    String description() default "";

    /**
     * This is default option of the annotation
     * can be omitted when no other option is given
     *
     * The default value is an empty array.
     *
     * @return the URL patterns to which the filter applies
     */
    String[] value() default {};
}
