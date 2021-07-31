package anotacoes.annotation;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ValidaPessoa {
    String message() default "Tipo de pessoa inválido!";

}
