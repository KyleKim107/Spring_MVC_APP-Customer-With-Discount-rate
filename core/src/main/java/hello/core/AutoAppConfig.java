package hello.core;

import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
// @Configuration annotation들을 제외한다 그러므로 여기선 AppConfig를 없앤다
@ComponentScan(
        basePackages = "hello.core.member",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes =
                Configuration.class))
public class AutoAppConfig {

//    @Bean(name = "memoryMemberRepository") // bean의 이름을 지정해주고 컨테이너에 넣어준다
//    MemberRepository memberRepository(){
//        return new MemoryMemberRepository();
//    }

}
