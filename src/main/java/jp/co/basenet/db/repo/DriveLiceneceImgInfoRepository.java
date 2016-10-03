package jp.co.basenet.db.repo;

import java.util.List;

import jp.co.basenet.db.model.DriveLiceneceImgInfo;

import org.springframework.data.repository.CrudRepository;

public interface DriveLiceneceImgInfoRepository extends CrudRepository<DriveLiceneceImgInfo, Long> {

    List<DriveLiceneceImgInfo> findByCardNumber(String cardNumber);
    
}
