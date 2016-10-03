package jp.co.basenet.db.repo;

import java.util.List;

import jp.co.basenet.db.model.MynumberImgInfo;

import org.springframework.data.repository.CrudRepository;

public interface MynumberImgInfoRepository extends CrudRepository<MynumberImgInfo, Long> {

    List<MynumberImgInfo> findByCardNumber(String cardNumber);
    
}
