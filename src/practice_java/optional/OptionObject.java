package practice_java.optional;

import java.util.Optional;

public class OptionObject {
    String str = "sss";
    Optional<String> optional1 = Optional.of(str);
    Optional<String> optional2 = Optional.of("value");
    //불가능 null exception 발생
    Optional<String> optional3 = Optional.of(null);
    //가능
    Optional<String> optional4 = Optional.ofNullable(null);

    String str1 = optional1.get();   // optional 에 저장된 값 반환 null 일 경우 예외발생
    String str2 = optional1.orElse(""); // 저장된 값이 null 일 경우 "" 를 반환
    String str3 = optional1.orElseGet(String::new);//람다식 사용가능 () - > new String()
    String str4 = optional1.orElseThrow(NullPointerException::new); //널이면 예외발생 람다식 사용 가능


}
