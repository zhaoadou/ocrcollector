package jp.co.basenet.db.repo;

import jp.co.basenet.db.model.MynumberCard;

import org.springframework.data.repository.CrudRepository;

public interface MynumberCardRepository extends CrudRepository<MynumberCard, Long> {

	/**
	 * 
	 * @param cardnumber my number card number
	 * @return mynumberの情報
	 */
    MynumberCard findFirstByCardnumber(String cardnumber);
    
    long countByCardnumber(String cardnumber);
    
}
