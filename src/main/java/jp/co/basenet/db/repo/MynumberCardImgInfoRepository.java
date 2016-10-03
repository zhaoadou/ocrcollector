package jp.co.basenet.db.repo;

import java.util.List;

import jp.co.basenet.db.model.MynumberCardImgInfo;

import org.springframework.data.repository.CrudRepository;

public interface MynumberCardImgInfoRepository extends CrudRepository<MynumberCardImgInfo, Long> {

    List<MynumberCardImgInfo> findByCardNumber(String cardNumber);
    
}
