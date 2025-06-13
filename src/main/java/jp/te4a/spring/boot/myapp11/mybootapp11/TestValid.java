package jp.te4a.spring.boot.myapp11.mybootapp11;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = TestValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface TestValid {
    String param();
 String message() default "nput other than {param}.";
 // Classオブジェクトを得る（戻り値とする）メソッドgroups()
 // デフォルト値は空のクラス
 Class<?>[] groups() default {};
 // Payloadクラスを継承したClassオブジェクトを得る
 // （戻り値とする）メソッドpayload()、デフォルト値は空のクラス
 Class<? extends Payload>[] payload() default{};
}