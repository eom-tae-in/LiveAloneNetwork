package capstone.LIveAloneNetwork.dto.member;

import com.capstone.liveAloneComunity.entity.member.Member;
import com.querydsl.core.annotations.QueryProjection;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberResponseDto {

    @Builder
    @QueryProjection
    public MemberResponseDto(long id, String username, String nickname, String email) {
        this.id = id;
        this.username = username;
        this.nickname = nickname;
        this.email = email;
    }

    private long id;
    private String username;
    private String nickname;
    private String email;

    public static MemberResponseDto toDto(Member member){
        return MemberResponseDto.builder()
                .id(member.getId())
                .username(member.getUsername())
                .nickname(member.getNickname())
                .email(member.getEmail()).build();
    }
}