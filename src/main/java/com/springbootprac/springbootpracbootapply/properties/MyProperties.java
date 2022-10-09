package com.springbootprac.springbootpracbootapply.properties;


import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties("my")
@ConstructorBinding
@Getter
public class MyProperties {
    private final Integer height;

    public MyProperties(Integer height) {
        this.height = height;
    }

}
