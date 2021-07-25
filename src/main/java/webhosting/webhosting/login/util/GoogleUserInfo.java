package webhosting.webhosting.login.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import webhosting.webhosting.user.domain.User;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GoogleUserInfo {
    private String sub;
    private String name;
    private String picture;

    public User toUser() {
        return new User(name, picture, sub);
    }
}
