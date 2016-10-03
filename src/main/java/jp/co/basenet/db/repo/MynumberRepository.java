package jp.co.basenet.db.repo;

import jp.co.basenet.db.model.Mynumber;

import org.springframework.data.repository.CrudRepository;

public interface MynumberRepository extends CrudRepository<Mynumber, Long> {

	/**
	 * @param cardnumber my number card number
	 * @return mynumberの情報
	 */
    Mynumber findFirstByCardnumber(String cardnumber);
    
    long countByCardnumber(String cardnumber);
    
}
