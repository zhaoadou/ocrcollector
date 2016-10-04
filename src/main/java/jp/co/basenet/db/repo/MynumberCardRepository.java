package jp.co.basenet.db.repo;

import jp.co.basenet.db.model.Mynumbercard;

import org.springframework.data.repository.CrudRepository;

public interface MynumberCardRepository extends CrudRepository<Mynumbercard, Long> {

	/**
	 * 
	 * @param cardnumber my number card number
	 * @return mynumberの情報
	 */
    Mynumbercard findFirstByCardnumber(String cardnumber);
    
    long countByCardnumber(String cardnumber);
    
}
