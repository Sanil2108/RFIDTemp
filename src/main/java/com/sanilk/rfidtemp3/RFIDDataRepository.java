package com.sanilk.rfidtemp3;

import com.sanilk.rfidtemp3.models.RFIDData;
import org.springframework.data.repository.CrudRepository;

public interface RFIDDataRepository extends CrudRepository<RFIDData, Integer> {
}
