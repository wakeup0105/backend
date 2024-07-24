package hackerton.wakeup.member.entity.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ChangePasswordRequestDTO {
    @NotBlank
    private String email;

    @NotBlank(message = "비밀번호가 비어있습니다.")
    private String password;
    private String checkPassword;
}