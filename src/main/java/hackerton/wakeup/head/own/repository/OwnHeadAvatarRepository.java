package hackerton.wakeup.head.own.repository;

import hackerton.wakeup.character.entity.CharacterId;
import hackerton.wakeup.head.own.entity.OwnHeadAvatar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OwnHeadAvatarRepository extends JpaRepository<OwnHeadAvatar, Long> {
    List<OwnHeadAvatar> findAllByCharacterId(CharacterId id);
}