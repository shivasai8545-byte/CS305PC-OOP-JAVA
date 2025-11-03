import java.lang.annotations.*;

@Target(ElementType.TYPE)
@Retention(retentionPolicy.RUNTIME)

@interface MyAnno{
	String usage() default"dip dip dip";
}
