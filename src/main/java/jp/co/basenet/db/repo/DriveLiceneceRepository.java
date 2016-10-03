package jp.co.basenet.db.repo;

import jp.co.basenet.db.model.DriveLicenece;

import org.springframework.data.repository.CrudRepository;

public interface DriveLiceneceRepository extends CrudRepository<DriveLicenece, Long> {

	/**
	 * 
	 * @param cardnumber my number card number
	 * @return mynumberの情報
	 */
	DriveLicenece findFirstByCardnumber(String cardnumber);
    
    long countByCardnumber(String cardnumber);
    
}
