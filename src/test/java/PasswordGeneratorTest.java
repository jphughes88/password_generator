/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.assertj.core.api.Assertions.assertThat;

public class PasswordGeneratorTest {
    @Test public void checkSecretPassword() {
        String secretPassword = "";

        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        assertThat(bCryptPasswordEncoder.matches(secretPassword,
                "$2a$10$N43LdqU9b1ZMuZM2KiBnIeaXiPqxYcTEVoMFabb9ZV2jfG82jupD6"))
                .isTrue();
    }
}
