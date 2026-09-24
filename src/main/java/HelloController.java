import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//这是一个接口类
@RestController
public class HelloController {
    //访问hello的时候会执行这个内容
    @GetMapping("/hello")
    public String hello(){
        return "Hello Spring Boot";
    }
}
