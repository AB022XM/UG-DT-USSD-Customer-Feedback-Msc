package com.dsarena.corp.ussd.customerfeedback.security.jwt;

import com.dsarena.corp.ussd.customerfeedback.config.SecurityConfiguration;
import com.dsarena.corp.ussd.customerfeedback.config.SecurityJwtConfiguration;
import com.dsarena.corp.ussd.customerfeedback.config.WebConfigurer;
import com.dsarena.corp.ussd.customerfeedback.management.SecurityMetersService;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import tech.jhipster.config.JHipsterProperties;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(
    classes = {
        JHipsterProperties.class,
        WebConfigurer.class,
        SecurityConfiguration.class,
        SecurityJwtConfiguration.class,
        SecurityMetersService.class,
        JwtAuthenticationTestUtils.class,
    }
)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface AuthenticationIntegrationTest {
}
